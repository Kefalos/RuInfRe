{
	"name": "Workspace Root",
	"key": "ROOT",
	"children": [
		{
			"type": "Packet",
			"properties": {
				"name": "Veliki Set Podataka",
				"key": "3c1b4f05",
				"children": [
					{
						"type": "Packet",
						"properties": {
							"name": "Serijske datoteke",
							"key": "74498900",
							"children": [
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Serijske datoteke/Studenti.ser",
										"accessed": 21,
										"type": "Serijska",
										"name": "Studenti",
										"key": "5b64714e",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 20,
													"type": "TYPE_VARCHAR",
													"name": "TELEFON",
													"key": "TELEFON",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 80,
													"type": "TYPE_VARCHAR",
													"name": "ADRESA",
													"key": "ADRESA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 25,
													"type": "TYPE_DATETIME",
													"name": "DATUM RODJENJA",
													"key": "DATUM RODJENJA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 13,
													"type": "TYPE_CHAR",
													"name": "JMBG",
													"key": "JMBG",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 1,
													"type": "TYPE_CHAR",
													"name": "POL",
													"key": "POL",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 20,
													"type": "TYPE_VARCHAR",
													"name": "IME",
													"key": "IME",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 20,
													"type": "TYPE_VARCHAR",
													"name": "IME RODITELJA",
													"key": "IME RODITELJA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 20,
													"type": "TYPE_VARCHAR",
													"name": "PREZIME",
													"key": "PREZIME",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 6,
													"type": "TYPE_VARCHAR",
													"name": "BROJ INDEKSA",
													"key": "BROJ INDEKSA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 1,
													"type": "TYPE_CHAR",
													"name": "STRUKA",
													"key": "STRUKA",
													"children": []
												}
											}
										]
									}
								},
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Serijske datoteke/TokStudija.ser",
										"accessed": 21,
										"type": "Serijska",
										"name": "Tok studija",
										"key": "9ecc2181",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 2,
													"type": "TYPE_CHAR",
													"name": "UPISUJE_PO_PLANU",
													"key": "UPISUJE_PO_PLANU",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 1,
													"type": "TYPE_NUMERIC",
													"name": "GODINA_STUDIJA",
													"key": "GODINA_STUDIJA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 4,
													"type": "TYPE_CHAR",
													"name": "SKOLSKA_GODINA",
													"key": "SKOLSKA_GODINA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 4,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PROGRAMA",
													"key": "OZNAKA_PROGRAMA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 6,
													"type": "TYPE_VARCHAR",
													"name": "BROJ_INDEKSA",
													"key": "BROJ_INDEKSA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 1,
													"type": "TYPE_CHAR",
													"name": "STRUKA",
													"key": "STRUKA",
													"children": []
												}
											}
										]
									}
								},
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Serijske datoteke/StudijskiProgrami.ser",
										"accessed": 21,
										"type": "Serijska",
										"name": "Studijski programi",
										"key": "8db29d54",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 80,
													"type": "TYPE_VARCHAR",
													"name": "NAZIV_PROGRAMA",
													"key": "NAZIV_PROGRAMA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 80,
													"type": "TYPE_VARCHAR",
													"name": "NAZIV_KOJI_SE_STICE",
													"key": "NAZIV_KOJI_SE_STICE",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 4,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PROGRAMA",
													"key": "OZNAKA_PROGRAMA",
													"children": []
												}
											}
										]
									}
								},
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Serijske datoteke/PlanStudijskogPrograma.ser",
										"accessed": 21,
										"type": "Serijska",
										"name": "Plan studijskog programa",
										"key": "b94392a3",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 2,
													"type": "TYPE_NUMERIC",
													"name": "SEMESTAR_PREDMETA",
													"key": "SEMESTAR_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 1,
													"type": "TYPE_NUMERIC",
													"name": "GODINA_PREDMETA",
													"key": "GODINA_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 5,
													"type": "TYPE_VARCHAR",
													"name": "SIFRA_PREDMETA",
													"key": "SIFRA_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 2,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PLANA",
													"key": "OZNAKA_PLANA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 4,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PROGRAMA",
													"key": "OZNAKA_PROGRAMA",
													"children": []
												}
											}
										]
									}
								},
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Serijske datoteke/NastavniPredmeti.ser",
										"accessed": 21,
										"type": "Serijska",
										"name": "Nastavni predmeti",
										"key": "0968be00",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 3,
													"type": "TYPE_NUMERIC",
													"name": "BROJ_KREDITA",
													"key": "BROJ_KREDITA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 2,
													"type": "TYPE_NUMERIC",
													"name": "TRAJANJE_SEMESTRA",
													"key": "TRAJANJE_SEMESTRA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 80,
													"type": "TYPE_VARCHAR",
													"name": "NAZIV_PREDMETA",
													"key": "NAZIV_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 5,
													"type": "TYPE_VARCHAR",
													"name": "SIFRA_PREDMETA",
													"key": "SIFRA_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 2,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PLANA",
													"key": "OZNAKA_PLANA",
													"children": []
												}
											}
										]
									}
								}

							]
						}
					},
					{
						"type": "Packet",
						"properties": {
							"name": "Sekvencijalne datoteke",
							"key": "5fd6e7f4",
							"children": [
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Sekvencijalne datoteke/Studenti.sek",
										"accessed": 21,
										"type": "Sekvencijalna",
										"name": "Studenti",
										"key": "b3147604",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 20,
													"type": "TYPE_VARCHAR",
													"name": "TELEFON",
													"key": "TELEFON",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 80,
													"type": "TYPE_VARCHAR",
													"name": "ADRESA",
													"key": "ADRESA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 25,
													"type": "TYPE_DATETIME",
													"name": "DATUM RODJENJA",
													"key": "DATUM RODJENJA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 13,
													"type": "TYPE_CHAR",
													"name": "JMBG",
													"key": "JMBG",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 1,
													"type": "TYPE_CHAR",
													"name": "POL",
													"key": "POL",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 20,
													"type": "TYPE_VARCHAR",
													"name": "IME",
													"key": "IME",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 20,
													"type": "TYPE_VARCHAR",
													"name": "IME RODITELJA",
													"key": "IME RODITELJA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 20,
													"type": "TYPE_VARCHAR",
													"name": "PREZIME",
													"key": "PREZIME",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 6,
													"type": "TYPE_VARCHAR",
													"name": "BROJ INDEKSA",
													"key": "BROJ INDEKSA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 1,
													"type": "TYPE_CHAR",
													"name": "STRUKA",
													"key": "STRUKA",
													"children": []
												}
											}
										]
									}
								},
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Sekvencijalne datoteke/TokStudija.sek",
										"accessed": 21,
										"type": "Sekvencijalna",
										"name": "Tok studija",
										"key": "0e7d8c37",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 2,
													"type": "TYPE_CHAR",
													"name": "UPISUJE_PO_PLANU",
													"key": "UPISUJE_PO_PLANU",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 1,
													"type": "TYPE_NUMERIC",
													"name": "GODINA_STUDIJA",
													"key": "GODINA_STUDIJA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 4,
													"type": "TYPE_CHAR",
													"name": "SKOLSKA_GODINA",
													"key": "SKOLSKA_GODINA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 4,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PROGRAMA",
													"key": "OZNAKA_PROGRAMA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 6,
													"type": "TYPE_VARCHAR",
													"name": "BROJ_INDEKSA",
													"key": "BROJ_INDEKSA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 1,
													"type": "TYPE_CHAR",
													"name": "STRUKA",
													"key": "STRUKA",
													"children": []
												}
											}
										]
									}
								},
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Sekvencijalne datoteke/StudijskiProgrami.sek",
										"accessed": 21,
										"type": "Sekvencijalna",
										"name": "Studijski programi",
										"key": "28fb08db",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 80,
													"type": "TYPE_VARCHAR",
													"name": "NAZIV_PROGRAMA",
													"key": "NAZIV_PROGRAMA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 80,
													"type": "TYPE_VARCHAR",
													"name": "NAZIV_KOJI_SE_STICE",
													"key": "NAZIV_KOJI_SE_STICE",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 4,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PROGRAMA",
													"key": "OZNAKA_PROGRAMA",
													"children": []
												}
											}
										]
									}
								},
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Sekvencijalne datoteke/PlanStudijskogPrograma.sek",
										"accessed": 21,
										"type": "Sekvencijalna",
										"name": "Plan studijskog programa",
										"key": "f69a43a4",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 2,
													"type": "TYPE_NUMERIC",
													"name": "SEMESTAR_PREDMETA",
													"key": "SEMESTAR_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 1,
													"type": "TYPE_NUMERIC",
													"name": "GODINA_PREDMETA",
													"key": "GODINA_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 5,
													"type": "TYPE_VARCHAR",
													"name": "SIFRA_PREDMETA",
													"key": "SIFRA_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 2,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PLANA",
													"key": "OZNAKA_PLANA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 4,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PROGRAMA",
													"key": "OZNAKA_PROGRAMA",
													"children": []
												}
											}
										]
									}
								},
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Sekvencijalne datoteke/NastavniPredmeti.sek",
										"accessed": 21,
										"type": "Sekvencijalna",
										"name": "Nastavni predmeti",
										"key": "dc4653a7",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 3,
													"type": "TYPE_NUMERIC",
													"name": "BROJ_KREDITA",
													"key": "BROJ_KREDITA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 2,
													"type": "TYPE_NUMERIC",
													"name": "TRAJANJE_SEMESTRA",
													"key": "TRAJANJE_SEMESTRA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 80,
													"type": "TYPE_VARCHAR",
													"name": "NAZIV_PREDMETA",
													"key": "NAZIV_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 5,
													"type": "TYPE_VARCHAR",
													"name": "SIFRA_PREDMETA",
													"key": "SIFRA_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 2,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PLANA",
													"key": "OZNAKA_PLANA",
													"children": []
												}
											}
										]
									}
								}
							]
						}
					},
					{
						"type": "Packet",
						"properties": {
							"name": "Indeks - sekvencijalne datoteke",
							"key": "451ea480",
							"children": [
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Indeks - sekvencijalne datoteke/Studenti.ind",
										"accessed": 21,
										"type": "Indeks Sekvencijalna",
										"name": "Studenti",
										"key": "83353335",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 20,
													"type": "TYPE_VARCHAR",
													"name": "TELEFON",
													"key": "TELEFON",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 80,
													"type": "TYPE_VARCHAR",
													"name": "ADRESA",
													"key": "ADRESA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 25,
													"type": "TYPE_DATETIME",
													"name": "DATUM RODJENJA",
													"key": "DATUM RODJENJA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 13,
													"type": "TYPE_CHAR",
													"name": "JMBG",
													"key": "JMBG",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 1,
													"type": "TYPE_CHAR",
													"name": "POL",
													"key": "POL",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 20,
													"type": "TYPE_VARCHAR",
													"name": "IME",
													"key": "IME",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 20,
													"type": "TYPE_VARCHAR",
													"name": "IME RODITELJA",
													"key": "IME RODITELJA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 20,
													"type": "TYPE_VARCHAR",
													"name": "PREZIME",
													"key": "PREZIME",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 6,
													"type": "TYPE_VARCHAR",
													"name": "BROJ INDEKSA",
													"key": "BROJ INDEKSA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 1,
													"type": "TYPE_CHAR",
													"name": "STRUKA",
													"key": "STRUKA",
													"children": []
												}
											}
										]
									}
								},
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Indeks - sekvencijalne datoteke/TokStudija.ind",
										"accessed": 21,
										"type": "Indeks Sekvencijalna",
										"name": "Tok studija",
										"key": "6df5784c",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 2,
													"type": "TYPE_CHAR",
													"name": "UPISUJE_PO_PLANU",
													"key": "UPISUJE_PO_PLANU",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 1,
													"type": "TYPE_NUMERIC",
													"name": "GODINA_STUDIJA",
													"key": "GODINA_STUDIJA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 4,
													"type": "TYPE_CHAR",
													"name": "SKOLSKA_GODINA",
													"key": "SKOLSKA_GODINA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 4,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PROGRAMA",
													"key": "OZNAKA_PROGRAMA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 6,
													"type": "TYPE_VARCHAR",
													"name": "BROJ_INDEKSA",
													"key": "BROJ_INDEKSA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 1,
													"type": "TYPE_CHAR",
													"name": "STRUKA",
													"key": "STRUKA",
													"children": []
												}
											}
										]
									}
								},
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Indeks - sekvencijalne datoteke/StudijskiProgrami.ind",
										"accessed": 21,
										"type": "Indeks Sekvencijalna",
										"name": "Studijski programi",
										"key": "0f5fa025",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 80,
													"type": "TYPE_VARCHAR",
													"name": "NAZIV_PROGRAMA",
													"key": "NAZIV_PROGRAMA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 80,
													"type": "TYPE_VARCHAR",
													"name": "NAZIV_KOJI_SE_STICE",
													"key": "NAZIV_KOJI_SE_STICE",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 4,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PROGRAMA",
													"key": "OZNAKA_PROGRAMA",
													"children": []
												}
											}
										]
									}
								},
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Indeks - sekvencijalne datoteke/PlanStudijskogPrograma.ind",
										"accessed": 21,
										"type": "Indeks Sekvencijalna",
										"name": "Plan studijskog programa",
										"key": "8457ca30",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 2,
													"type": "TYPE_NUMERIC",
													"name": "SEMESTAR_PREDMETA",
													"key": "SEMESTAR_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 1,
													"type": "TYPE_NUMERIC",
													"name": "GODINA_PREDMETA",
													"key": "GODINA_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 5,
													"type": "TYPE_VARCHAR",
													"name": "SIFRA_PREDMETA",
													"key": "SIFRA_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 2,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PLANA",
													"key": "OZNAKA_PLANA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 4,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PROGRAMA",
													"key": "OZNAKA_PROGRAMA",
													"children": []
												}
											}
										]
									}
								},
								{
									"type": "Entity",
									"properties": {
										"file": "./meta/Veliki Set Podataka/Indeks - sekvencijalne datoteke/NastavniPredmeti.ind",
										"accessed": 21,
										"type": "Indeks Sekvencijalna",
										"name": "Nastavni predmeti",
										"key": "6c51fac1",
										"children": [
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 3,
													"type": "TYPE_NUMERIC",
													"name": "BROJ_KREDITA",
													"key": "BROJ_KREDITA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 2,
													"type": "TYPE_NUMERIC",
													"name": "TRAJANJE_SEMESTRA",
													"key": "TRAJANJE_SEMESTRA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": false,
													"isNull": true,
													"length": 80,
													"type": "TYPE_VARCHAR",
													"name": "NAZIV_PREDMETA",
													"key": "NAZIV_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 5,
													"type": "TYPE_VARCHAR",
													"name": "SIFRA_PREDMETA",
													"key": "SIFRA_PREDMETA",
													"children": []
												}
											},
											{
												"type": "Attribute",
												"properties": {
													"primaryKey": true,
													"isNull": true,
													"length": 2,
													"type": "TYPE_CHAR",
													"name": "OZNAKA_PLANA",
													"key": "OZNAKA_PLANA",
													"children": []
												}
											}
										]
									}
								}
							]
						}
					}
				]
			}
		}
	]
}
