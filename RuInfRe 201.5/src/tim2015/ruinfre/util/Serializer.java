package tim2015.ruinfre.util;

import tim2015.ruinfre.model.Resource;
/**
 * Interface za serijalizatore
 * @author Aleksandar Karpuzov
 *
 */
public interface Serializer {

	/**
	 * Pravi JSON iz objekta
	 * @param res
	 * @return JSON String
	 */
	
	public String toJson(Resource res) ;
		
	/**
	 * Pravi Objekat iz JSONa
	 * @param str
	 * @return Resource objekat
	 */

	public Resource fromJson(String str) ;

	/**
	 * Proverava da li je JSON sintaksa ispravna.
	 * @param text
	 * @return true / false
	 */
	public boolean validateSyntax(String text) ; 
	
	
	/**
	 * Proverava da li je JSON u skladu sa meta meta semom.
	 * @param text
	 * @return true / false
	 */
	public boolean validateData(String text);
	

}
