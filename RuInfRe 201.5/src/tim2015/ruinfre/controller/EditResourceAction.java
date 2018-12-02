package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import javax.swing.tree.DefaultMutableTreeNode;

import tim2015.ruinfre.view.main.EditResourceDialog;
import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.tree.ResourceNode;

public class EditResourceAction extends AbstractAction 
{
	
	public EditResourceAction()
	{
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		//putValue(SMALL_ICON, new ImageIcon("src/resources/help.png"));
		putValue(NAME, "Edit Name and Key");
		putValue(SHORT_DESCRIPTION, "Edit Name and Key");
	}
	
	
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
			System.err.println(cce.getMessage());
		}
		if ( selectedNode == null) 
		{
			selectedNode = (DefaultMutableTreeNode) MainFrame.getInstance().getWorkspaceTree().getModel().getRoot();
		}
		new EditResourceDialog((ResourceNode<?>) selectedNode);
		
	}

}
