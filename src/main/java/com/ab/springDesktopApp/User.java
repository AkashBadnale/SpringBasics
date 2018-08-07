package com.ab.springDesktopApp;

public class User {

	private String userName;
	private String userSurname;
	private Address  userAddress;
	
	public User() {
		super();
		
	}
	public User(String userName, String userSurname, Address userAddress) {
		super();
		this.userName = userName;
		this.userSurname = userSurname;
		this.userAddress = userAddress;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserSurname() {
		return userSurname;
	}
	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}
	public Address getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(Address userAddress) {
		this.userAddress = userAddress;
	}
	@Override
	public String toString() {
		return "\n User [userName=" + userName + ", userSurname=" + userSurname + ", userAddress=" + userAddress + "]";
	}
	
}//User
