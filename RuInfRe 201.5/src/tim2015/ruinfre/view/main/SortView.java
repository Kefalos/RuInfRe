package tim2015.ruinfre.view.main;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


import javafx.scene.layout.Border;
import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.util.SqlUtil;


public class SortView extends JPanel
{
	private Entity entity;
	private JPanel center;
	private SortView dialog;
	private static final int MAX = 4;
	private int queries = 1;
	
	public SortView(Entity entity)
	{
		this.entity = entity;
		dialog = this;
		
		setSize(300, 150);
		setLayout(new BorderLayout());
		
		center = new JPanel();
		
		add(center,BorderLayout.CENTER);
		
		center.add(new ParameterPanel(entity,false));
		
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
		
				
				bot.add(new JButton("SORTIRAJ") 
				{
					{
						addActionListener(l -> {
							try 
							{
								MainFrame.getInstance().getOpenedTab().setTheTable(TableFactory.createTable(entity, SqlUtil.sortRecords(entity, dialog.getAll())));
								MainFrame.getInstance().repaint();
								java.awt.Container p = ( this.getParent());
								MainFrame.getInstance().getSv().startOffState();
							} catch (SQLException e) 
							{
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
		 JComboBox<String> field;
		 JComboBox<String> sorting;
		 JButton remove;

		private ParameterPanel(Entity entity, boolean isFirst) 
		{
			this.entity = entity;
			setLayout(new GridLayout(1, 5, 0, 0));


			String[] fields = new String[entity.getAttributeCount()];
			for (int i = 0; i < entity.getAttributeCount(); i++) 
			{
				fields[i] = entity.getAttributes().get(i).getKey();
			}

			field = new JComboBox<>(fields);
			add(field);

			String[] operations = { "ASC ", "DESC"};
			sorting = new JComboBox<>(operations);
			add(sorting);
			
			remove = new JButton("Ukloni") 
			{
				{
					addActionListener(l->{
						center.remove(this.getParent());
						queries--;
						
						dialog.invalidate();
						dialog.validate();
						dialog.repaint();
					});
				}
			};
			add(remove);
			}
		
	}
	
	private String[][] getAll()
	{
		
		int counter = 0;
		for(Component c: center.getComponents()) 
		{
			counter++;
		}
		
		String[][] res = new String[2][counter];
		
		counter = 0;
		for(Component c: center.getComponents()) 
		{
			res[0][counter] = (String) ((ParameterPanel)c).field.getSelectedItem();
			res[1][counter] = (String) ((ParameterPanel)c).sorting.getSelectedItem();
			counter++;
		}
		return res;
	}

}
