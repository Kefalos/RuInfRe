package tim2015.ruinfre.view.main;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

import tim2015.ruinfre.model.Attribute;
import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.model.Resource;


public class MyTableModel implements TableModel
{
	
	public MyTableModel(Entity ent)
	{
		int attributes = 0;
		for(Resource r: ent.getChildrenReadOnly())
		{
			if (r instanceof Attribute)
				attributes++;
		}
		columns = new Object[attributes];
		data = new Object[attributes][5];
		attributes=0;
		for(Resource r: ent.getChildrenReadOnly())
		{
			if (r instanceof Attribute) 
			{
				columns[attributes] = r.getName();
				attributes++;
			}
				
		}
		
	}
	
	private Object[] columns;
	private Object[][] data;

	@Override
	public void addTableModelListener(TableModelListener l) 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<?> getColumnClass(int columnIndex) 
	{
		// TODO Auto-generated method stub
		return data[0][columnIndex].getClass();
	}

	@Override
	public int getColumnCount() 
	{
		// TODO Auto-generated method stub
		return data[0].length;
	}

	@Override
	public String getColumnName(int columnIndex) 
	{
		// TODO Auto-generated method stub
		return (String) columns[columnIndex];
	}

	@Override
	public int getRowCount()
	{
		// TODO Auto-generated method stub
		return data.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) 
	{
		// TODO Auto-generated method stub
		return data[rowIndex][columnIndex];
	}

	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) 
	{
		// TODO Auto-generated method stub
		if(columnIndex == 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}

	@Override
	public void removeTableModelListener(TableModelListener l)
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		// TODO Auto-generated method stub
		
		data[rowIndex][columnIndex] = aValue;
	}
	

}
