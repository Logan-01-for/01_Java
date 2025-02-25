package com.kh.inheritance.model.dto;

import com.kh.inheritance.model.dto.Phone.Phone;

public class SmartPhone {
	
	public void ex2() {
		
		Phone ph = new Phone();
		
		ph.setBrand("Brand :  Nokia");
		ph.setModel("Model : 3310");
		ph.setYear(2000);
		ph.setPrice(100000);
		
		System.out.println(ph.getBrand());
		System.out.println(ph.getModel());
		System.out.println(ph.getYear());
		System.out.println(ph.getPrice());
		
		System.out.println("========================");
		
	}

}
