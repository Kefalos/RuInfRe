package tim2015.ruinfre.view.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import tim2015.ruinfre.util.Fonts;
import tim2015.ruinfre.util.Serializer;
import tim2015.ruinfre.view.tree.ResourceNode;

/**
 * Ovde se prikazuje, menja, vrsi validacija i primenjuje JSON.
 * @author Aleksandar
 *
 */
public class MetaSchemeFrame extends JFrame 
{
	private Serializer serializer = MainFrame.getInstance().getSerializer();
	private static final long serialVersionUID = 1L;
	private volatile JTextArea taMeta = new JTextArea();
	private volatile JTextField taInfo = new JTextField();
	private volatile JButton btnSave = new JButton("Sacuvaj");
	private JButton btnCancel = new JButton("Ponisti");
	private JButton btnReset = new JButton("Vrati na pocetno stanje");
	private String original;
/**
 * Vrsi se konstantna provera unetog teksta.
 */
	Thread jsonChecker = new Thread()
	{
		@Override
		public void run() 
		{
			while (!isInterrupted()) 
			{

				try 
				{
					sleep(10L);
				} 
				catch (InterruptedException e) 
				{
				}
				// btnSave.setEnabled(false);
				boolean valid;

				valid = serializer.validateSyntax(taMeta.getText());
					
				
				if (valid) 
				{
					taInfo.setText("JSON je validan.");
					//btnSave.setEnabled(true);

				} 
				else 
				{
					taInfo.setText("JSON nije validan.");
					//btnSave.setEnabled(false);

				}

			}
		}
	};

	public MetaSchemeFrame(ResourceNode<?> node) 
	{

		original = serializer.toJson(node.getItem());
		setLayout(new BorderLayout());
		setSize(600, 600);
		setLocationRelativeTo(null);
		setTitle("Izmeni JSON metasemu");

		JScrollPane scroll = new JScrollPane(taMeta);
		scroll.setPreferredSize(new Dimension(550, 500));

		add(scroll, BorderLayout.CENTER);
		
		JPanel bot = new JPanel();
		bot.setLayout(new FlowLayout());
		bot.add(taInfo);
		bot.add(btnSave);
		bot.add(btnReset);
		bot.add(btnCancel);

		add(bot,BorderLayout.SOUTH);
		
		btnReset.addActionListener(l -> {
			taMeta.setText(original);
		});

		btnCancel.addActionListener(l -> {
			dispose();
		});

		btnSave.addActionListener(l -> {
			/*
			jsonChecker.interrupt();
			
			StorageNode newNode = (StorageNode) TreeFactory.createTree(taMeta.getText());

			if (node == ((DefaultTreeModel) MainFrame.getInstance().getTree().getModel()).getRoot()){
				((DefaultTreeModel) MainFrame.getInstance().getTree().getModel()).setRoot(newNode);
			} else {
				DefaultMutableTreeNode parent = (DefaultMutableTreeNode) node.getParent();
				node.removeFromParent();
				parent.add(newNode);


			}
			
			
			
			
			((DefaultTreeModel) MainFrame.getInstance().getTree().getModel()).reload();

			MainFrame.getInstance().repaint();
			*/
			dispose();
			
		});
		
		btnSave.setEnabled(false);
		
		taMeta.setFont(Fonts.TEXT);
		taInfo.setFont(Fonts.TEXT);
		taMeta.setText(original);
		taInfo.setEditable(false);
		taInfo.setPreferredSize(new Dimension(200, 50));
		jsonChecker.start();
		
		taMeta.setCaretPosition(0);
		setVisible(true);
	}

}
