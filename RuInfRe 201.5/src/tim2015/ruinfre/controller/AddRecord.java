package tim2015.ruinfre.controller;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.ImageIcon;
import javax.swing.KeyStroke;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.view.main.AddRecordView;
import tim2015.ruinfre.view.main.MainFrame;

public class AddRecord extends AbstractAction {

	public AddRecord() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		putValue(NAME, "Add new record");

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		MainFrame.getInstance().getSv().startAddRecordState();
	}
}
