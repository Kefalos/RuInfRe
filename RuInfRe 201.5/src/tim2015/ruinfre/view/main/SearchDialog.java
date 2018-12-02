package tim2015.ruinfre.view.main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JTextField;

import tim2015.ruinfre.model.Attribute;
import tim2015.ruinfre.model.Entity;

public class SearchDialog extends JDialog {

	private JButton btnCancel = new JButton("Cancel");
	private JButton btnOk = new JButton("OK");
	private TextField[] nizPolja;
	
	public SearchDialog() {
		Entity entity = MainFrame.getInstance().getOpenedEntity();
		List<Attribute> atributi = entity.getAttributes();
		int i = 0;
		int brojPrimarnih = 0;
		for (Attribute attribute : atributi) {
			if(attribute.isPrimaryKey()){
		    brojPrimarnih++;
			}
		}
		nizPolja  = new TextField[brojPrimarnih];
		for (Attribute attribute : atributi) {
			if(attribute.isPrimaryKey()){
		    nizPolja[i] = new TextField();
		    nizPolja[i].setPreferredSize(new Dimension(200, 25));
		    add(new Label(attribute.getName()));
		    add(nizPolja[i++]);
			}
		}
		
		
		
		
		setLayout(new FlowLayout());

		setModal(true);
		setLocationRelativeTo(null);
		setSize(270, 300);

		btnOk.addActionListener(l -> {
			// TODO nzm sta treba da uradi kada se klikne OK
			dispose();
		});

		btnCancel.addActionListener(l -> {
			dispose();
		});

		setTitle("Search");


		
		add(btnCancel);
		add(btnOk);

		setVisible(true);

	}
}
