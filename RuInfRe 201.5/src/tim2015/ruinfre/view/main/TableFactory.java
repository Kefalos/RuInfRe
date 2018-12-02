package tim2015.ruinfre.view.main;

import javax.swing.JTable;

import tim2015.ruinfre.model.Entity;

/**
 * Factory za tabele.
 * @author Aleksandar
 *
 */
public class TableFactory 
{
/*
	public static JTable createSqlTable(SqlTable table, Object[][] data){
		
		int size = table.getColumns().size();
		
		Object[] columns = new Object[size];

		for (int i = 0; i < size; i++) {
			columns[i] = table.getColumns().get(i).getName();
		}

		JTable jtable = new JTable(data, columns);

		jtable.setDragEnabled(false);
		jtable.getTableHeader().setReorderingAllowed(false);
		jtable.setFillsViewportHeight(true);

		return jtable;
	}*/
	
	
	public static JTable createTable(Entity ent, Object[][] data)
	{

		int entColumns = ent.getAttributes().size();
		
		Object[] columns = new Object[entColumns];

		for (int i = 0; i < entColumns; i++) 
		
		{
			columns[i] = ent.getAttributes().get(i).getName();
		}

		JTable table = new JTable(data, columns);

		table.setDragEnabled(false);
		table.getTableHeader().setReorderingAllowed(false);
		table.setFillsViewportHeight(true);

		return table;

	}

	public static JTable createEmptyTable(Entity ent)
	{
		int entColumns = ent.getAttributes().size();
		Object[][] data = new Object[0][entColumns];
		return createTable(ent, data);

	}
	/*
	public static JTable createEmptySqlTable(SqlTable table){
		
		Object[][] data = new Object[0][table.getColumns().size()];
		return createSqlTable(table, data);
		
		
	}*/
}
