package tim2015.ruinfre.view.main;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import tim2015.ruinfre.model.Attribute;
import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.util.FileHandler;
import tim2015.ruinfre.util.SqlUtil;

public class UpdateRecordView2 extends JPanel 
{

	private JButton btnCancel = new JButton("Cancel");
	private JButton btnOk = new JButton("OK");
	private TextField[] nizPolja = new TextField[MainFrame.getInstance().getOpenedEntity().getAttributeCount()];
	private JTable table;
		
		public UpdateRecordView2(Entity entity) 
		{
			
			table = MainFrame.getInstance().getOpenedTab().getJTable();	
			int SelectedRowIndex = table.getSelectedRow();
			
			System.out.println(SelectedRowIndex);
			List<Attribute> atributi = entity.getAttributes();

			int i = 0;
			int k = 0;
			for (Attribute attribute : atributi) 
			{

				nizPolja[i] = new TextField();
				nizPolja[i].setPreferredSize(new Dimension(200, 25));
				nizPolja[i].setText(table.getValueAt(SelectedRowIndex, k++).toString());
				
				add(new Label(attribute.getName()));
				add(nizPolja[i++]);
			}
			setLayout(new FlowLayout());
			setSize(240, 100 * MainFrame.getInstance().getOpenedEntity().getAttributeCount());

			btnOk.addActionListener(l -> {
				int j = 0;
				String[] redKojiSeDodaje = new String[nizPolja.length];
				for (TextField textField : nizPolja) {
					redKojiSeDodaje[j++] = textField.getText();
				}

				try 
				{

					SqlUtil.updateRecord(entity, redKojiSeDodaje);
					MainFrame.getInstance().getOpenedTab().loadSql();
					((StateView) this.getParent()).startOffState();
				} 
				catch (Exception e) 
				{
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
				
			});
			btnCancel.addActionListener(l -> {
				((StateView) this.getParent()).startOffState();
			});


			add(btnCancel);
			add(btnOk);

			setVisible(true);

		}
}
