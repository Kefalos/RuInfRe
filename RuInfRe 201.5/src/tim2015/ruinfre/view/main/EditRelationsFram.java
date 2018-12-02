package tim2015.ruinfre.view.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTree;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.model.Relation;
import tim2015.ruinfre.model.Resource;
import tim2015.ruinfre.view.tree.ResourceNode;

public class EditRelationsFram extends JFrame
{

	private Entity openedEntity;
	private DefaultListModel demoList = new DefaultListModel();
	private JList<Relation> relations = new JList<>(demoList);
	private JPanel panelOfItems = new JPanel();
	private JPanel panelOfBtn = new JPanel();
	private JButton btnDelete = new JButton("Delete");
	private JButton btnAdd = new JButton("Add");
	private String kljuc;
	private int count = 0;
	private String tmp;
	
	public EditRelationsFram(ResourceNode<?> node)
	{
		JTree jtree = MainFrame.getInstance().getWorkspaceTree();
		visitAllNodes(jtree);
		
		openedEntity  = (Entity)((ResourceNode)MainFrame.getInstance().getWorkspaceTree().getLastSelectedPathComponent()).getItem();
		
		panelOfItems.add(relations);
		panelOfItems.setLayout(new FlowLayout());
		
		for(Relation r: openedEntity.getRelations()) {
			demoList.addElement(r);
		}
		
		btnAdd.setPreferredSize(new Dimension(80, 25));
		btnDelete.setPreferredSize(new Dimension(80, 25));
		
		panelOfBtn.add(btnAdd);
		panelOfBtn.add(btnDelete);
		
		btnDelete.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				Entity parent = (Entity)((ResourceNode)MainFrame.getInstance().getWorkspaceTree().getLastSelectedPathComponent()).getItem();
				Entity remove = ResourceView.findEntityWithKey((Resource)((ResourceNode<?>) MainFrame.getInstance().getWorkspaceTree().getModel().getRoot()).getItem(), (
						(Relation)demoList.getElementAt(relations.getSelectedIndex())).getRelation());
				
				
				
				getDemoList().removeElement(remove);
				
			}
		});
		
		
		btnAdd.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				new AddRelationFram(getDemoList());
				
			}
		});
		
		this.add(panelOfBtn,BorderLayout.SOUTH);
		this.add(panelOfItems);
		this.setSize(new Dimension(250, 200));
		this.setLocationRelativeTo(null);
		this.setTitle("EditRelations");
		this.setVisible(true);
		
	}
	
	public void visitAllNodes(JTree tree)
	{
		ResourceNode root = (ResourceNode)MainFrame.getInstance().getWorkspaceTree().getLastSelectedPathComponent();
	    visitAllNodes(root);
	}

	  public void visitAllNodes(ResourceNode node) 
	  {
	    	if(node.getItem() instanceof Entity)
	    	{	
	    		if(count == 0)
	    		{
	    			kljuc = node.getItem().getKey();
	    			demoList.addElement(node.getItem());
	    			count++;
	    		}
	    		else
	    		{
	    			tmp = kljuc;
	    			kljuc = node.getItem().getKey();
		    		node.getItem().setKey(tmp);
		    		demoList.addElement(node.getItem());
		    		count++;
	    		}
	    	}
	    
	    	if (node.getChildCount() >= 0) 
	    	{
			      for (Enumeration e = node.children(); e.hasMoreElements();) 
			      {
			        ResourceNode n = (ResourceNode) e.nextElement();
			        visitAllNodes(n);
			      }
	    	}
	  }	  
	  
	
	public JList<Relation> getRelations()
	{
		return relations;
	}
	
	public DefaultListModel getDemoList() 
	{
		return demoList;
	}

	public Relation getSelectedRelation() 
	{
		return relations.getSelectedValue();
	}
	
	public Resource getOpenedEntity() 
	{
		return openedEntity;
	}
}
