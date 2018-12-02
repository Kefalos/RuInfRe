package tim2015.ruinfre.jasper;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GenerateReport extends JFrame {

	public GenerateReport(){
		setSize(300,300);
		setTitle("Jasper Reports");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		JButton btn = new JButton("iReport");
		btn.addActionListener(new ReportActionListener());
		add(btn);
		
		setLocationRelativeTo(null);
	}
}
