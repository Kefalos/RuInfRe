package tim2015.ruinfre.util;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import tim2015.ruinfre.model.Attribute;
import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.model.Packet;
import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.tree.ResourceNode;
import tim2015.ruinfre.view.tree.TreeFactory;



public class SqlUtil
{

	private static String ip;
	private static String username;
	private static String password;
	private static String database;
	
	private static Connection connection;
	//private static String table_name;
	
	public static Connection getConnection() 
	{
		return connection;
	}
	
	public static boolean connect (String ip, String username, String password,String database) 
	{
		try 
		{
			String query = "jdbc:jtds:sqlserver://" + ip + "/" + database;
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			connection = DriverManager.getConnection(query, username,password);
			SqlUtil.ip = ip;
			SqlUtil.username = username;
			SqlUtil.password = password;
			SqlUtil.database = database;
			
			return true;
		}
		catch (SQLException | ClassNotFoundException e) 
		{
			
			JOptionPane.showMessageDialog (null, (e.getMessage()));
			return false;
		}
	}
	
	public static void disconnect() 
	{

		connection = null;
	}
	
	public static ResourceNode<Packet> createTree() 
	{
		
		try 
		{
		
		Packet storage = new Packet();
		storage.setSql(true);
		
		storage.setName(connection.getCatalog());
		storage.setKey(connection.getCatalog());
		storage.setIp(ip);
		storage.setUsername(username);
		storage.setPassword(password);

		
		
		DatabaseMetaData dbMetaData = connection.getMetaData();
		String[] dbTypes = { "TABLE" };
		ResultSet rsTables = dbMetaData.getTables(null, null, null, dbTypes);

		while (rsTables.next())
		{

			String tableName = rsTables.getString("TABLE_NAME");
			if (tableName.equals("trace_xe_action_map") || tableName.equals("trace_xe_event_map"))
				continue;

			Entity table = new Entity(tableName, tableName);
			table.setSql(true);
			storage.addChild(table);
			//node.add(new ResourceNode<Entity>(table));

			ResultSet rsColumns = dbMetaData.getColumns(null, null, tableName, null);
			while (rsColumns.next()) {
				String columnName = rsColumns.getString("COLUMN_NAME");
				String dataType = rsColumns.getString("TYPE_NAME");
				boolean isNull = rsColumns.getInt("NULLABLE") == 0 ? false : true;

				Attribute column = new Attribute(columnName, columnName);
				column.setType(dataType);
				column.setNull(isNull);
				table.addChild(column);

			}

		}
		
		ResourceNode<Packet> rootNode = (ResourceNode<Packet>) TreeFactory.createResourceTree(storage);
		
		return rootNode;
		} 
		catch (SQLException sqle)
		{
			sqle.printStackTrace();
		}
		return null;
	}


	public static Object[][] loadData(Entity table) throws SQLException{
		
		if (!table.isSql())
			return null;
		
		int entries = 0;
		Statement stmt0=connection.createStatement();
		ResultSet rs0=stmt0.executeQuery("SELECT COUNT(*) as broj FROM "+table.getKey());
		if (rs0.next())
		{
		
			entries=rs0.getInt(1);
		}
		stmt0.close();
		rs0.close();
		
		
		//formiranje dela upita za SELECT sql nad tabelom
		String columnParams="";
		for (int i=0;i<table.getAttributes().size();i++)
		{
			if (i>0) columnParams+=",";
			columnParams+="\""+table.getAttributes().get(i).getKey()+"\"";
			
			
		}
		
		Statement stmt=connection.createStatement();
		//PreparedStatement pre=SqlUtil.getCon().createPre(string);
		//System.out.println("SELECT "+columnParams+" FROM "+table.getKey());
		ResultSet rs=stmt.executeQuery("SELECT "+columnParams+" FROM "+table.getKey());
		
		//table_name = MainFrame.getInstance().getOpenedTab().getTitle();	
		
		Object[][] data;
		data = new String[entries][];

		//u objektu ResultSet-a rs nalaze se svi podaci iz date tabele
		//iz result set-a se podaci citaju i prebacuju u matricu data[][]
		int i=0;
		while (rs.next())
		{
			data[i]=new String [table.getAttributes().size()];
			for (int j=0;j<table.getAttributes().size();j++)
			{
				data[i][j]=rs.getString(j+1);
			}
			i++;
		}
		/*
		System.out.println("broj slogova:"+(TABLE_NAME));
		System.out.println("broj slogova:"+(i++));
		fireUpdateBlockPerformed();*/
		System.out.println(data.length);
		System.out.println(data[0].length);
		return data;
		
	}

	public static void addRecord(Entity ent, String[] data) throws SQLException
	{
		String tableName = ent.getKey();
		String statement = "INSERT INTO \""+tableName+"\" (";
		for (int i=0; i<ent.getAttributeCount(); i++) 
		{
			if (i>0) statement+=",";
			statement+="\"" + ent.getAttributes().get(i).getKey() + "\"";
		}
		statement+=") VALUES (";
		for (int i=0; i<ent.getAttributeCount(); i++) 
		{
			if (i>0) statement+=",";
			statement+="?";
		}
		statement+=")";
		//System.out.println(statement);
		PreparedStatement preparedStatement = connection.prepareStatement(statement);
		
		for(int i=0; i<ent.getAttributeCount();i++) 
		{
			preparedStatement.setString(i+1, data[i]);
		}
		
		preparedStatement.executeUpdate();
		
	}
	
	public static void updateRecord(Entity ent, String[] data) throws SQLException
	{
		String tableName = ent.getKey();
		String statement = "UPDATE "+tableName;
		
		statement+= " SET ";
		for (int i=0; i<ent.getAttributeCount(); i++) 
		{
			if (i>0) statement+=",";
			statement+= "\"" + ent.getAttributes().get(i).getName() + "\"";
			statement+= "=";
			statement+=  "'" + data[i] + "'";
			
		}
		int k = ent.getAttributeCount() - 1;
		statement+= " WHERE ";
		statement+= "\"" + ent.getAttributes().get(k).getName() + "\"";
		statement+= "=";
		statement+=  "'" + data[k] + "'";
		System.out.println(statement);
		
		PreparedStatement preparedStatement = connection.prepareStatement(statement);
		
		preparedStatement.executeUpdate();
		
	}
	
	public static void deleteRecord(Entity ent, String[] data) throws SQLException
	{
		String tableName = ent.getKey();
		String statement = "DELETE FROM "+tableName;
		
		int k = 0;
		statement+= " WHERE ";
		statement+= "\"" + ent.getAttributes().get(k).getName() + "\"";
		statement+= "=";
		statement+=  "'" + data[k] + "'";
		System.out.println(statement);
		
		PreparedStatement preparedStatement = connection.prepareStatement(statement);
		
		preparedStatement.executeUpdate();
		
	}

	public static Object[][] searchRecords(Entity table, String[][] data) throws SQLException
	{
		
		if (!table.isSql())
			return null;
		
		String prep = "SELECT COUNT(*) as broj FROM "+table.getKey() + " WHERE ";
		
		for (int i=0; i<data[0].length;i++) 
		{
			if (i>0)
			{
				prep += " ";
				prep += data[0][i];
				prep += " ";
			}
			prep += "\"" + data[1][i] + "\"";
			prep += data[2][i];
			prep += "'" +data[3][i]+"'" ;
		}
		
		
		int entries = 0;
		Statement stmt0=connection.createStatement();
		ResultSet rs0=stmt0.executeQuery(prep);
		if (rs0.next())
		{
		
			entries=rs0.getInt(1);
		}
		stmt0.close();
		rs0.close();
		
		
		String columnParams="";
		for (int i=0;i<table.getAttributes().size();i++)
		{
			if (i>0) columnParams+=",";
			columnParams+="\""+table.getAttributes().get(i).getKey()+"\"";
			
			
		}
		
		Statement stmt=connection.createStatement();
		
		 prep = "SELECT "+columnParams+" FROM "+table.getKey()  + " WHERE ";
		
		for (int i=0; i<data[0].length;i++) {
			
			if (i>0) 
			{
				prep += " ";
				prep += data[0][i];
				prep += " ";
			}
			prep += "\"" + data[1][i] + "\"";
			prep += data[2][i];
			prep += "'" +data[3][i]+"'" ;
		}
		
		ResultSet rs=stmt.executeQuery(prep);
		
		
		Object[][] data2;
		data2 = new String[entries][];


		int i=0;
		while (rs.next())
		{
			data2[i]=new String [table.getAttributes().size()];
			for (int j=0;j<table.getAttributes().size();j++)
			{
				data2[i][j]=rs.getString(j+1);
			}
			i++;
		}
		
		System.out.println(prep);
		return data2;
		
	}
	
	public static Object[][] sortRecords(Entity table, String[][] data) throws SQLException
	{
		if (!table.isSql())
			return null;
		
		System.out.println(data[0][0]);
		String prep = "SELECT COUNT(*) as broj FROM "+ table.getKey();
		
		
		int entries = 0;
		Statement stmt0=connection.createStatement();
		ResultSet rs0=stmt0.executeQuery(prep);
		
		if (rs0.next())
		{
		
			entries=rs0.getInt(1);
		}
		stmt0.close();
		rs0.close();
		
		
		String columnParams="";
		for (int i=0;i<table.getAttributes().size();i++)
		{
			if (i>0) columnParams+=",";
			columnParams+="\""+table.getAttributes().get(i).getKey()+"\"";
		}
		
		Statement stmt=connection.createStatement();
		
		 prep = "SELECT "+ columnParams +" FROM "+ table.getKey()  + " ORDER BY";
		
		for (int i=0; i<data[0].length;i++)
		{
			if (i>0) 
			{
				prep += ",";
				prep += " ";
				//prep += data[0][i];
				//prep += " ";
			}
			prep += " " +  " \"" + data[0][i] +  "\" ";
			prep += " " + data[1][i];
			//prep += "'" +data[0][i]+"'" ;
		}
		
		ResultSet rs=stmt.executeQuery(prep);
		
		
		Object[][] data2;
		data2 = new String[entries][];

		int i=0;
		while (rs.next())
		{
			data2[i]=new String [table.getAttributes().size()];
			for (int j=0;j<table.getAttributes().size();j++)
			{
				data2[i][j]=rs.getString(j+1);
			}
			i++;
		}
		
		System.out.println(prep);
		return data2;
		
	}
	
}
