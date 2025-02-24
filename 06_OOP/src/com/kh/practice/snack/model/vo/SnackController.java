package com.kh.practice.snack.model.vo;

import com.kh.practice.snack.model.vo.Snack;

// controoler : 사용자의 요청을 받아서 처리하고, 그입력에 따라
//			model(데이터처리, 비즈니스 로직)과 view(화면 출력)을 연결해주는 역할

public class Snack Controller{
	
	//필드
	private Snack s= new Snack();
	
	//생성자
	public SnackController() {}// 기본 생성자
	
	// 메서드
	// 데이터를 setter를 이용하여 저장하고,
	// 저장완료 결과 반환하는 메소드
	public String saveData(String kind, String name, String flavor, 
			int numOf, int price) {
		
		s.setKind(kind);
		s.setFlavor(flavor);
		s.setNumOf(numOf);
		s.setPrice(price);
		
		return "저장 완료되었습니다."
				+ "\n 저장한 정보를 확인하시겠습니까?(y/n): ";
		
		
	}
	
	public String confirmData() {
		// 저장된 데이터를 반환함
		return s.infomation();
		
	}
}