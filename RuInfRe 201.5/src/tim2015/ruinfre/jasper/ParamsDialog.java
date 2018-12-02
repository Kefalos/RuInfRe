package tim2015.ruinfre.jasper;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ParamsDialog extends JDialog{

	private String oznakaUstanove = null;
	private JTextField txtUstanova=new JTextField(2);
	
	
	
	public ParamsDialog(){
		super((JFrame)null,"Params dialog",true);
		setLayout(new GridLayout(2,1));
		setSize(400, 100);
		setLocationRelativeTo(null);
		
		JLabel lblUstanova = new JLabel("Unesi jmbg: ");
		
		JPanel panUstanova=new JPanel(new FlowLayout(FlowLayout.LEFT));
		panUstanova.add(lblUstanova);
		panUstanova.add(txtUstanova);
		
		add(panUstanova);
		
		
		JButton btnOk = new JButton("Potvrda");
		JPanel panBtn=new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panBtn.add(btnOk);
		btnOk.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				oznakaUstanove = txtUstanova.getText();
				setVisible(false);
				
			}
		});
		
		add(panBtn);
		
		
	}



	public String getOznakaUstanove() {
		return oznakaUstanove;
	}



	public void setOznakaUstanove(String oznakaUstanove) {
		this.oznakaUstanove = oznakaUstanove;
	}
	
	
}
