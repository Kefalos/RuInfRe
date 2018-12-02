package tim2015.ruinfre.controller;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.tree.DefaultMutableTreeNode;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.main.ResourceView;
import tim2015.ruinfre.view.tree.ResourceNode;

public class OpenEntityAction extends AbstractAction
{

	@Override
	public void actionPerformed(ActionEvent e) 
	{
	
		DefaultMutableTreeNode selectedNode = null;
		try
		{
			selectedNode = (ResourceNode)MainFrame.getInstance().getWorkspaceTree().getLastSelectedPathComponent();
		}
		catch (ClassCastException cce) 
		{
			
		}
		
		if (((ResourceNode) selectedNode).getItem() instanceof Entity) 
		{
			
			Component[] tabs = MainFrame.getInstance().getTab().getComponents();
			
			for(Component c: tabs)
			{
				ResourceView rv = (ResourceView) c;
				if (rv.getResource().equals(((ResourceNode) selectedNode).getItem()))
					return;
			}
			
			ResourceView resview = new ResourceView(((ResourceNode) selectedNode).getItem(),true);
			//resview.setName(((ResourceNode) selectedNode).getItem().getName());
      	MainFrame.getInstance().getTab().add(resview);
      	
		}
		
	}

}
