package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;
import javax.swing.tree.DefaultMutableTreeNode;

import tim2015.ruinfre.util.GsonSerializer;
import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.main.MetaSchemeFrame;
import tim2015.ruinfre.view.tree.ResourceNode;

public class MetaSchemeEditAction extends AbstractAction
{

	public MetaSchemeEditAction()
	{
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.SHIFT_MASK));
		putValue(NAME, "Edit Meta Scheme");
		putValue(SHORT_DESCRIPTION, "Edit Meta Scheme");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		ResourceNode selectedNode = (ResourceNode)MainFrame.getInstance().getWorkspaceTree().getLastSelectedPathComponent();
		
		((GsonSerializer)MainFrame.getInstance().getSerializer()).setClass_(selectedNode.getItem().getClass());
		new MetaSchemeFrame((ResourceNode<?>) selectedNode);
	}

}
