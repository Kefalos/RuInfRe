package tim2015.ruinfre.view.tree;

import javax.swing.event.TreeModelListener;
import javax.swing.tree.DefaultTreeModel;

import tim2015.ruinfre.model.Packet;


public class WorkspaceModel extends DefaultTreeModel {
	public WorkspaceModel() {
		super(new ResourceNode<Packet>(new Packet("Workspace Root","ROOT")));
	}




}
