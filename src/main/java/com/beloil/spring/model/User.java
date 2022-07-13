package com.beloil.spring.model;

public class User {
	
	private  int userId;
	private String userName;
	private String fio;
	private String passwordHash;
	private int age;	
	
	public User(int userId, String userName, String fio, String passwordHash, int age) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.fio = fio;
		this.passwordHash = passwordHash;
		this.age = age;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getFio() {
		return fio;
	}
	public void setFio(String fio) {
		this.fio = fio;
	}
	public String getPasswordHash() {
		return passwordHash;
	}
	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", fio=" + fio + ", passwordHash=" + passwordHash
				+ ", age=" + age + "]";
	}
}
