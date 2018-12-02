package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.view.main.EditResourceDialog;
import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.tree.ResourceNode;

public class NewEntityAction extends AbstractAction
{

	private boolean silent;
	
	public NewEntityAction(boolean silent)
{
		super();
		this.silent = silent;
				
		if (silent) 
		{
			putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.SHIFT_MASK));
			putValue(NAME, "New Entity");
		} 
		else 
		{
			putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
			putValue(NAME, "New Entity...");
		}
		
		putValue(SHORT_DESCRIPTION, "Add New Entity");
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
			
		Entity newPacket = new Entity("New Entity","New Entity");
		newPacket.setKey(newPacket.toString().split("@")[1]);
		
		ResourceNode<Entity> newNode = new ResourceNode<>(newPacket);
		
		selectedNode.add(newNode);

		((DefaultTreeModel) MainFrame.getInstance().getWorkspaceTree().getModel()).reload();
		
		MainFrame.getInstance().getWorkspaceTree().setSelectionPath(new TreePath(selectedNode));
		
		MainFrame.getInstance().getWorkspaceTree().expandPath(new TreePath(selectedNode));
		
		if (!silent) new EditResourceDialog(newNode);
	}
	
}
