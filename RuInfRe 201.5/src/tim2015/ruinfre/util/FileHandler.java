package tim2015.ruinfre.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

import tim2015.ruinfre.model.Attribute;
import tim2015.ruinfre.model.Entity;

/**
 * Pomocna klasa za I/O rad sa fajlovima
 * 
 * @author Aleksandar
 *
 */
public class FileHandler {

	/**
	 * Metod koji sortira fajl izabranog entiteta.
	 * 
	 * @param ent
	 * @throws IOException
	 */

	/*
	 * public static void sort(Entity ent) throws IOException {
	 * 
	 * int rows = entries(ent);
	 * 
	 * Entry[] table = new Entry[rows];
	 * 
	 * File file = new File(switchType(ent.getFile(), ent.getExtensions()[1]));
	 * 
	 * ent.addAccessed();
	 * 
	 * FileInputStream fis = new FileInputStream(file);
	 * 
	 * int attributesCount = ent.getAttributes().size();
	 * 
	 * int leftKey = 0; int rightKey = ent.rowLength();
	 * 
	 * for (int i = 0; i < attributesCount; i++) { if
	 * (ent.getAttributes().get(i).isPrimaryKey()) { break; } else { leftKey +=
	 * ent.getAttributes().get(i).getLength(); } }
	 * 
	 * for (int i = attributesCount - 1; i >= 0; i--) { if
	 * (ent.getAttributes().get(i).isPrimaryKey()) { break; } else { rightKey -=
	 * ent.getAttributes().get(i).getLength(); } }
	 * 
	 * int len = ent.rowLength() + 2;
	 * 
	 * for (int j = 0; j < rows; j++) {
	 * 
	 * char[] word = new char[len];
	 * 
	 * for (int k = 0; k < len; k++) {
	 * 
	 * word[k] = (char) fis.read();
	 * 
	 * }
	 * 
	 * table[j] = new Entry(new String(word), leftKey, rightKey);
	 * 
	 * }
	 * 
	 * fis.close();
	 * 
	 * Arrays.sort(table);
	 * 
	 * Writer writer = new BufferedWriter(new OutputStreamWriter(new
	 * FileOutputStream(file))); for (Entry e : table) {
	 * writer.write(e.getText()); }
	 * 
	 * writer.close(); }
	 */

	/**
	 * Ucitava atribute iz fajla u postojeci entitet.
	 * 
	 * @param ent
	 * @throws IOException
	 */

	public static void loadAttributes(Entity ent) throws IOException {
		Entity newLoad = loadEntity(ent.getFile());

		for (Attribute a : newLoad.getAttributes()) {
			ent.addChild(a);
		}

	}

	/**
	 * Ucitava atribute iz fajla. Delimicno je otporan je na greske u fajlu.
	 * Automatski detektuje i ucitava sve tipove datoteka.
	 * 
	 * @param fullFile
	 *            Putanja fajla koji se ucitava
	 * @return Entitet sa atributima
	 * @throws IOException
	 * 
	 */
	public static Entity loadEntity(String fullFile) throws IOException {

		File file = new File(fullFile);

		String tip = null;
		switch (file.getName().substring(file.getName().length() - 3)) {
		case "ser":
			tip = "Serijska";
			break;
		case "sek":
			tip = "Sekvencijalna";
			break;
		case "ind":
			tip = "Indeks Sekvencijalna";
			break;
		}

		FileInputStream fis = new FileInputStream(file);

		boolean hasNext = true;

		boolean flagField = false;
		boolean flagNewLine = false;
		int currentField = 0;

		Attribute currentAttribute = null;
		ArrayList<Attribute> attributes = new ArrayList<>();

		String word = null;

		int[] wordBuffer = new int[128];
		int ptr = 0;

		while (hasNext) {

			int next = fis.read();

			if (next == -1) {
				hasNext = false;
				break;
			}

			char nextch = (char) next;

			if (

			nextch == '/' || nextch == '\n' || nextch == '\r'

			) {

				String temp = getWord(ptr, wordBuffer);

				if (temp == null || temp.isEmpty()) {

				} else {
					word = temp;
					ptr = 0;
				}

				if (flagNewLine) {
					/*
					 * if (word.equals("path")){ flagPath = true; continue; }
					 */

					if (word.equals("field")) {
						flagField = true;
						currentAttribute = new Attribute();
						attributes.add(currentAttribute);
						currentField = 0;
						continue;
					}
					flagNewLine = false;
				}

				if (nextch == '/' || nextch == '\r') {
					if (flagField) {
						switch (currentField) {
						case 0:
							currentAttribute.setName(word);
							currentAttribute.setKey(word);
							break;
						case 1:
							currentAttribute.setType(word);
							break;
						case 2:
							currentAttribute.setLength(Integer.parseInt(word));
							break;
						case 3:
							currentAttribute.setPrimaryKey(Boolean.parseBoolean(word));

							break;
						}
						currentField++;

					} else {
						// throw new SyntaxException(curln+"");
					}
				}

				if (nextch == '\n' || nextch == '\r') {
					flagNewLine = true;
					flagField = false;
				}

			} else {
				wordBuffer[ptr++] = next;
			}

		}

		fis.close();

		String name = file.getName().substring(0, file.getName().length() - 4);

		Entity ent = new Entity(name, tip, fullFile);

		for (Attribute a : attributes) {
			ent.addChild(a);
		}

		return ent;
	}

	/**
	 * metoda za privatnu upotrebu
	 * 
	 * @param ptr
	 * @param wordBuffer
	 * @return
	 */
	private static String getWord(int ptr, int[] wordBuffer) {
		char[] wordArray = new char[ptr];
		for (int i = 0; i < ptr; i++) {
			wordArray[i] = (char) wordBuffer[i];
		}
		String word = new String(wordArray);
		return word;
	}

	/**
	 * Ucitava blok podataka iz fajla, kako su oni fizicki locirani u fajlu.
	 * 
	 * @param offset
	 *            Prvi red kojis e ucitava
	 * @param rows
	 *            Koliko redova se ucitava. 1 ako hoces 1 red
	 * @param ent
	 *            Entitet sa kojim radimo
	 * @return tabela potrebna za TableView Vraca stringove
	 * @throws IOException
	 */
	public static Object[][] loadPhysicalBlock(int offset, int rows, Entity ent) throws IOException {

		int size = entries(ent);

		int left = size - offset;

		if (left < rows)
			rows = Math.max(0, left);

		if (rows == 0) {
			return new Object[0][ent.getAttributeCount()];
		}

		Object[][] table = new String[rows][ent.getAttributeCount()];

		File file = new File(switchType(ent.getFile(), ent.getExtensions()[1]));

		ent.addAccessed();

		FileInputStream fis = new FileInputStream(file);

		fis.skip(offset * (ent.rowLength() + 2));

		for (int j = 0; j < rows; j++) {

			int attributesCount = ent.getAttributes().size();

			for (int k = 0; k < attributesCount; k++) {

				Attribute a = ent.getAttributes().get(k);

				int attributeLength = a.getLength();

				char[] word = new char[attributeLength];

				for (int i = 0; i < attributeLength; i++) {
					word[i] = (char) fis.read();
				}

				if (!ent.getAttributes().get(k).getType().equals("TYPE_CHAR")) {
					table[j][k] = new String(word).trim();

				} else {
					table[j][k] = new String(word);

				}
			}

			/**
			 * ovo pokriva \n i \r, na linuxu bi bilo samo jedna
			 */

			fis.read();
			fis.read();
		}

		fis.close();
		return table;

	}

	/**
	 * Vrsi konverziju izmedju fajlova
	 * 
	 * @param file
	 *            fajl tipa ser, sek ili ind
	 * @param ext
	 *            ekstenzija koja se nadovezuje
	 * @return putanja trazenog fajla
	 */
	public static String switchType(String file, String ext) {
		if (file.toCharArray()[file.length() - 4] == '.')
			return file.substring(0, file.length() - 3) + ext;
		if (file.toCharArray()[file.length() - 5] == '.')
			return file.substring(0, file.length() - 4) + ext;
		return file;

	}

	/**
	 * Ovime se proverava koliko redova ima u bazi podataka
	 * 
	 * @param ent
	 *            entitet koji se proverava
	 * @return broj redova
	 * @throws IOException
	 */
	public static int entries(Entity ent) {
		File file = new File(switchType(ent.getFile(), ent.getExtensions()[1]));

		return (int) (file.length() / (ent.rowLength() + 2));
	}

	/**
	 * Ucitava ceo fajl kao string.
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public static String loadFile(String path) throws IOException {
		byte[] bytes = Files.readAllBytes(Paths.get(path));
		return new String(bytes, Charset.defaultCharset());
	}

	// public static boolean addRecord2(E)

	/**
	 * Prosledjuje se red u tabeli koji treba biti modifikovan
	 * 
	 * @param entity
	 *            - Entitet u koji se dodaje Attribute
	 * @param redKojiSeDodaje
	 *            - niz stringova koji pisu u tom novo redu
	 * @return - true - dodavanje uspesno, false - atribut vec postoji
	 * @throws Exception
	 */
	public static boolean addRecord(Entity entity, String[] redKojiSeDodaje) throws Exception {
		String[] jedanRed = (String[]) loadPhysicalBlock(0, 1, entity)[0]; // prvi
		// red
		int n = entity.getAttributeCount();
		; // duzina jednog reda u tabeli
		if (n != redKojiSeDodaje.length) {
			throw new Exception("Duzina reda u tabeli je " + n + " A ti dodajes red duzine " + redKojiSeDodaje.length);
		}
		int primaryCount = 0;
		for (int j = 0; j < n; j++) {
			Attribute a = entity.getAttributes().get(j);
			if (a.isPrimaryKey()) {
				primaryCount++;

			}
		}
		// sadrzi kljuc novog record-a
		String[] kljucRecord = new String[primaryCount];
		// sadrzace kljuc jednog reda iz fajla
		String[] kljucSaDiska = new String[primaryCount];
		primaryCount = 0; // sluzice kao brojac indeksa kljuca
		for (int j = 0; j < n; j++) {
			Attribute a = entity.getAttributes().get(j);
			if (a.isPrimaryKey()) {
				kljucRecord[primaryCount] = redKojiSeDodaje[j];
				primaryCount++;

			}
		}
		primaryCount = 0; // sluzice kao brojac indeksa kljuca

		File f = new File(entity.getFile().substring(0, entity.getFile().length() - 3) + "stxt");
		int brojLinijaFajla = 0; // broj linija fajla
		BufferedReader br = new BufferedReader(new FileReader(f));
		String s = br.readLine();

		while (s != null) {
			brojLinijaFajla++;
			s = br.readLine();
		}
		br.close();

		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		RandomAccessFile rafStari = new RandomAccessFile(f, "rw");
		String rafString = "";
		String rafStringStari = "";
		// ako bude index out of bounds, smanji duzinaFajla za 1
		//System.out.println("br linija: " + brojLinijaFajla);
		for (int i = 0; i < brojLinijaFajla-1; i++) {

			// kad god procitam jedanRed, moram da pomerim i file pointer u
			// raf-u
			System.out.println("Iteracija u kojoj pukne: " + i);
			rafString = raf.readLine(); // ovaj je 1 ispred starog
			jedanRed = (String[]) loadPhysicalBlock(i, 1, entity)[0];
			primaryCount = 0;
			for (int j = 0; j < n; j++) {
				Attribute a = entity.getAttributes().get(j);
				if (a.isPrimaryKey()) {
					// u niz stringova koji predstavljaju kljuceve upisujem ono
					// sto pise u kljucu
					kljucSaDiska[primaryCount++] = jedanRed[j];
				}
			}
			primaryCount = 0;
			// Sada ih treba uporediti:
			int cmp = kljucRecord[primaryCount].compareTo(kljucSaDiska[primaryCount]);
			System.out.println(cmp);
			if (cmp == 0) {
				for (int k = 1; k < kljucRecord.length; k++) {
					cmp = kljucRecord[k].compareTo(kljucSaDiska[k]);
					System.out.println(cmp);
					if (cmp == 0) {
						if (k == kljucRecord.length - 1) {
							raf.close();
							rafStari.close();
							System.out.println("unos vec postoji, ne moze se dodati");
							return false;
						}
						// Stari treba da kasni za 1
						// Zato citam novi tek kad treba da prekinem for
						rafStringStari = rafStari.readLine();
						continue;
					} else if (cmp > 0) {
						primaryCount = k;
						// Stari treba da kasni za 1
						// Zato citam novi tek kad treba da prekinem for
						rafStringStari = rafStari.readLine();
						break;
					} else {
						// u sledeci red upisujem stari string
						// sve se pomera za po 1 mesto
						String tmp = "";
						int brAtributa = 0;
						for (String string : redKojiSeDodaje) {
							tmp += string;
							for (int z = (string.length()); z < entity.getAttributes().get(brAtributa)
									.getLength(); z++) {
								tmp += " ";
							}
							brAtributa++;
						}
						// na staro mesto stavim to sto korisnik unese
						rafStari.writeBytes(tmp);
						raf.writeBytes(rafStringStari);
						// u starom je treutni
						rafStringStari = rafString;
						// trenutni ide na sledeci
						rafString = raf.readLine();
						// samo da pomerim file pointer
						rafStari.readLine();
						String poslednjiRed = rafString;
						while (rafString != null) {
							// u stari upisujem trenutni
							rafStari.writeBytes(rafStringStari);
							// u starom je trentni
							rafStringStari = rafString;
							// trenutni ide na sledeci
							rafString = raf.readLine();
							// samo da pomerim file pointer
							rafStari.readLine();
							if (rafString != null) {
								poslednjiRed = rafString;
							}
						}
						System.out.println(poslednjiRed);
						System.out.println(poslednjiRed.length());
						// da povecam fajl za duzinu poslednjeg reda
						raf.setLength(raf.length() + poslednjiRed.getBytes(Charset.forName("UTF-8")).length);
						//rafStari.setLength(raf.length() + rafStringStari.getBytes(Charset.forName("UTF-8")).length);
						rafStari.close();
						raf.close();
						return true;
					}
				}
			} else if (cmp > 0) {
				// Stari treba da kasni za 1
				// Zato citam novi tek kad treba da prekinem for
				rafStringStari = rafStari.readLine();
				continue;
			} else {

				// u sledeci red upisujem stari string
				// sve se pomera za po 1 mesto
				String tmp = "";
				int brAtributa = 0;
				for (String string : redKojiSeDodaje) {
					tmp += string;
					for (int z = (string.length()); z < entity.getAttributes().get(brAtributa).getLength(); z++) {
						tmp += " ";
					}
					brAtributa++;
				}
				// na staro mesto stavim to sto korisnik unese
				rafStari.writeBytes(tmp);
				raf.writeBytes(rafStringStari);
				// u starom je treutni
				rafStringStari = rafString;
				// trenutni ide na sledeci
				rafString = raf.readLine();
				// samo da pomerim file pointer
				rafStari.readLine();
				String poslednjiRed = rafString;
				while (rafString != null) {
					// u stari upisujem trenutni
					rafStari.writeBytes(rafStringStari);
					// u starom je trentni
					rafStringStari = rafString;
					// trenutni ide na sledeci
					rafString = raf.readLine();
					// samo da pomerim file pointer
					rafStari.readLine();
					if (rafString != null) {
						poslednjiRed = rafString;
					}
				}
				System.out.println(poslednjiRed);
				System.out.println(poslednjiRed.length());
				// da povecam fajl za duzinu poslednjeg reda
				raf.setLength(raf.length() + poslednjiRed.getBytes(Charset.forName("UTF-8")).length);
				//rafStari.setLength(raf.length() + poslednjiRed.getBytes(Charset.forName("UTF-8")).length);
				rafStari.close();
				raf.close();
				return true;

			}
		}
		String tmp = "";
		int brAtributa = 0;
		for (String string : redKojiSeDodaje) {
			tmp += string;
			for (int z = (string.length()); z < entity.getAttributes().get(brAtributa).getLength(); z++) {
				tmp += " ";
			}
			brAtributa++;
		}
		System.out.println(rafString);
		System.out.println(rafStringStari);
		String poslednjiRed = rafString;
		// na staro mesto stavim to sto korisnik unese
		
		raf.setLength(raf.length() + poslednjiRed.getBytes(Charset.forName("UTF-8")).length);
		raf.writeBytes(tmp);
		//rafStari.setLength(raf.length() + poslednjiRed.getBytes(Charset.forName("UTF-8")).length);
		raf.close();
		rafStari.close();
		System.out.println("dodavanje na kraj");
		return true;

	}

	/**
	 * Prosledjuje se red u tabeli koji treba biti modifikovan
	 * 
	 * @param entity
	 *            - Entitet u kome se vrsi modifikacija
	 * @param redKojiSeDodaje
	 *            - red koji se menja
	 * @return - true - izmena uspesna, false - izmena neuspesna
	 * @throws Exception
	 */
	public static boolean updateRecord(Entity entity, String[] redKojiSeMenja, String[] noviRed) throws Exception {

		String[] jedanRed = (String[]) loadPhysicalBlock(0, 1, entity)[0]; // prvi
		// red
		int n = entity.getAttributeCount(); // duzina jednog reda u tabeli
		if (n != redKojiSeMenja.length) {
			throw new Exception(
					"Duzina reda u tabeli je " + n + " A ti modifikujes red duzine " + redKojiSeMenja.length);
		}
		int primaryCount = 0;
		for (int j = 0; j < n; j++) {
			Attribute a = entity.getAttributes().get(j);
			if (a.isPrimaryKey()) {
				primaryCount++;

			}
		}
		// sadrzi kljuc novog record-a
		String[] kljucRecord = new String[primaryCount];
		// sadrzace kljuc jednog reda iz fajla
		String[] kljucSaDiska = new String[primaryCount];
		primaryCount = 0; // sluzice kao brojac indeksa kljuca
		for (int j = 0; j < n; j++) {
			Attribute a = entity.getAttributes().get(j);
			if (a.isPrimaryKey()) {
				kljucRecord[primaryCount] = redKojiSeMenja[j];
				primaryCount++;

			}
		}
		primaryCount = 0; // sluzice kao brojac indeksa kljuca

		File f = new File(entity.getFile().substring(0, entity.getFile().length() - 3) + "stxt");
		int duzinaFajla = 0; // broj linija fajla
		BufferedReader br = new BufferedReader(new FileReader(f));
		String s = br.readLine();
		while (s != null) {
			duzinaFajla++;
			s = br.readLine();
		}
		br.close();

		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		RandomAccessFile rafStari = new RandomAccessFile(f, "rw");
		String rafString = "";
		String rafStringStari = "";
		// ako bude index out of bounds, smanji duzinaFajla za 1
		for (int i = 0; i < duzinaFajla; i++) {
			// kad god procitam jedanRed, moram da pomerim i file pointer u
			// raf-u
			rafString = raf.readLine(); // ovaj je 1 ispred starog
			jedanRed = (String[]) loadPhysicalBlock(i, 1, entity)[0];
			primaryCount = 0;
			for (int j = 0; j < n; j++) {
				Attribute a = entity.getAttributes().get(j);
				if (a.isPrimaryKey()) {
					// u niz stringova koji predstavljaju kljuceve upisujem ono
					// sto pise u kljucu
					kljucSaDiska[primaryCount++] = jedanRed[j];
				}
			}
			primaryCount = 0;
			// Sada ih treba uporediti:
			int cmp = kljucRecord[primaryCount].compareTo(kljucSaDiska[primaryCount]);
			if (cmp == 0) {
				for (int k = 1; k < kljucRecord.length; k++) {
					cmp = kljucRecord[k].compareTo(kljucSaDiska[k]);
					if (cmp == 0) {
						if (k == (kljucRecord.length - 1)) {
							// dosao si do reda koji treba da modifikujes
							String tmp = "";
							int brAtributa = 0;
							for (String string : noviRed) {
								tmp += string;
								for (int z = (string.length()); z < entity.getAttributes().get(brAtributa)
										.getLength(); z++) {
									tmp += " ";
								}
								brAtributa++;
							}
							raf.writeBytes(tmp);
							rafStari.close();
							raf.close();
							return true;

						}
						// Stari treba da kasni za 1
						// Zato citam novi tek kad treba da prekinem for
						rafStringStari = rafStari.readLine();
						continue;
					} else if (cmp > 0) {
						primaryCount = k;
						// Stari treba da kasni za 1
						// Zato citam novi tek kad treba da prekinem for
						rafStringStari = rafStari.readLine();
						break;
					} else {
						raf.close();
						rafStari.close();
						System.out.println("delete prekine u unutrasnjoj ");
						return false;
					}
				}
			} else if (cmp > 0) {
				// Stari treba da kasni za 1
				// Zato citam novi tek kad treba da prekinem for
				rafStringStari = rafStari.readLine();
				continue;
			} else {

				raf.close();
				rafStari.close();
				System.out.println("delete prekine u spoljasnjoj");
				return false;

			}
		}
		raf.close();
		rafStari.close();
		System.out.println("Prosao je kroz kod, nije dodao atribute, nesto nije u redu");
		return false;

	}

	/**
	 * Prosledjuje se red u tabeli koji treba biti obrisan
	 * 
	 * @param entity
	 *            - Entitet u koji se dodaje Attribute
	 * @param redKojiSeBrise
	 *            -
	 * @return - true - brisanje uspesno, false - brisanje bezuspesno
	 * @throws Exception
	 */
	public static boolean deleteRecord(Entity entity, String[] redKojiSeBrise) throws Exception {

		// MORA DA ISPISUJE OVO, JER INACE NE REDI
		// NE ZNAM ZASTO
		for (String string : redKojiSeBrise) {
			System.out.println(string);
		}
		String[] jedanRed = (String[]) loadPhysicalBlock(0, 1, entity)[0]; // prvi
		// red

		int n = entity.getAttributeCount(); // duzina jednog reda u tabeli
		if (n != redKojiSeBrise.length) {
			throw new Exception("Duzina reda u tabeli je " + n + " A ti brises red duzine " + redKojiSeBrise.length);
		}
		int primaryCount = 0;
		for (int j = 0; j < n; j++) {
			Attribute a = entity.getAttributes().get(j);
			if (a.isPrimaryKey()) {
				primaryCount++;

			}
		}
		// sadrzi kljuc novog record-a
		String[] kljucRecord = new String[primaryCount];
		// sadrzace kljuc jednog reda iz fajla
		String[] kljucSaDiska = new String[primaryCount];
		primaryCount = 0; // sluzice kao brojac indeksa kljuca
		for (int j = 0; j < n; j++) {
			Attribute a = entity.getAttributes().get(j);
			if (a.isPrimaryKey()) {
				kljucRecord[primaryCount] = redKojiSeBrise[j];
				primaryCount++;

			}
		}
		primaryCount = 0; // sluzice kao brojac indeksa kljuca

		File f = new File(entity.getFile().substring(0, entity.getFile().length() - 3) + "stxt");
		int duzinaFajla = 0; // broj linija fajla
		BufferedReader br = new BufferedReader(new FileReader(f));
		String s = br.readLine();
		while (s != null) {
			duzinaFajla++;
			s = br.readLine();
		}
		br.close();

		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		RandomAccessFile rafStari = new RandomAccessFile(f, "rw");
		String rafString = "";
		String rafStringStari = "";
		// ako bude index out of bounds, smanji duzinaFajla za 1
		for (int i = 0; i < duzinaFajla; i++) {
			// kad god procitam jedanRed, moram da pomerim i file pointer u
			// raf-u
			rafString = raf.readLine(); // ovaj je 1 ispred starog
			jedanRed = (String[]) loadPhysicalBlock(i, 1, entity)[0];
			primaryCount = 0;
			for (int j = 0; j < n; j++) {
				Attribute a = entity.getAttributes().get(j);
				if (a.isPrimaryKey()) {
					// u niz stringova koji predstavljaju kljuceve upisujem ono
					// sto pise u kljucu
					kljucSaDiska[primaryCount++] = jedanRed[j];
				}
			}
			primaryCount = 0;
			// Sada ih treba uporediti:
			int cmp = kljucRecord[primaryCount].compareTo(kljucSaDiska[primaryCount]);
			if (cmp == 0) {
				for (int k = 1; k < kljucRecord.length; k++) {
					cmp = kljucRecord[k].compareTo(kljucSaDiska[k]);
					if (cmp == 0) {
						if (k == (kljucRecord.length - 1)) {
							// dosao si do reda koji treba da obrises
							// TODO ako ne radi, skloni komentar sa linije
							// ispod
							rafString = raf.readLine();
							String poslednjiRed = rafString;
							while (rafString != null) {
								// u stari red upisujem sledeci
								rafStari.writeBytes(rafString);

								// trenutni ide na sledeci
								rafString = raf.readLine();
								// samo da pomerim file pointer
								rafStringStari = rafStari.readLine();
								if (rafString != null) {
									poslednjiRed = rafString;
									System.out.println(poslednjiRed);
								} 
							}
							
							// da skratim fajl za duzinu poslednjeg reda
							System.out
									.println((raf.length() - poslednjiRed.getBytes(Charset.forName("UTF-8")).length));
							System.out.println(raf.length());
							System.out.println(poslednjiRed.getBytes(Charset.forName("UTF-8")).length);
							
							//raf.setLength(
							//		(long) (raf.length() - poslednjiRed.getBytes(Charset.forName("UTF-8")).length));
							rafStari.setLength(
									(long) (raf.length() - poslednjiRed.getBytes(Charset.forName("UTF-8")).length));
							rafStari.close();
							raf.close();
							return true;

						}
						// Stari treba da kasni za 1
						// Zato citam novi tek kad treba da prekinem for
						rafStringStari = rafStari.readLine();
						continue;
					} else if (cmp > 0) {
						primaryCount = k;
						// Stari treba da kasni za 1
						// Zato citam novi tek kad treba da prekinem for
						rafStringStari = rafStari.readLine();
						break;
					} else {
						rafStari.close();
						raf.close();
						return false;
					}
				}
			} else if (cmp > 0) {
				// Stari treba da kasni za 1
				// Zato citam novi tek kad treba da prekinem for
				rafStringStari = rafStari.readLine();
				continue;
			} else {
				raf.close();
				rafStari.close();
				return false;

			}
		}
		raf.close();
		rafStari.close();
		System.out.println("Prosao je kroz kod, nije obrisao red, nesto nije u redu");
		return false;

	}

	public static void addRecord2(Entity entity, String[] noviRed) throws Exception {
		File f = new File(".//meta//promene" + entity.getName() + ".txt");
		System.out.println(f.createNewFile());
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		String[] s = new String[noviRed.length + 1];
		for (int i = 0; i < noviRed.length; i++) {
			s[i] = noviRed[i];
		}
		s[noviRed.length] = "I";
		String tmp = "";
		int brAtributa = 0;
		for (String string : noviRed) {
			tmp += string;
			for (int z = (string.length()); z < entity.getAttributes().get(brAtributa).getLength(); z++) {
				tmp += " ";
			}
			brAtributa++;
		}
		tmp += s[noviRed.length];
		pw.println(tmp);
		pw.close();

	}

	public static void updateRecord2(Entity entity, String[] redKojiSeMenja, String[] noviRed) throws Exception {
		File f = new File(".//meta//promene" + entity.getName() + ".txt");
		System.out.println(f.createNewFile());
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		PrintWriter pw = new PrintWriter(bw);
		
		String[] s = new String[redKojiSeMenja.length + 1];
		for (int i = 0; i < redKojiSeMenja.length; i++) {
			s[i] = redKojiSeMenja[i];
		}
		s[redKojiSeMenja.length] = "M";
		String tmp = "";
		int brAtributa = 0;
		for (String string : redKojiSeMenja) {
			tmp += string;
			for (int z = (string.length()); z < entity.getAttributes().get(brAtributa).getLength(); z++) {
				tmp += " ";
			}
			brAtributa++;
		}
		tmp += s[noviRed.length];
		pw.println(tmp);
		for (int i = 0; i < noviRed.length; i++) {
			s[i] = noviRed[i];
		}
		// O je kao prazno
		// prvi red je taj u fajlu koji se menja, drugi je promenjen
		s[noviRed.length] = "O";
		tmp = "";
		brAtributa = 0;
		for (String string : noviRed) {
			tmp += string;
			for (int z = (string.length()); z < entity.getAttributes().get(brAtributa).getLength(); z++) {
				tmp += " ";
			}
			brAtributa++;
		}
		tmp += s[noviRed.length];
		pw.println(tmp);
		pw.close();

	}

	public static void deleteRecord2(Entity entity, String[] noviRed) throws Exception {
		File f = new File(".//meta//promene" + entity.getName() + ".txt");
		FileWriter fw = new FileWriter(f, true);
		BufferedWriter bw = new BufferedWriter(fw);
		System.out.println(f.createNewFile());
		PrintWriter pw = new PrintWriter(bw);
		String[] s = new String[noviRed.length + 1];
		for (int i = 0; i < noviRed.length; i++) {
			s[i] = noviRed[i];
		}
		System.out.println(s.length);
		s[noviRed.length] = "D";
		String tmp = "";
		int brAtributa = 0;
		for (String string : noviRed) {
			tmp += string;
			for (int z = (string.length()); z < entity.getAttributes().get(brAtributa).getLength(); z++) {
				tmp += " ";
			}
			brAtributa++;
		}
		tmp += s[noviRed.length];
		pw.println(tmp);
		pw.close();
	}

	public static void ApplyTheChanges(Entity entity) throws Exception {
		File f = new File(".//meta//promene" + entity.getName() + ".txt");
		RandomAccessFile raf = new RandomAccessFile(f, "rw");
		int duzinaFajla = 0; // broj linija fajla
		BufferedReader br = new BufferedReader(new FileReader(f));
		String s = br.readLine();
		while (s != null) {
			duzinaFajla++;
			s = br.readLine();
		}
		br.close();
		String citac = "";
		String unos[] = new String[entity.getAttributeCount()];
		String mdi = "";
		for (int i = 0; i < duzinaFajla; i++) {
			citac = raf.readLine();
			int indexUCitacu = 0;
			// od 0 do broja atributa
			for (int k = 0; k < (entity.getAttributeCount()); k++) {
				Attribute a = entity.getAttributes().get(k);
				int attributeLength = a.getLength();
				String atr = "";
				atr = citac.substring(indexUCitacu, indexUCitacu + attributeLength);
				indexUCitacu += attributeLength;
				unos[k] = atr.trim();

			}
			// MDI proveravam posle k petlje
			mdi = citac.substring(indexUCitacu).trim();
			
			if (mdi.equals("I")) {
				System.out.println("citac: " + citac);
				for (String string : unos) {
					System.out.println("unos: " + string);
				}

				boolean b = addRecord(entity, unos);
				if (!b) {
					File error = new File(".//meta//greske" + entity.getName() + ".txt");
					error.createNewFile();
					FileWriter fw = new FileWriter(error, true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw);
					for (String string : unos) {
						pw.print(string);
					}
					pw.println(mdi);
					pw.close();
				}
			} else if (mdi.equals("D")) {
				boolean b = deleteRecord(entity, unos);
				if (!b) {
					File error = new File(".//meta//greske" + entity.getName() + ".txt");
					error.createNewFile();
					FileWriter fw = new FileWriter(error, true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw);
					for (String string : unos) {
						pw.print(string);
					}
					pw.println(mdi);
					pw.close();
				}

			} else if (mdi.equals("M")) {
				String noviRed[] = new String[unos.length];
				citac = raf.readLine();
				indexUCitacu = 0;
				for (int k = 0; k < (entity.getAttributeCount()); k++) {
					Attribute a = entity.getAttributes().get(k);
					int attributeLength = a.getLength();
					String atr = "";
					atr = citac.substring(indexUCitacu, indexUCitacu + attributeLength);
					indexUCitacu += attributeLength;
					noviRed[k] = atr.trim();

				}
				i++;
				// MDI proveravam posle k petlje
				mdi = citac.substring(indexUCitacu).trim();
				boolean b = updateRecord(entity, unos, noviRed);
				if (!b) {
					File error = new File(".//meta//greske" + entity.getName() + ".txt");
					error.createNewFile();
					FileWriter fw = new FileWriter(error, true);
					BufferedWriter bw = new BufferedWriter(fw);
					PrintWriter pw = new PrintWriter(bw);
					for (String string : unos) {
						pw.print(string);
					}
					pw.println(mdi);
					pw.close();
				}
			}

		}
		//System.out.println("Datoteka promena je obrisana: " + f.delete());
		raf.close();
	}
}
