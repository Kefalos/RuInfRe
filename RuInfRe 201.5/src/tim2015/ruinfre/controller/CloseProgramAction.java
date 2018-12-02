package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import tim2015.ruinfre.view.main.MainFrame;

public class CloseProgramAction extends AbstractAction
{

	public CloseProgramAction() 
	{
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F4, ActionEvent.ALT_MASK));
		//putValue(SMALL_ICON, new ImageIcon("src/resources/about.png"));
		putValue(NAME, "Exit");
		putValue(SHORT_DESCRIPTION, "Close Program");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		
		MainFrame.getInstance().dispose();

	}

}
