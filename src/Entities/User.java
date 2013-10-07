package Entities;

public class User {
	private int userID;
	private String account;
	private String email;
	private String role;
	private String password;
	
	public User(){
		
	}
	
	public User(int userID, String account, String email, String role,
			String password) {
		super();
		this.userID = userID;
		this.account = account;
		this.email = email;
		this.role = role;
		this.password = password;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
