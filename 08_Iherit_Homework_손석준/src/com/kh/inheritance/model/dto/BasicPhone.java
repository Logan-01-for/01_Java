package com.kh.inheritance.model.dto;

public class BasicPhone {

	public void ex1() {
	
		SmartPhone sp = new SmartPhone();
		
		sp.setBrand("Brand : Samsung");
		sp.setModel("Model : Galaxy S20");
		sp.setYear(2020);
		sp.setPrice(100000);
		
		
		
		
		System.out.println(sp.getBrand());
		System.out.println(sp.getModel());
		System.out.println(sp.getYear());
		System.out.println(sp.getPrice());
		
		System.out.println("========================");
		
		
	}
	
	public void ex2() {
		
		BasicPhone bp = new BasicPhone("Nokia", 3310, 2000, 100000);
		
	
		System.out.println(bp.getBrand());
		System.out.println(bp.getModel());
		System.out.println(bp.getYear());
		System.out.println(bp.getPrice());
		
		System.out.println("========================");
		
	}

}
	
	

