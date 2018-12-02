package tim2015.ruinfre.jasper;

import java.sql.Connection;
import java.sql.DriverManager;

import javax.swing.JOptionPane;

public class DBConnection {
	
	
	private static DBConnection instance = null;
	private Connection conn = null;
	
	
	private String server = "147.91.175.155";
	private String database = "ui-2017-tim201.5";
	private String userName = "ui-2017-tim201.5";
	private String password = "tim201.5hjuh5";
	
	private DBConnection(){
		
		initConnection();
		
	}
	
	
	public static DBConnection getInstance(){
		if (instance==null){
			instance = new DBConnection();
		}
		
		return instance;
	}
	
	
	public void initConnection() {
		try {
			Class.forName("net.sourceforge.jtds.jdbc.Driver");
			
			conn=DriverManager.getConnection(
					"jdbc:jtds:sqlserver://"+server+"/"+database,
					userName,
					password);
			
			
		} catch (ClassNotFoundException e) {
			
			JOptionPane.showMessageDialog(null, e.getMessage());
			
		} catch (Exception e) {
			
			JOptionPane.showMessageDialog(null, e.getMessage());
		}
	}


	public Connection getConn() {
		return conn;
	}
	

}
