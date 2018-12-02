package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.main.UpdateRecordView2;

public class UpdateRecord extends AbstractAction {
	public UpdateRecord() {
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0));
		putValue(NAME, "Update record");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		MainFrame.getInstance().getSv().startUpdateRecordState();
	}
}
