package com.hw1.model.dto;

public class Friend {

	public class Friend implements Comparable<Friend>{
	// 속성
	
	private String name;

	public Friend(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		
		return "Friend [ name=" + name +", pickLeader=" + pickLeader + score[ "="];
	}
	
	}
	
}
