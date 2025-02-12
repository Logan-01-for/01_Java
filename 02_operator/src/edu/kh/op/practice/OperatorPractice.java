package edu.kh.op.practice;

import java.util.Scanner;

//기능 제공용 클래스 
public class OperatorPractice {

	public void practice1() {
		
		/*
		 * 메소드 명 : public void practice1(){}
모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.

[실행화면]
인원 수 : 29
사탕 개수 : 100
1인당 사탕 개수 : 3
남는 사탕 개수 : 13
		 *
		 * */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원수 : ");
		int input1 = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int input2 = sc.nextInt();
		
		System.out.println("1인당 사탕 개수"+ (input2 / input1));
		System.out.println("남는 사탕 개수"+ (input2 % input1));
		
		
		public class OperatorPractice {
		public void practice2() {
			Scanner sc = new Scanner(System.in);
		}
		/*
		 * 이름 : 홍길동
학년(정수만) : 3
반(정수만) : 4
번호(정수만) : 15
성별(남학생/여학생) : 남학생
성적(소수점 아래 둘째 자리까지) : 85.75
3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.*/
		System.out.print("이름 : ");
		int input3 = sc.nextInt();
		System.out.print("학년 : ");
		int input4 = sc.nextInt();
		System.out.print("반 : ");
		int input5 = sc.nextInt();
		System.out.print("성별 : ");
		int input6 = sc.nextInt();
		System.out.print("성적 : ");
		int input7 = sc.nextInt();
		
	}
