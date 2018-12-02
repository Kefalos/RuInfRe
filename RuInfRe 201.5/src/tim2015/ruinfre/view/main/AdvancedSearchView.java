package tim2015.ruinfre.view.main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.util.SqlUtil;

public class AdvancedSearchView extends JPanel 
{

	private static final int MAX = 4;

	private Entity entity;
	private int queries = 1;

	private JPanel center;
	
	private AdvancedSearchView maine;
	
	public AdvancedSearchView(Entity entity) 
	{
		
		maine = this;
		this.entity = entity;
		setSize(400, 200);
		
		setLayout(new BorderLayout());
		
		center = new JPanel();
		
		add(center,BorderLayout.CENTER);
		
		center.add(new ParameterPanel(entity, true));

	
		
		JPanel bot = new JPanel();
		
		bot.setLayout(new FlowLayout());
		bot.add(new JButton("Dodaj") {{
			addActionListener(l -> {
				if (queries < MAX) 
				{
					center.add(new ParameterPanel(entity,false));
					queries++;
					
					getParent().getParent().invalidate();
					getParent().getParent().validate();
					getParent().getParent().repaint();
				}
				
			});
		}
			
		});
		
		bot.add(new JButton("OK") {
			{
				addActionListener(l -> {
					try {
						MainFrame.getInstance().getOpenedTab().setTheTable(TableFactory.createTable(entity, SqlUtil.searchRecords(entity, maine.getAll())));
						MainFrame.getInstance().repaint();
						((StateView) this.getParent()).startOffState();
					} catch (SQLException e) {
						JOptionPane.showMessageDialog(null, e.getMessage());
					}
				});
			}
		});
		
		add(bot,BorderLayout.SOUTH);
	}

	private class ParameterPanel extends JPanel 
	{
		private Entity entity;
		 JComboBox<String> andor;
		 JComboBox<String> field;
		 JComboBox<String> operation;
		 JTextField query;
		 JButton remove;

		private ParameterPanel(Entity entity, boolean isFirst) 
		{
			this.entity = entity;
			setLayout(new GridLayout(1, 5, 0, 0));

			String[] strings = { "AND", "OR" };
			andor = new JComboBox<>(strings);
			add(andor);

			String[] fields = new String[entity.getAttributeCount()];
			for (int i = 0; i < entity.getAttributeCount(); i++) 
			{
				fields[i] = entity.getAttributes().get(i).getKey();
			}

			field = new JComboBox<>(fields);
			add(field);

			String[] operations = { "=", "<", ">" ," like " };
			operation = new JComboBox<>(operations);
			add(operation);

			query = new JTextField();
			add(query);

			remove = new JButton("Ukloni") {
				{
					addActionListener(l->{
						center.remove(this.getParent());
						queries--;
						
						maine.invalidate();
						maine.validate();
						maine.repaint();
					});
				}
			};
			add(remove);

			if (isFirst) 
			{
				andor.setEnabled(false);
				remove.setEnabled(false);
			}
		}

		
	}
	
	private String[][] getAll() 
	{
		int counter = 0;
		for(Component c: center.getComponents()) 
		{
			counter++;
		}
		
		String[][] res = new String[4][counter];
		
		counter = 0;
		for(Component c: center.getComponents()) 
		{
			res[0][counter] = (String) ((ParameterPanel)c).andor.getSelectedItem();
			res[1][counter] = (String) ((ParameterPanel)c).field.getSelectedItem();
			res[2][counter] = (String) ((ParameterPanel)c).operation.getSelectedItem();
			res[3][counter] = (String) ((ParameterPanel)c).query.getText();
			counter++;
		}
		
		return res;
	}
}
