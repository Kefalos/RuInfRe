package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.LinkedList;

import tim2015.ruinfre.model.Attribute;
import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.model.Resource;
import tim2015.ruinfre.util.FileHandler;
import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.main.ResourceView;
import tim2015.ruinfre.view.main.TableFactory;

public class AlLoadBlock implements ActionListener
{


	
	@Override
	public void actionPerformed(ActionEvent e) 
	{

		Entity curEnt = MainFrame.getInstance().getOpenedEntity();
		
		ResourceView openedTable = (ResourceView) MainFrame.getInstance().getOpenedTab();
		
		Object[][] data = null;
		try 
		{
			data = FileHandler.loadPhysicalBlock(
					openedTable.getOffset(), 
					openedTable.getBlockSize(), 
					MainFrame.getInstance().getOpenedEntity());
		}
		catch (IOException e1) 
		{
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		

		
		MainFrame.getInstance().getOpenedTab().setTheTable(TableFactory.createTable(curEnt, data));
		
		((ResourceView) MainFrame.getInstance().getOpenedTab()).setAccessCount(curEnt.getAccessed());

		
		MainFrame.getInstance().repaint();
	
	}

}
