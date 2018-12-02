package tim2015.ruinfre.view.main;

import javax.swing.RowFilter;



public class RowEntityFilter extends RowFilter<MyTableModel, Integer> 
{
	private String value;

	@Override
	public boolean include(javax.swing.RowFilter.Entry<? extends MyTableModel, ? extends Integer> arg0)
	{
		return arg0.getStringValue(1).toLowerCase().contains(getValue().toLowerCase());
	}
	
	public String getValue()
	{
		if(value == null)
		{
			return "";
		}
		return value;
	}
	
	public void setValue(String value)
	{
		this.value = value;
	}

}
