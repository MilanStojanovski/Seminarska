package security;

import java.net.PasswordAuthentication;

public class User {

	private PasswordAuthentication userPass;
	private String role;
	private String MBR;
	public PasswordAuthentication getUserPass() {
		return userPass;
	}
	public void setUserPass(PasswordAuthentication userPass) {
		this.userPass = userPass;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	
	}
	
	
}
