package tim2015.ruinfre.model;

public class Packet extends Container{

	private String ip;
	
	private String username;
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	private String password;
	
	public Packet() {
		super();
	}

	public Packet(String name, String key) {
		super(name, key);
	}

	
	@Override
	public Class<?> getChildClass(){
		return Container.class;
	}
	@Override
	public boolean canHaveChildren() {
		return true;
	}

	public String getIpAdress() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}


}