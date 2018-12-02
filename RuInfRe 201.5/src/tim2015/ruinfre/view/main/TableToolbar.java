package tim2015.ruinfre.view.main;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JToolBar;

import tim2015.ruinfre.controller.AlLoadBlock;
import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.util.SqlUtil;

public class TableToolbar extends JToolBar 
{

	private final Entity entity;
	
	private static final long serialVersionUID = 1L;

	private boolean sql;
	
	private JTextField tfBlockSize;
	private JTextField tfOffset;
	private JCheckBox cxWhole;
	private JLabel lAccessCount;

	public int getBlockSize()
	{
		return Integer.parseInt(tfBlockSize.getText());
	}

	public int getOffset() 
	{
		return Integer.parseInt(tfOffset.getText());

	}

	public boolean loadWholeFile()
	{
		return cxWhole.isSelected();
	}

	public TableToolbar(boolean sql, Entity entity) 
	{
		this.sql = sql;
		this.entity = entity;
		if (!sql) {
			setFloatable(false);
			tfBlockSize = new JTextField();
			// tfBlockSize.setPreferredSize(new Dimension(60,20));
			tfBlockSize.setText("100");
			tfOffset = new JTextField();
			tfOffset.setText("0");
			// tfOffset.setPreferredSize(new Dimension(60,20));
			cxWhole = new JCheckBox("Ceo fajl");
			cxWhole.setEnabled(false);
			JButton bLoad = new JButton("Ucitaj");
			bLoad.addActionListener(new AlLoadBlock());
			JButton bLoad2 = new JButton("Ucitaj sledeci blok");
			bLoad2.addActionListener(l -> {
				
				if (((ResourceView) getParent()).getJTable() != null)
					tfOffset.setText((Integer.parseInt(tfOffset.getText()) + Integer.parseInt(tfBlockSize.getText())) + "");
				new AlLoadBlock().actionPerformed(l);
			});
	
			add(new JLabel("Velicina bloka:"));
			add(tfBlockSize);
	
			add(new JLabel("Ofset:"));
			add(tfOffset);
			// add(cxWhole);
			add(bLoad);
			add(bLoad2);
			
			
			addSeparator();
				
			JButton bSearch = new JButton("Pretraga ucitanog segmenta...");
			add(bSearch);
			bSearch.addActionListener(l -> {
				/*
				if (((Table) getParent()).getEntity().getType().equals("Sekvencijalna")
						|| ((Table) getParent()).getEntity().getType().equals("Indeks Sekvencijalna")) {
					new BinarySearchDialog();
				}
				*/
			});
			
			
			JButton bSearch2 = new JButton("Pretraga celog fajla...");
			bSearch2.addActionListener(l -> {/*
				if (((Table) getParent()).getEntity().getType().equals("Indeks Sekvencijalna"))
					new IndexSearchDialog();
	
			*/});
			add(bSearch2);
			bSearch.addActionListener(l -> {
	
			});
			
			addSeparator();
	
			JButton bDetails = new JButton("Detalji");
			bDetails.addActionListener(l -> {
				//new DetailDialog();
			});
			add(bDetails);
			add(new JLabel("Broj pristupa: "));
			lAccessCount = new JLabel("");
			add(lAccessCount);
	
			
		} else {
			add(new JButton("Ucitaj sve") {{
				addActionListener(l -> {
					((ResourceView)getParent().getParent()).loadSql();
				});
			}
			});
			
			add (new JButton("Dodaj slog") {{
				addActionListener (l -> {
					MainFrame.getInstance().getSv().startAddRecord2State(entity);
				});
			}});
			
			add (new JButton("Pretraga") {{
				addActionListener (l -> {
					MainFrame.getInstance().getSv().startSearchState(entity);
				});
			}});
			
			add (new JButton("Sortiraj") {{
				addActionListener (l -> {
					MainFrame.getInstance().getSv().startSortState(entity);
				});
			}});
			
			add (new JButton("Update") {{
				addActionListener (l -> {
					MainFrame.getInstance().getSv().startUpdateRecord2State(entity);
				});
			}});
			
			add (new JButton("Delete") {{
				addActionListener (l -> {
					MainFrame.getInstance().getSv().startDeleteRecord2State(entity);
				});
			}});

			add (new JButton("Relacije") {{
				addActionListener (l -> {
					MainFrame.getInstance().getSv().startRelationState(entity);
				});
			}});
			
		}
		
		addSeparator();
		
		JButton bClose = new JButton("X");
		bClose.addActionListener(l -> {
			MainFrame.getInstance().closeCurrentTab();
		});
		add(bClose);
	}

	private class Adder extends JFrame
	{
		private Adder() 
		{
			
			setLocationRelativeTo(null);
			setVisible(true);
		}
		
		
	}
	
	public void setAccessCount(int count) 
	{
		lAccessCount.setText(count + "");
	}

	public void setOffset(int i)
	{
		tfOffset.setText(i + "");

	}

	public void setBlockSize(int i) 
	{
		tfBlockSize.setText(i + "");
	}
}
