package tim2015.ruinfre.model;

public class Relation extends Link
{
	
	private String relationKey = null;
	
	public Relation(Resource relation)
	{
		super();
		this.relationKey = relation.getKey();
		// TODO Auto-generated constructor stub
	}

	public Relation(String name, String key,Resource relation)
	{
		super(name, key);
		this.relationKey = relation.getKey();
	}

	public Relation(String name, String key) 
	{
		super(name, key);
		
	}
	
	public String toString() 
	{
		return getName() + " (" + getKey() + ")";
	}

	
	public String getRelation() 
	{
		return relationKey;
	}

	public void setRelation(Resource relation) 
	{
		this.relationKey = relation.getKey();
	}
}
