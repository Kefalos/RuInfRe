package tim2015.ruinfre.view.tree;

import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.MutableTreeNode;

import tim2015.ruinfre.model.Attribute;
import tim2015.ruinfre.model.Resource;


public class ResourceNode<T extends Resource> extends DefaultMutableTreeNode{

	private T item = null;
	
	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}
	
	public ResourceNode(T res) {
		super(res.getName());
		item = (T) res;
		// TODO refresh za stablo		
	}

	@Override
	public void removeFromParent(){
		
		ResourceNode<T> parent = (ResourceNode<T>) getParent();
		Resource parentRes = parent.getItem();
		parentRes.removeChild(item);
		
		super.removeFromParent();
	}
	
	@Override
	public void remove(MutableTreeNode child) {
		if (child instanceof ResourceNode) {
			
			Resource thisResource = getItem();
			Resource childResource = ((ResourceNode) child).getItem();
			thisResource.removeChild(childResource);
			
			super.remove(child);
		}
		
	}
	
	@Override
	public void add(MutableTreeNode newChild) {
		
		try {
		
			Resource childResource = ((ResourceNode)newChild).getItem();
			
			if (!item.getChildrenReadOnly().contains(childResource)) {
				
					item.addChild(childResource);
				
			}
			super.add(newChild);
		} catch (UnsupportedOperationException uoe) {
			System.err.println(uoe.getMessage());
		}
	}
	
	@Override
	
	public void removeAllChildren() {

		item.removeAllChildren();
		
		super.removeAllChildren();
		
	}
	
}
