package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.util.FileHandler;
import tim2015.ruinfre.view.main.MainFrame;

public class ApplyTheChanges extends AbstractAction{
	
	public ApplyTheChanges() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0));
		putValue(NAME, "Apply The Changes");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			Entity ent = MainFrame.getInstance().getOpenedEntity();
		    FileHandler.ApplyTheChanges(ent);
		} catch (Exception e1) {
		    // TODO Auto-generated catch block
		    e1.printStackTrace();
		}
	}
}
