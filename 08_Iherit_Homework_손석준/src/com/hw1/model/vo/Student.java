package com.hw1.model.vo;

import com.hw1.model.vo.Person.Person;

public class Student extends Person{ //상속

	private int grade;
	private String major;
	
	public Student(){}

	public Student(int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.name = name;
		this.grade = grade;
		this.major = major;
	}
	@Override
	public String information() {
		// 이름 : 홍길동 / 나이 : 20/ 신장 : 18
		return super.information() + String.format("학년 : %d / 전공 : %s, grade, major");
	}
	
}
