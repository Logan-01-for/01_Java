package com.hw1.model.vo.Person;

public class Person {

	// 필드
	protected String name; //이름
	// 상속받은 후손 클래스에서 직접 접근 가능
	
	
	private int age; // 나이
	private double height; // 키
	private double weight; // 몸무게
	/*
	 * private 필드는 상속을 통해 자식 클래스가 
	 * 부모 클래스의 필드를 물려받더라도
	 * getter / setter 를 이용햐여 간접 접근 해야함.
	 * 
	 * protected 필드는 상속 받은 자식이 마치 원래 본인 것이었던 것처럼
	 * 사용가능 하기 때문에 부모 필드에 직접 접근 가능.
	 * 
	 * 
	 * */
	
	public Person() {}
	


	public Person(int age, double height, double weight) {
		super();
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String information() {
		return String.format("이름 : %s / 나이 : %d / 신장 : %.1f / 몸무게 : %.1f,"
				name, age, height, weight );
		//-> 이름 : 홍길동 / 나이 : 신장 몸무게
	}
}
