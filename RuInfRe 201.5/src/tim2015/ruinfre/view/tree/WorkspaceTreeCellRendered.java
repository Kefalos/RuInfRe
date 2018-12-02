package tim2015.ruinfre.view.tree;

import java.awt.Component;

import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellRenderer;

public class WorkspaceTreeCellRendered extends DefaultTreeCellRenderer {
	public WorkspaceTreeCellRendered() {
		super();
	}

	public Component getTreeCellRendererComponent(JTree tree, Object value, boolean sel, boolean expanded, boolean leaf,int row, boolean hasFocus) {
		super.getTreeCellRendererComponent(tree, value, sel, expanded, leaf, row, hasFocus);

		return this;
	}
}
