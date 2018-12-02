package tim2015.ruinfre.view.tree;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreePath;

import tim2015.ruinfre.controller.OpenEntityAction;
import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.main.ResourceView;


public class WorkspaceTree extends JTree {
	public WorkspaceTree() {
		setCellEditor(new WorkspaceTreeEditor(this, new WorkspaceTreeCellRendered()));
		setCellRenderer(new WorkspaceTreeCellRendered());
		setEditable(true);
		JTree tree = this;
		addMouseListener(new MouseAdapter(){
			 public void mousePressed(MouseEvent e) {
			        int selRow = tree.getRowForLocation(e.getX(), e.getY());
			        TreePath selPath = tree.getPathForLocation(e.getX(), e.getY());
			        if(selRow != -1) {
			        	if (e.getClickCount() == 2) {
			        		
			        		new OpenEntityAction().actionPerformed(null);
			        		
			            }
			        }
			    }
		});
	}
	
	public ResourceNode<?> getCurrentResource() {
		TreePath path = getSelectionPath();
		for (int i = 0; i < path.getPathCount(); i++) {
			if (path.getPathComponent(i) instanceof ResourceNode) {
				return (ResourceNode<?>) path.getPathComponent(i);
			}
		}
		return null;
	}
}


