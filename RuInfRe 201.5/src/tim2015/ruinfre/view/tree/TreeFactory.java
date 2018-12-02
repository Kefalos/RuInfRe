package tim2015.ruinfre.view.tree;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

import javax.swing.tree.DefaultMutableTreeNode;

import tim2015.ruinfre.model.Attribute;
import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.model.Packet;
import tim2015.ruinfre.model.Relation;
import tim2015.ruinfre.model.Resource;
import tim2015.ruinfre.util.FileHandler;

public class TreeFactory {

	public static ResourceNode<?> createResourceTree(Resource rootResource) {

		
		Class<?> class_ = rootResource.getClass();
		
		ResourceNode<?> rootNode = null;
		
		if (class_ == Packet.class) {
			
			rootNode = new ResourceNode<Packet>((Packet) rootResource);
			for (Resource res: rootResource.getChildrenReadOnly()) {
				rootNode.add(createResourceTree(res));
			}
		}
		
		if (class_ == Entity.class) {
			
			rootNode = new ResourceNode<Entity>((Entity) rootResource);
			for (Resource res: rootResource.getChildrenReadOnly()) {
				rootNode.add(createResourceTree(res));
			}
		}
		
		if (class_ == Attribute.class) {
			
			rootNode = new ResourceNode<Attribute>((Attribute) rootResource);

		}
		
		if (class_ == Relation.class) {
			
			rootNode = new ResourceNode<Relation>((Relation) rootResource);

		}
		
		return rootNode;
		
	}

/*
	public static Tree createIndexTree(Entity entity) {

		Tree object = null;
		
		
		try {
			FileInputStream fileInputStream;
			fileInputStream = new FileInputStream(FileHandler.switchType(entity.getFile(),entity.getExtensions()[2]));
			
			BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
			ObjectInputStream objectInputStream = new ObjectInputStream(bufferedInputStream);
			object = (Tree) objectInputStream.readObject();
			objectInputStream.close();
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		return object;
	}*/
	
}
