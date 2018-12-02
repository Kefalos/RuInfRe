package tim2015.ruinfre.controller;

import java.awt.Desktop;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

public class HelpAction extends AbstractAction
{
	public HelpAction() 
	{
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F1, 0));
		putValue(SMALL_ICON, new ImageIcon("src/resources/help.png"));
		putValue(NAME, "Help");
		putValue(SHORT_DESCRIPTION, "About The Tool");
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		File file = new File("src/resources/help.txt");

		Desktop desktop = Desktop.getDesktop();
		if (file.exists())
		{
			try
			{
				desktop.open(file);
			}
			catch (IOException e1) 
			{
				e1.printStackTrace();
			}
		}

		/**
		 * Proverava da li platforma podrzava Desktop
		 */

		if (!Desktop.isDesktopSupported()) 
		{
			System.out.println("Desktop is not supported");
			return;
		}
	}
}
