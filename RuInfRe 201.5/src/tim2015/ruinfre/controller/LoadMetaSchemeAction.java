package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultTreeModel;

import tim2015.ruinfre.model.Packet;
import tim2015.ruinfre.util.GsonSerializer;
import tim2015.ruinfre.util.SqlUtil;
import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.tree.ResourceNode;
import tim2015.ruinfre.view.tree.TreeFactory;

public class LoadMetaSchemeAction extends AbstractAction 
{

	public LoadMetaSchemeAction() 
	{
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK));
		//putValue(SMALL_ICON, new ImageIcon("src/resources/about.png"));
		putValue(NAME, "Open...");
		putValue(SHORT_DESCRIPTION, "Open Meta Scheme");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		JFileChooser chooser = new JFileChooser();
        chooser.setCurrentDirectory(chooser.getFileSystemView().getDefaultDirectory());
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("JSON Paket (*.pck)", "pck"));
        
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
	    	String metaScheme = "";
	    	try 
	    	{
				metaScheme = new String(Files.readAllBytes(Paths.get(chooser.getSelectedFile().getPath())), Charset.defaultCharset()); 
				
			} 
	    	catch (IOException e1) 
	    	{
				e1.printStackTrace();
			}
	    	
	    	GsonSerializer gson = (GsonSerializer) MainFrame.getInstance().getSerializer();
	    	gson.setClass_(Packet.class);
	    	Packet rootResource = (Packet) gson.fromJson(metaScheme);
	    	
	    	@SuppressWarnings("unchecked")
			ResourceNode<Packet> rootNode = (ResourceNode<Packet>) TreeFactory.createResourceTree(rootResource);
	    	
	    	((DefaultTreeModel)MainFrame.getInstance().getWorkspaceTree().getModel()).setRoot(rootNode);
	    	
	    	MainFrame.getInstance().closeAllTabs();
	    	
	    	SqlUtil.disconnect();
	    	
	    	String ip = rootResource.getIpAdress();
	    	String username = rootResource.getUsername();
	    	String password = rootResource.getPassword();
	    	String database = rootResource.getKey();
	    	if (ip != null && username != null && password != null) {
	    		SqlUtil.connect(ip, username, password,database);
	    	}
	    	

        }
	}
}