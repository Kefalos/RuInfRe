package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import tim2015.ruinfre.view.main.AboutUs;

public class AboutAction extends AbstractAction 
{
	public AboutAction()
	{
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
		putValue(SMALL_ICON, new ImageIcon("src/resources/about.png"));
		putValue(NAME, "About");
		putValue(SHORT_DESCRIPTION, "About The Team");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) 
	{
		AboutUs a = new AboutUs();
		a.setVisible(true);
	}
}
