package com.ssm.entity;

public class School {
	int id;
	String name;
	User user;
	public School() {
		super();
	}
	public School(int id, String name, User user) {
		super();
		this.id = id;
		this.name = name;
		this.user = user;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
}
