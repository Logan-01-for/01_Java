package com.hw1.run;

public class Run {

	public static void main(String[] args) {
		
		// Book 객체 배열 3칸 생성 후 각 인덱스 마다
		//Novel,TextBook,Poetry 생성하여 대입
		String arr[] = new String [3];
		String Book[] = {"Novel", "TextBook", "Poetry"};
		
		// 모든 도서 정보 출력
		System.out.println("제목 : 해리포터");
		System.out.println("저자 : J.K. 롤링");
		System.out.println("장르 : 판타지");
		
		System.out.println("제목 : 자바 프로그래밍");
		System.out.println(" 저자 : James Gosling");
		System.out.println("과목 : 컴퓨터 과학");
		
		System.out.println("제목 : 우리들의 사랑시");
		System.out.println("저자 : 김소월");
		System.out.println("시 수 : 30");
	}

}
