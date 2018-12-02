package tim2015.ruinfre.view.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.state.StateManager;

public class StateView extends JPanel
{
	private StateManager sm = new StateManager(this);
	private JPanel mainPanel = new JPanel();
	public StateView()
	{
		
		this.setLayout(new BorderLayout());
		this.setBorder(BorderFactory.createLineBorder(Color.BLACK, 2, false));
		this.setPreferredSize(new Dimension( (int) (Toolkit.getDefaultToolkit().getScreenSize().getWidth()*3/5 ), (int) (Toolkit.getDefaultToolkit().getScreenSize().getHeight()*3/5/4)));
		this.add(mainPanel);
		this.setVisible(true);
		
	}
	
	public JPanel getMainPanel()
	{
		return mainPanel;
	}

	public void setMainPanel(JPanel mainPanel) 
	{
		this.remove(this.mainPanel);
		this.mainPanel = mainPanel;
		this.add(mainPanel);
		this.validate();
	}

	public void startAddRecord2State(Entity entity)
	{
		sm.setAddRecord2State(entity);
	}
	public void startAddRecordState()
	{
		sm.setAddRecordState();
	}
	public void startOffState()
	{
		sm.setOffState();
	}
	public void startUpdateRecord2State(Entity entity)
	{
		sm.setUpdateRecord2(entity);
	}
	public void startDeleteRecord2State(Entity entity)
	{
		sm.setDeleteRecord2(entity);
	}
	public void startDeleteRecordState(String[] redKojiSeBrise)
	{
		sm.setDeleteRecord(redKojiSeBrise);
	}
	public void startUpdateRecordState()
	{
		sm.setUpdateRecord();
	}
	public void startSearchState(Entity entity)
	{
		sm.setSearchState(entity);
	}
	public void startSortState(Entity entity)
	{
		sm.setSortState(entity);
	}
	public void startRelationState(Entity entity)
	{
		sm.setRelationState(entity);
	}

	

}
