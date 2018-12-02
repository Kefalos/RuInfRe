package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.JFileChooser;
import javax.swing.KeyStroke;
import javax.swing.filechooser.FileNameExtensionFilter;

import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.tree.ResourceNode;

public class SaveMetaSchemeAction extends AbstractAction
{

	public SaveMetaSchemeAction() 
	{
		putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		//putValue(SMALL_ICON, new ImageIcon("src/resources/about.png"));
		putValue(NAME, "Save As...");
		putValue(SHORT_DESCRIPTION, "Save Meta Scheme");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		
		JFileChooser chooser = new JFileChooser();
		chooser.setCurrentDirectory(chooser.getFileSystemView().getDefaultDirectory());
        chooser.setAcceptAllFileFilterUsed(false);
        chooser.addChoosableFileFilter(new FileNameExtensionFilter("JSON Paket (*.pck)", "pck"));
		chooser.setSelectedFile(new File("MetaSema.pck"));
		int rVal = chooser.showSaveDialog(MainFrame.getInstance());
		
        
		if (rVal == JFileChooser.APPROVE_OPTION)
{
			
			File file = chooser.getSelectedFile();
			try 
			{
				BufferedWriter writer = new BufferedWriter (new FileWriter(file.getAbsoluteFile(),true));
				writer.append(MainFrame.getInstance().getSerializer().toJson(((ResourceNode<?>)MainFrame.getInstance().getWorkspaceTree().getModel().getRoot()).getItem()));
				writer.close();     
			} 
			catch (IOException e) 
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
      }
      if (rVal == JFileChooser.CANCEL_OPTION) 
      {
    	  
      }
	}
		
		

}


