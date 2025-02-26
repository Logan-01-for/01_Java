package edu.kh.poly.ex2.model.service;

public class TestInterface {

	public abstract int plus (int num1, int num2);
	
	public abstract String test();
	
	// Java 8 이후에는 디폴트 메서드(구현)
	default void display() {
		System.out.println("TestInterfae의 display");
	}
}
