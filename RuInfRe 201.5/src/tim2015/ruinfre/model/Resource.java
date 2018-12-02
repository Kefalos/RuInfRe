package tim2015.ruinfre.model;
/**
 * Osnovna klasa za resurse.
 * @author Aleksandar Karpuzov
 *
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Osnovna apstraktna klasa za resurse
 */
public abstract class Resource {

	private boolean sql = false;
	
	public Resource() {

	}
	
	public Resource(String name, String key) {
		this.name = name;
		this.key = key;

	}
	
	/**
	 * Ime koje se prikazuje korisniku
	 */
	private String name = "";
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * jedinstveni kljuc
	 */
	private String key = "";
	
	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	private ArrayList<Resource> children = new ArrayList<>();
	
	/**
	 * Ovu metoda se koristi interno, i treba u svakoj nasledjenoj klasi da vrati koju klasu 
	 * moze da prima kao dete.
	 * @return Class<?> child class
	 */
	public Class<?> getChildClass(){
		return Void.class;
	}


/**
 * vraca read-only kopiju dece ovog resursa. nije dopusten javni pristup pravoj listi zato sto nije observable.
 * @return ArrayList
 */
	public List<Resource> getChildrenReadOnly() {
		if (canHaveChildren()) 
			return new ArrayList<>(children);
		else
			return new ArrayList<>();
		
	}
	/**
	 * Ovu metoda se koristi interno, i treba u svakoj nasledjenoj klasi da vrati da li
	 * moze da ima decu.
	 * @return
	 */
		public boolean canHaveChildren() {
			return false;
		}

		public void addChild(Resource child) {
			if (canHaveChildren()) {
				if (!(getChildClass().isInstance(child)) ) {
					throw new UnsupportedOperationException("This object does not support children of that type");
				}
				children.add(child);
			} else {
				throw new UnsupportedOperationException("This object cannot have children");
			}
			
		}

	public void addChild(int index, Resource child) {
		if (canHaveChildren()) { 
			if (!(getChildClass().isInstance(child)) ) {
				throw new UnsupportedOperationException("This object does not support children of that type");
			}
			children.add(index, child);
		} else
			throw new UnsupportedOperationException("This object cannot have children");
	}

	public void removeChild(int index) {
		if (canHaveChildren())
			children.remove(index);
		else
			throw new UnsupportedOperationException("This object cannot have children");

	}

	public void removeChild(Resource child) {
		if (canHaveChildren() ) {
			if (children.contains(child)) {
			children.remove(child);
			
			}
		} else
			throw new UnsupportedOperationException("This object cannot have children");

	}
	
	public void removeAllChildren() {
		if (canHaveChildren())
			children.clear();
		else
			throw new UnsupportedOperationException("This object cannot have children");
	}

	public String toString() 
	{
		return getName() + " (" + getKey() + ")";
	}

	public boolean isSql() {
		return sql;
	}

	public void setSql(boolean sql) {
		this.sql = sql;
	}



}
