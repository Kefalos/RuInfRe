
package tim2015.ruinfre.model;

public class Attribute extends Link {

	private boolean primaryKey = false;
	private boolean isNull = true;
	private int length = 16;
	private String type = "UNDEFINED";

	public boolean isNull() {
		return isNull;
	}

	public void setNull(boolean isNull) {
		this.isNull = isNull;
	}

	public boolean isPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(boolean primaryKey) {
		this.primaryKey = primaryKey;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Attribute(String name, String key, String length, String type, boolean primaryKey, boolean isNull) {
		this(name, key);
		this.length = Integer.parseInt(length);
		this.primaryKey = primaryKey;
		this.type = type;
		this.isNull = isNull;
	}

	public Attribute(String name, String key) {
		super(name, key);
	}


	public Attribute() {
		super();
	}
}