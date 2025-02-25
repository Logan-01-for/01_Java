package com.hw1.model.vo.Employee;

import com.hw1.model.vo.Person.Person;

	
	public class Employee extends Person{
		
		private int salary; // 급여
		private String dept;// 부서
		
		public Employee(String name, int age, double height, double weight, int salary, String dept, String information) {
			super(age, height, weight);
			this.name = name; // 부모 person 에 작성된 필드 중 protected 접근제한자 name
			this.salary = salary;
			this.dept = dept;
		// 필드에 초기화
		}
		// ovarriding = ctrl + space = override
	@Override
	public String information() {
		// 이름
		return super.information() + String.format(" / 급여 : %d/ 부서 : %s, sallary, dept);
	}
			
	
	}
	
	
	

