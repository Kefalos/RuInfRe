package tim2015.ruinfre.view.main;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

import javax.swing.*;
import javax.swing.tree.DefaultTreeModel;

import tim2015.ruinfre.controller.AboutAction;
import tim2015.ruinfre.controller.AddRecord;
import tim2015.ruinfre.controller.ApplyTheChanges;
import tim2015.ruinfre.controller.CloseProgramAction;
import tim2015.ruinfre.controller.DeleteRecord;
import tim2015.ruinfre.controller.EditRelationAction;
import tim2015.ruinfre.controller.EditResourceAction;
import tim2015.ruinfre.controller.HelpAction;
import tim2015.ruinfre.controller.LoadMetaSchemeAction;
import tim2015.ruinfre.controller.MetaSchemeEditAction;
import tim2015.ruinfre.controller.NewAttributeAction;
import tim2015.ruinfre.controller.NewEntityAction;
import tim2015.ruinfre.controller.NewPacketAction;
import tim2015.ruinfre.controller.NewRelationAction;
import tim2015.ruinfre.controller.OpenEntityAction;
import tim2015.ruinfre.controller.SaveMetaSchemeAction;
import tim2015.ruinfre.controller.SearchAction;
import tim2015.ruinfre.controller.UpdateRecord;
import tim2015.ruinfre.model.Packet;
import tim2015.ruinfre.util.SqlUtil;
import tim2015.ruinfre.view.tree.ResourceNode;
import tim2015.ruinfre.view.tree.TreeFactory;

public class Menubar extends JMenuBar
{
	private JMenu file = new JMenu("File");
	private JMenu edit = new JMenu("Edit");
	private JMenu more = new JMenu("Help");

	public Menubar() 
	{
		
		file.add(new LoadMetaSchemeAction());
		file.add(new SaveMetaSchemeAction());
		file.add(new CloseProgramAction());
	
		
		edit.add(new EditResourceAction());
		edit.add(new MetaSchemeEditAction());
		edit.add(new OpenEntityAction());
		edit.add(new EditRelationAction());
		edit.addSeparator();
		
		edit.add(new NewPacketAction(false));
		edit.add( new NewEntityAction(false));
		edit.add(new NewAttributeAction());
		edit.add(new NewRelationAction());
		
		edit.addSeparator();
		
		edit.add(new NewPacketAction(true));
		edit.add( new NewEntityAction(true));
		
		edit.addSeparator();
		edit.add(new AddRecord());
		edit.add(new DeleteRecord());
		edit.add(new UpdateRecord());
		edit.add(new ApplyTheChanges());

		more.add(new HelpAction());
		more.add(new AboutAction());
		more.add(new SearchAction());
		
		more.add(new AbstractAction() {
			{
				putValue(NAME, "Debug SQL Connection");
				
			}
		@Override
		public void actionPerformed(ActionEvent arg0) {
			new JDialog() {
				private JTextField adresa;
				private JTextField user;
				private JTextField pass;
				private JTextField database;
				{
					setModal(true);
					setSize(400,400);
					setLocationRelativeTo(null);
					JPanel pane = new JPanel();
					add(pane);
					pane.setLayout(new BoxLayout(pane, BoxLayout.PAGE_AXIS));
					
					pane.add(new JLabel("Adresa:"));
					adresa = new JTextField("147.91.175.155");
					pane.add(adresa);
					
					pane.add(new JLabel("Username:"));
					user = new JTextField("ui-2017-tim201.5");
					pane.add(user);
					
					pane.add(new JLabel("Password:"));
					pass = new JTextField("tim201.5hjuh5");
					pane.add(pass);
					
					pane.add(new JLabel("Database:"));
					database = new JTextField("ui-2017-tim201.5");
					pane.add(database);
					
					pane.add(new JButton("Connect") {{
						setAction(new AbstractAction() {{
						}

						@Override
						public void actionPerformed(ActionEvent e) {
							if (SqlUtil.connect(adresa.getText(), user.getText(), pass.getText(), database.getText())) {	
								
								((DefaultTreeModel)MainFrame.getInstance().getWorkspaceTree().getModel()).setRoot(SqlUtil.createTree());
								dispose();
							}
						}
						});
							
						
					}
					});
					
					setVisible(true);
				}
			};
			
		}});
		
		add(file);
		add(edit);
		add(more);
		
	}

	
}
