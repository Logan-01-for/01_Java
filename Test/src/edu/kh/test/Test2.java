package edu.kh.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
 public static void main(String[] args) {
	
	 Scanner sc = new Scanner(System.in);
	 List<String> bookList = new ArrayList<String>();
	 
	 while(true) {
		 System.out.println("추가할 제목을 입력하세요  ");
		 String title = sc.next();
		 
		 if(title.equals("clear")) {
			 System.out.println("책 목록을 초기화 합니다");
			 bookList.clear();
			 continue;
		 }
		 if(title.equals("exit")) {
			 System.out.println("<<입력종료>>");
			 break;
		 }
		 if(bookList.contains(title)) {
			 System.out.println("이미 존재하는 제목입니다");
		 }else {
			 bookList.add(title);
			 System.out.println(title + "추가 완료");
		 }
	 }
	 
}
}
