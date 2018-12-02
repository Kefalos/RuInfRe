package tim2015.ruinfre.view.tree;

import java.beans.PropertyVetoException;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JDesktopPane;
import javax.swing.JInternalFrame;
import javax.swing.SwingUtilities;

import tim2015.ruinfre.view.main.MainFrame;
import tim2015.ruinfre.view.main.ResourceView;

public class WorkspaceView extends JDesktopPane implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		/*
		WorkspaceEvent eventObject = (WorkspaceEvent) arg;
		Resource resource = eventObject.getResource();

		if (eventObject.getType() == WorkspaceEventType.ADD_RESOURCE) {
			// Dodavanje view-a i registrovanje kao osluskivaca na odgovarajuci
			// project
			
			ResourceView resourceView = new ResourceView(resource);
			add(resourceView);
			resourceView.setVisible(true);
			resource.addObserver(resourceView);
		} else if (eventObject.getType() == WorkspaceEventType.OPEN_RESOURCE) {
			ResourceView resourceView = new ResourceView(resource);
			add(resourceView);
			resourceView.setVisible(true);
			resource.addObserver(resourceView);
		}
		
		SwingUtilities.updateComponentTreeUI(MainFrame.getInstance().getWorkspaceTree());*/
	}
}
