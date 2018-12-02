package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

import tim2015.ruinfre.model.Packet;
import tim2015.ruinfre.model.Relation;
import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.tree.ResourceNode;

public class NewRelationAction extends AbstractAction
{

	public NewRelationAction() 
	{
		super();
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK));
		putValue(NAME, "New Relation");
		putValue(SHORT_DESCRIPTION, "Add New Relation");
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
			System.err.println(cce.getMessage());
		}
		if ( selectedNode == null) 
		{
			selectedNode = (DefaultMutableTreeNode) MainFrame.getInstance().getWorkspaceTree().getModel().getRoot();
		}
			
		
		Relation newPacket = new Relation("New Relation","New Relation");
		
		newPacket.setKey(newPacket.toString().split("@")[1]);
		
		ResourceNode<Relation> newNode = new ResourceNode<>(newPacket);
		
		selectedNode.add(newNode);

		((DefaultTreeModel) MainFrame.getInstance().getWorkspaceTree().getModel()).reload();
		
		MainFrame.getInstance().getWorkspaceTree().setSelectionPath(new TreePath(selectedNode));
		
		MainFrame.getInstance().getWorkspaceTree().expandPath(new TreePath(selectedNode));
		
	}

}
