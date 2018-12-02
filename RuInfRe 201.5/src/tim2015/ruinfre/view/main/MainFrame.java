package tim2015.ruinfre.view.main;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;

import tim2015.ruinfre.model.Entity;
import tim2015.ruinfre.util.GsonSerializer;
import tim2015.ruinfre.util.Serializer;
import tim2015.ruinfre.view.tree.WorkspaceModel;
import tim2015.ruinfre.view.tree.WorkspaceTree;

public class MainFrame extends JFrame {	
	private Serializer serializer = new GsonSerializer(tim2015.ruinfre.model.Resource.class);
	private static MainFrame instance = null;
	private Menubar menu;
	private JPanel desktop;
	private WorkspaceTree workspaceTree;
	private WorkspaceModel workspaceModel;
	private JTabbedPane tab = new JTabbedPane();
	private StateView sv;
	public MainFrame() {
		super();
		initialiseWorkspaceTree();
	}

	public void initialize() {
		setTitle("RuInfRe - Tim 201.5");
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		this.setBounds(0, 0, screenSize.width * 3 / 5, screenSize.height * 3 / 5);
		this.setLocationRelativeTo(null);
		menu = new Menubar();
		this.setJMenuBar(menu);
		JScrollPane scroll = new JScrollPane(workspaceTree);
		scroll.setPreferredSize(new Dimension(250, 150));
		this.add(scroll, BorderLayout.WEST);
		
		desktop = new JPanel();
		desktop.setLayout(new BorderLayout());
		desktop.add(tab,BorderLayout.CENTER);
		this.add(desktop, BorderLayout.CENTER);
		 sv = new StateView();
		this.add(sv, BorderLayout.SOUTH);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static MainFrame getInstance() {
		if (instance == null) {
			instance = new MainFrame();
			instance.initialize();
		}
		return instance;
	}

	private void initialiseWorkspaceTree() {
		workspaceTree = new WorkspaceTree();
		workspaceModel = new WorkspaceModel();
		workspaceTree.setModel(workspaceModel);
	}

	public void addTab(ResourceView r){
		this.tab.add(r);
	}

	public JPanel getDesktop() {
		return desktop;
	}

	public void setDesktop(JPanel desktop) {
		this.desktop = desktop;
	}

	public WorkspaceTree getWorkspaceTree() {
		return workspaceTree;
	}

	public void setWorkspaceTree(WorkspaceTree workspaceTree) {
		this.workspaceTree = workspaceTree;
	}

	public WorkspaceModel getWorkspaceModel() {
		return workspaceModel;
	}

	public void setWorkspaceModel(WorkspaceModel workspaceModel) {
		this.workspaceModel = workspaceModel;
	}

	public JTabbedPane getTab() {
		return tab;
	}

	public void setTab(JTabbedPane tab) {
		this.tab = tab;
	}

	public Serializer getSerializer() {
		return serializer;
	}

	public void setSerializer(Serializer serializer) {
		this.serializer = serializer;
	}
	
	public Entity getOpenedEntity() {
		return ((ResourceView) tab.getSelectedComponent()).getEntity();
	}
	
	public ResourceView getOpenedTab() {

		return (ResourceView) tab.getSelectedComponent();
	}
	
	public void closeCurrentTab() {

		 tab.remove(tab.getSelectedComponent());
	}
	
	public void closeAllTabs() {
		tab.removeAll();
	}

	public StateView getSv() {
		return sv;
	}

	public void setSv(StateView sv) {
		this.sv = sv;
	}
	
}
