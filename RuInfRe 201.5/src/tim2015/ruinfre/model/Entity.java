package tim2015.ruinfre.model;

import java.util.LinkedList;
import java.util.List;


public class Entity extends Container
{
	
	private String file;
	private int accessed;
	private String type;
	
	public Entity(String name, String key) 
	{
		super(name,key);
	}
	
	
	public Entity() 
	{
		super();
		
	}



	public Entity(String name, String tip, String fullFile) 
	{
		super();
		setName(name);;
		setType(tip);
		setFile(fullFile);
		
	}


	public String getFile()
	{
		return file;
	}

	public void setFile(String file)
	{
		this.file = file;
	}
	
	@Override
	public Class<?> getChildClass()
	{
		return Link.class;
	}
	
	@Override
	public boolean canHaveChildren()
	{
		return true;
	}


	public int getAccessed() 
	{
		// TODO Auto-generated method stub
		return accessed;
	}
	
	public List<Attribute> getAttributes() 
	{
		LinkedList<Attribute> attributes = new LinkedList<>();
		
		for(Resource r: getChildrenReadOnly())
		{
			if (r instanceof Attribute) {
				attributes.push((Attribute) r);
			}
		}
		
		return attributes;
		
	}

	public int getAttributeCount() 
	{
		LinkedList<Attribute> attributes = new LinkedList<>();
		
		for(Resource r: getChildrenReadOnly())
		{
			if (r instanceof Attribute) {
				attributes.push((Attribute) r);
			}
		}
		
		return attributes.size();
	}
	
	public List<Relation> getRelations()
	{
		LinkedList<Relation> attributes = new LinkedList<>();
		
		for(Resource r: getChildrenReadOnly()) 
		{
			if (r instanceof Relation) {
				attributes.push((Relation) r);
			}
		}
		
		return attributes;
		
	}

	public int getRelationsCount() 
	{
		LinkedList<Relation> attributes = new LinkedList<>();
		
		for(Resource r: getChildrenReadOnly())
		{
			if (r instanceof Relation) {
				attributes.push((Relation) r);
			}
		}
		
		return attributes.size();
	}

	public void addAccessed() 
	{
		accessed++;
		
	}


	public String getType() 
	{
		return type;
	}


	public void setType(String type) 
	{
		this.type = type;
	}
	
	public String[] getExtensions() 
	{
		switch (type){
		case "Serijska":
			return new String[] {"ser","txt"};
		case "Indeks Sekvencijalna":
			return new String[] {"ind","stxt","tree","over","tree2"};
		case "Sekvencijalna":
			return new String[] {"sek","stxt"};
		default:
			return null;
		}
	}
	
	public int rowLength()
	{
		int length = 0;
		for (Attribute a: getAttributes())
		{
			length += a.getLength();
		}
		return length;
	}
	

}