package com.hw2.run.Run;

import com.hw2.model.dto.Prisoner;
import com.hw2.model.service.Company;
import com.hw2.model.service.ManagementSystem;

public class Run {

	public static void main(String[] args) {
		
	
	// Company의 생성자를 이용하여 10칸짜리 Employee 객체 
	//배열 생성하는  Company 객체를 생성하여 ManagementSystem 자료형의 company에 주소를 저장
	
	ManagementSystem company = new Company(10);
	
	// Prison의 생성자를 이용하여 10칸 짜리 Prisoner 객체 배열 생성생성하는 Prison 객체를 생성하여 ManagementSystem 자료형의 prison에 주소를 저장
	ManagementSystem Prison = new Prison(10);
	
	// 2명 정도 직원 새로 등록하기
	// 등록되 전체 직원 조회
	company.addPerson(new Employee("EMP001", "유재석", "기획팀"));
	
	// 2명 정도 수감자 새로 등록하기
	// 등록된 전체 수감자 조회
	
	// EMP001 id 를 가진 직원 삭제
	// 1205 id 를 가진 수강자 삭제
	
	// 현재 남은 직원 모두 조회
	// 현재 남은 수감자 모두 조회

}
}
