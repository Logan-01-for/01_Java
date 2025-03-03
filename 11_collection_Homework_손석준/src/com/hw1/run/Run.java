package com.hw1.run;

import java.util.ArrayList;

import com.hw1.model.dto.Friend;

public class Run {
	
 public static void main(String[] args) {
	
	 // Friend 객체만 넣을 수 있는 ArrayList객체 생성 후
	 // 짱구, 철수 ,유리, 훈이, 맹구 객체 생성하여 ArrayList에 추가하기
	 ArrayList<String> friend = new ArrayList<>();
	 
	 friend.add("짱구");
	 friend.add("철수");
	 friend.add("유리");
	 friend.add("훈이");
	 friend.add("맹구");
	
	 
	 System.out.println("짱구가 떡잎방범대 대장이다!");
	
	 // List 에서 다섯 객체 중 랜덤으로 하나를 뽑아
	 // 골목 대장이 누군지 출력하기
	 
}
}
