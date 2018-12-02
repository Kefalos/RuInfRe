package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import tim2015.ruinfre.model.Attribute;
import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.view.main.EditResourceDialog;
import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.tree.ResourceNode;

public class NewAttributeAction extends AbstractAction 
{
	
	public NewAttributeAction()
	{
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_T, ActionEvent.CTRL_MASK));
		putValue(NAME, "New Attribute");
		putValue(SHORT_DESCRIPTION, "Add New Attribute");
	}
	
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		DefaultMutableTreeNode selectedNode = null;
		try 
		{
			selectedNode = (ResourceNode)MainFrame.getInstance().getWorkspaceTree().getLastSelectedPathComponent();
		}
		catch (ClassCastException cce) 
		{
			
		}
		
		if (selectedNode == null) 
		{
			selectedNode = (DefaultMutableTreeNode) MainFrame.getInstance().getWorkspaceTree().getModel().getRoot();
		}
			
		Attribute newPacket = new Attribute("New Attribute","New Attribute");
		newPacket.setKey(newPacket.toString().split("@")[1]);
		
		ResourceNode<Attribute> newNode = new ResourceNode<>(newPacket);
		
		selectedNode.add(newNode);

		((DefaultTreeModel) MainFrame.getInstance().getWorkspaceTree().getModel()).reload();
		
		MainFrame.getInstance().getWorkspaceTree().setSelectionPath(new TreePath(selectedNode));
		
		MainFrame.getInstance().getWorkspaceTree().expandPath(new TreePath(selectedNode));
		
		//new EditResourceDialog(newNode);
	}
	
}
