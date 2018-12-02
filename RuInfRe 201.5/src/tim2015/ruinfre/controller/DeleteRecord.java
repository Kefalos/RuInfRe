package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;

import javax.swing.AbstractAction;
import javax.swing.KeyStroke;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.util.FileHandler;
import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.main.ResourceView;

public class DeleteRecord extends AbstractAction
{
    public DeleteRecord() 
    {
    	putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_F6, 0));
	putValue(NAME, "Delete record");
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
	Entity entity = MainFrame.getInstance().getOpenedEntity();
	int index = ((ResourceView) MainFrame.getInstance().getOpenedTab()).getJTable().getSelectedRow();
	try 
	{
	    String[] redKojiSeBrise = (String[]) FileHandler.loadPhysicalBlock(index, 1, entity)[0];
	    FileHandler.deleteRecord2(entity, redKojiSeBrise);
	    MainFrame.getInstance().getSv().startDeleteRecordState(redKojiSeBrise);
	}
	catch (IOException e1) 
	{
	    // TODO Auto-generated catch block
	    e1.printStackTrace();
	} 
	catch (Exception e1) 
	{
	    // TODO Auto-generated catch block
	    e1.printStackTrace();
	}
    }
}
