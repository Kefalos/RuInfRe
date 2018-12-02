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
import tim2015.ruinfre.view.main.EditResourceDialog;
import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.tree.ResourceNode;

public class NewPacketAction extends AbstractAction
{

	private boolean silent;
	
	public NewPacketAction(boolean silent)
	{
		super();
		this.silent = silent;
		if (silent) 
		{
			putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.SHIFT_MASK));
			putValue(NAME, "New Packet");
		} 
		else 
		{
			putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
			putValue(NAME, "New Packet...");
		}
		
		putValue(SHORT_DESCRIPTION, "Add New Packet");
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
			
		
		Packet newPacket = new Packet("New Packet","New Packet");
		
		newPacket.setKey(newPacket.toString().split("@")[1]);
		
		ResourceNode<Packet> newNode = new ResourceNode<>(newPacket);
		
		selectedNode.add(newNode);

		((DefaultTreeModel) MainFrame.getInstance().getWorkspaceTree().getModel()).reload();
		
		MainFrame.getInstance().getWorkspaceTree().setSelectionPath(new TreePath(selectedNode));
		
		MainFrame.getInstance().getWorkspaceTree().expandPath(new TreePath(selectedNode));
		
		if (!silent) new EditResourceDialog(newNode);
		
	}

}
