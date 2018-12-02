package tim2015.ruinfre.view.main;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;

import tim2015.ruinfre.view.tree.ResourceNode;

/**
 * Dijalog za izmenu imena i kljuca resursa.
 * @author Aleksandar Karpuzov
 *
 */
public class EditResourceDialog extends JDialog{
	
	private static final long serialVersionUID = 1L;
	private JTextField tfName = new JTextField();
	private JTextField tfKey = new JTextField();
	private JButton btnCancel = new JButton("Cancel");
	private JButton btnOk = new JButton("OK");

	
	public EditResourceDialog(ResourceNode<?> node){
		
		
		
		setLayout(new FlowLayout());

		setModal(true);
		setLocationRelativeTo(null);
		setSize(270, 150);
		setResizable(false);
		
		btnOk.addActionListener( l -> {
			node.getItem().setName(tfName.getText());
			node.getItem().setKey(tfKey.getText());
			node.setUserObject(tfName.getText());
			MainFrame.getInstance().repaint();
			dispose();
		});
		
		btnCancel.addActionListener( l -> {
			dispose();
		});
		
		tfName.setText(node.getItem().getName());
		tfKey.setText(node.getItem().getKey());
		
		setTitle("Edit: " + node.getItem().getName());
		
		tfName.setPreferredSize(new Dimension(200,25));
		tfKey.setPreferredSize(new Dimension(200,25));

		add(new JLabel("Value:"));
		add(tfName);
		add(new JLabel("Key:"));
		add(tfKey);
		add(btnCancel);
		add(btnOk);
		
		setVisible(true);
	}

}
