package tim2015.ruinfre.app;

import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

import tim2015.ruinfre.jasper.GenerateReport;
import tim2015.ruinfre.view.main.MainFrame;

public final class RuInfRe {
	public static void main(String[] args)  {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			
			e.printStackTrace();
		}
		MainFrame.getInstance();
		GenerateReport mainFrame = new GenerateReport();
		mainFrame.setVisible(true);
	}
}
