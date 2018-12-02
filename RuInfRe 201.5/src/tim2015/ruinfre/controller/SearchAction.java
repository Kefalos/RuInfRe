package tim2015.ruinfre.controller;

import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;

import tim2015.ruinfre.view.main.SearchDialog;

public class SearchAction  extends AbstractAction{
	public SearchAction(){
	putValue(NAME, "Search");
	}
	public void actionPerformed(ActionEvent arg0) 
	{
		new SearchDialog();
	}
}
