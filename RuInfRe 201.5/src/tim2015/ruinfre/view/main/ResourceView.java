package tim2015.ruinfre.view.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

import tim2015.ruinfre.model.Attribute;
import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.model.Relation;
import tim2015.ruinfre.model.Resource;
import tim2015.ruinfre.util.FileHandler;
import tim2015.ruinfre.util.SqlUtil;
import tim2015.ruinfre.view.tree.ResourceNode;


public class ResourceView extends JPanel 
{
	/**
	 * ANDRIJA
	 * Ovu klasu preradi tako da ima jtable i onaj detail view
	 * o kome je perisa pricao
	 * 
	 */

	private String name;
	private Resource resource;//view moze da vidi model
	private JTable tblResource;
	private DefaultTableModel tableModel;
	private TableRowSorter<MyTableModel> tableSorter;
	private RowEntityFilter entityFilter;
	private RowAttributeFilter attributeFilter;
	private JTextField tfFilter;
	private JTabbedPane tabs;
	
	private JTable dataTable;
	private static final long serialVersionUID = 1L;
	private String title;
	private TableToolbar toolbar; 
	private Entity entity;
	private JScrollPane scroll;
	private JPanel scrollParent;
	private JTree indexTree = null;
	private DefaultMutableTreeNode selectedNode = null;

	
	public ResourceView(Resource resource, boolean showToolbar) 
	{
		super();
		
		
		this.resource=resource;
		toolbar = new TableToolbar(resource.isSql(),(Entity) resource); 
		setLayout(new BorderLayout());
		tabs = new JTabbedPane();
		add(tabs, BorderLayout.SOUTH);
		
		initialize(resource);
		//initTFFilter();
		add(new JScrollPane(tblResource));
		//add(tfFilter,BorderLayout.NORTH);
		

		if (showToolbar)
			add(toolbar, BorderLayout.NORTH);
		
		this.title = resource.getName();
		JTable theTable = TableFactory.createEmptyTable((Entity) resource);

		scrollParent = new JPanel();
		scrollParent.setLayout(new BorderLayout());
		scroll = new JScrollPane();
		scroll.getViewport().add(theTable.getTableHeader());
		scroll.getViewport().add(theTable);
		scrollParent.add(scroll, BorderLayout.CENTER);

		if (((Entity) resource).getAttributes().isEmpty())
		{
			try
{
				FileHandler.loadAttributes((Entity) resource);
			} 
			catch (IOException e) 
			{
				e.printStackTrace();
			}
		}
		entity = (Entity) resource;
		
		
		add(scrollParent, BorderLayout.CENTER);
		
		
		
		
		
		setVisible(true);
		
	
		
	}

	public static Entity findEntityWithKey(Resource root, String key)
	{

		System.out.println(key);
		
		if (root.getKey().equals(key))
			return (Entity) root;
		else 
		{
			for (Resource r:root.getChildrenReadOnly())
			{
				Entity ent =  findEntityWithKey(r, key);
				if (ent!=null)
					return ent;
			}
		}
		
		return null;
		
		
	}

	public static Resource findResourceWithKey(Resource root, String key)
	{

		if (root.getKey().equals(key))
			return root;
		else
		{
			for (Resource r:root.getChildrenReadOnly())
			{
				Entity ent =  findEntityWithKey(r, key);
				if (ent!=null)
					return ent;
			}
		}

		return null;


	}

	public static Resource findParentOfEntityWithKey(Resource root, String key)
	{

		if (root.getKey().equals(key))
			return (Entity) root;
		else
		{
			for (Resource r:root.getChildrenReadOnly())
			{
				Entity ent =  findEntityWithKey(r, key);
				if (ent!=null)
					return r;
			}
		}

		return null;


	}
	
	public void initialize(Resource resource)
	{
		
		setName(resource.getName());
		ArrayList<Entity> relatedEntities = new ArrayList<>();
		setSize(400, 200);
		
		 Object[] columns;
		 Object[][] data;
		
		int attributes = 0;
		for(Resource r: resource.getChildrenReadOnly())
		{
			if (r instanceof Attribute)
				attributes++;
		}
		columns = new Object[attributes];
		data = new Object[attributes][5];
		attributes=0;
		for(Resource r: resource.getChildrenReadOnly())
		{
			if (r instanceof Attribute) 
			{
				columns[attributes] = r.getName();
				attributes++;
			}
			if (r instanceof Relation)
			{
				String key = ((Relation) r).getRelation();
				Entity linked = findEntityWithKey((Resource) ((ResourceNode) MainFrame.getInstance().getWorkspaceTree().getModel().getRoot()).getItem(), key);
				//relatedEntities.add(linked);
			}
				
		}
			
		
		

		tableModel = new DefaultTableModel(data, columns);
		tblResource = new JTable(tableModel);
		
		for (Entity ent: relatedEntities)
		{
			tabs.add(new ResourceView(ent,false));
		}
	/*
		tableSorter = new TableRowSorter<MyTableModel>(tableModel);
		tableSorter.setComparator(0, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				// Case sensitive.
				return o1.compareTo(o2);
			}
		});

		List<RowSorter.SortKey> sortKeys = new ArrayList<RowSorter.SortKey>();
		sortKeys.add(new RowSorter.SortKey(0, SortOrder.ASCENDING));
		sortKeys.add(new RowSorter.SortKey(1, SortOrder.ASCENDING));
		tableSorter.setSortKeys(sortKeys);

		tableSorter.setRowFilter(constructFilter());
*/
		tblResource.setRowSorter(tableSorter);

		tblResource.getSelectionModel().addListSelectionListener(new ListSelectionListener()
		{
			@Override
			public void valueChanged(ListSelectionEvent e)
			{			
				if (!e.getValueIsAdjusting() && tblResource.getSelectedRow() != -1) 
				{
					System.out.println(tblResource.getValueAt(tblResource.getSelectedRow(), 1) + " "+ tblResource.getValueAt(tblResource.getSelectedRow(), 2));
				}
			}
		});
		
		tblResource.getSelectionModel().setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

		tblResource.setPreferredScrollableViewportSize(new Dimension(500, 400));

		tblResource.setFillsViewportHeight(true);
	}

	private void initTFFilter()
	{
		tfFilter = new JTextField();
		
		tfFilter.getDocument().addDocumentListener(new DocumentListener() 
		{
			@Override
			public void removeUpdate(DocumentEvent e)
			{
				filter(tfFilter.getText());
			}

			@Override
			public void insertUpdate(DocumentEvent e)
			{
				filter(tfFilter.getText());
			}

			@Override
			public void changedUpdate(DocumentEvent e) 
			{
				filter(tfFilter.getText());
			}
		});
	}

	private void filter(String value) 
	{
		entityFilter.setValue(value);
		attributeFilter.setValue(value);
		tableSorter.sort();
	}

	private RowFilter<MyTableModel, Integer> constructFilter() 
	{
		entityFilter = new RowEntityFilter();
		attributeFilter = new RowAttributeFilter();

		List<RowFilter<MyTableModel, Integer>> filters = new ArrayList<RowFilter<MyTableModel, Integer>>(2);
		filters.add(entityFilter);
		filters.add(attributeFilter);
		RowFilter<MyTableModel, Integer> orFilter = RowFilter.orFilter(filters);
		return orFilter;
	}

	public String getName()
{
		return name;
	}

	public void setName(String Name)
	{
		this.name = Name;
		//TODO mozda nesto treba da se pozove kada se ime promeni
	}

	public Resource getResource()
	{
		return resource;
	}

	public void setResource(Resource resource) 
	{
		this.resource = resource;
	}
	
	
	public JTable getJTable() 
	{

		return dataTable;
	}


	public void setTheTable(JTable theTable) 
	{
		scrollParent.removeAll();
		scroll = new JScrollPane();
		scroll.getViewport().add(theTable.getTableHeader());
		scroll.getViewport().add(theTable);
		add(scroll, BorderLayout.CENTER);
		dataTable = theTable;
		scrollParent.add(scroll, BorderLayout.CENTER);
		
		
	}

	public int getBlockSize() 
	{
		return toolbar.getBlockSize();
	}

	public int getOffset() 
	{
		return toolbar.getOffset();
	}

	public boolean loadWholeFile() 
	{
		return toolbar.loadWholeFile();
	}

	public void setAccessCount(int count) 
	{
		toolbar.setAccessCount(count);
	}

	public String getTitle()
	{
		return title;
	}

	public Entity getEntity()
	{
		return entity;
	}

	public DefaultMutableTreeNode getSelectedNode() {
		
		return selectedNode;
	}

	public void setOffset(int i)
	{
		toolbar.setOffset(i);
	}
	
	public void setBlockSize(int i)
	{
		toolbar.setBlockSize(i);
		
	}

	public ResourceNode getIndexTreeRoot() 
	{
		return (ResourceNode) ((DefaultTreeModel)indexTree.getModel()).getRoot();
	}

	public JTree getIndexTree() 
	{
		
		return indexTree;
	}
	
	public void loadSql() {
		if (resource.isSql()) {
			try {
				Object[][] data = SqlUtil.loadData(entity);
				System.out.println(data);
				setTheTable(TableFactory.createTable(entity, data));
				MainFrame.getInstance().repaint();
	
			} catch (SQLException e) {
				
				JOptionPane.showMessageDialog (null, (e.getMessage()));
			}
			
		}
	}
}
