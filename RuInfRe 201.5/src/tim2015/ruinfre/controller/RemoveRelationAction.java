package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.model.Relation;
import tim2015.ruinfre.model.Resource;
import tim2015.ruinfre.view.main.AboutUs;
import tim2015.ruinfre.view.main.EditRelationsFram;
import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.main.ResourceView;
import tim2015.ruinfre.view.tree.ResourceNode;

public class RemoveRelationAction implements ActionListener 
{
	
	private EditRelationsFram frame;
	
	public RemoveRelationAction(EditRelationsFram frame)
	{
		this.frame = frame;
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		//Entity parent = frame.getOpenedEntity();
		//Entity remove = frame.getSelectedRelation();
		
		//parent.removeChild(ResourceView.findEntityWithKey((Resource) ((ResourceNode) MainFrame.getInstance().getWorkspaceTree().getModel().getRoot()).getItem(), remove.getKey()));
		//frame.getDemoList().removeElement(remove);
	}
}
