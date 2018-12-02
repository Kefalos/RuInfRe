package tim2015.ruinfre.view.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.TreePath;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.model.Relation;
import tim2015.ruinfre.view.tree.ResourceNode;

public class AddRelationFram extends JFrame
{
	private JPanel panel = new JPanel();
	private JPanel southPanel = new JPanel();
	private JButton btnAddRelation = new JButton("Add Relation");
	private DefaultListModel demoList = new DefaultListModel();
	private JList<Entity> relation = new JList<>(demoList);
	private JList<Entity> tmpRelation;
	private int count = 0;
	private Entity rel;
	private Relation rel1;
	
	
	public AddRelationFram(DefaultListModel relations) 
	{
		
		tmpRelation = new JList<>(relations);
		JTree jtree = MainFrame.getInstance().getWorkspaceTree();
		visitAllNodes(jtree);
		
		/**
		 * 
		 * Ovo nece da radi ne znam zasto, ali ideja je da se prodje kroz listu entiteta koji su u relaciji i da se oni obrisu iz liste svih entiteta, kako bi
			ostali samo entiteti koji nisu u relaciji i koji mogu da se dodaju
		
		 */
//		for(int i = 0; i < tmpRelation.getModel().getSize(); i++)
//		{
//			if(relation.getModel().getElementAt(i).getName().equals(tmpRelation.getModel().getElementAt(1).getName()))
//			{
//				rel1 = new Relation(tmpRelation.getModel().getElementAt(i).getName(),tmpRelation.getModel().getElementAt(i).getKey());
//				demoList.removeElement(rel1);
//			}
//			
//		}
		
		
		
		panel.add(relation);
		southPanel.add(btnAddRelation);
		
		btnAddRelation.addActionListener(new ActionListener() 
		{
			
			@Override
			public void actionPerformed(ActionEvent e) 
			{
				rel = relation.getSelectedValue();
				relations.addElement(rel);
				
				DefaultMutableTreeNode selectedNode = null;
				try 
				{
					selectedNode = (ResourceNode)MainFrame.getInstance().getWorkspaceTree().getLastSelectedPathComponent();
				} 
				catch (ClassCastException cce)
				{
					
				}
				if (selectedNode == null)
				{
					selectedNode = (DefaultMutableTreeNode) MainFrame.getInstance().getWorkspaceTree().getModel().getRoot();
				}
					
				Entity newPacket = new Entity(rel.getName(),"New Entity");
				newPacket.setKey(newPacket.toString().split("@")[0]);
				
				ResourceNode<Entity> newNode = new ResourceNode<>(newPacket);
				
				selectedNode.add(newNode);

				((DefaultTreeModel) MainFrame.getInstance().getWorkspaceTree().getModel()).reload();
				
				MainFrame.getInstance().getWorkspaceTree().setSelectionPath(new TreePath(selectedNode));
				
				MainFrame.getInstance().getWorkspaceTree().expandPath(new TreePath(selectedNode));
				
				demoList.removeElement(rel);
			}
		});
		
		add(panel);
		add(southPanel,BorderLayout.SOUTH);
		setSize(new Dimension(250, 200));
		setLocationRelativeTo(null);
		setTitle("Add relations");
		setVisible(true);
	}
	// Prikaz svih entiteta koji nisu u relaciji, vrsi se tako sto prolazimo kroz stablo i trazimo entitete koji nisu u relaciji i dodajemo ih u listu
	//a one koji su u relacije preskacemo
	public void visitAllNodes(JTree tree)
	{
		ResourceNode root = (ResourceNode)MainFrame.getInstance().getWorkspaceTree().getModel().getRoot();
	    visitAllNodes(root);
	}

	  public void visitAllNodes(ResourceNode node) 
	  {
	    	if(node.getItem() instanceof Entity)
	    	{	
	    		//if(!(getTmpRelation().getModel().getElementAt(count).getName().equals(node.getItem().getName())))
	    		
	    		demoList.addElement(node.getItem());
	    		
	    		
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

	public JList<Entity> getRelation() 
	{
		return relation;
	}

	public JList<Entity> getTmpRelation() 
	{
		return tmpRelation;
	}	  
}
