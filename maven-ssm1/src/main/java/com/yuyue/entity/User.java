package com.yuyue.entity;



public class User {
	
	private String userName;
	private String passWord;
	private String selfie;
	
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getSelfie() {
		return selfie;
	}
	public void setSelfie(String selfie) {
		this.selfie = selfie;
	}
	
	public User() {
		super();
	}
	public User(String userName, String passWord, String selfie) {
		super();
		this.userName = userName;
		this.passWord = passWord;
		this.selfie = selfie;
	}

}
