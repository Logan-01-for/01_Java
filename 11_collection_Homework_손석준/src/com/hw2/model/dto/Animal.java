package com.hw2.model.dto;

public abstract class Animal {

	// 속성
	private String name;

	// 기능
	
	public Animal(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public abstract void sound();
	
	}
	
	

