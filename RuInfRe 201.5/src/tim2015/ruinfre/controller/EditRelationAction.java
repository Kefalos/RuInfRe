package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import tim2015.ruinfre.util.GsonSerializer;
import tim2015.ruinfre.view.main.EditRelationsFram;
import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.main.MetaSchemeFrame;
import tim2015.ruinfre.view.tree.ResourceNode;

public class EditRelationAction extends AbstractAction
{
	public EditRelationAction() 
	{
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.SHIFT_MASK));
		putValue(NAME, "Edit Relations");
		putValue(SHORT_DESCRIPTION, "Edit Relations");
	}
	

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		ResourceNode selectedNode = (ResourceNode)MainFrame.getInstance().getWorkspaceTree().getLastSelectedPathComponent();
		
		((GsonSerializer)MainFrame.getInstance().getSerializer()).setClass_(selectedNode.getItem().getClass());
		new EditRelationsFram(selectedNode);
		
		
	}

}
