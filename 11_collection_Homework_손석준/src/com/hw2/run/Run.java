package com.hw2.run;

import com.hw2.model.dto.Monkey;
import com.hw2.model.dto.Tiger;
import com.hw2.model.service.Zoo;

public class Run {
 
	public static void main(String[] args) {
	
		// Zoo 객체 생성
		// Tiger 객체 생성하여 zoo에 추가하기
		
		// 동물원 메뉴 출력하여 입력한 값대로 코드 수행하기
		
		Zoo zoo = new Zoo();
		zoo.addAnimail(new Tiger("호랑이"));
		zoo.addAnimail(new Monkey("원숭이"));
		zoo.displayMenu();
		
}
}
