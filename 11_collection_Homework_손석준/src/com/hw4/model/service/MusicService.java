package com.hw4.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;
import com.hw4.model.dto.Music;

public class MusicService {

	// 필드
	private Scanner sc = new Scanner(System.in); 

	private List<Music> library = new ArrayList<Music>();
	
	// 즐겨찾기 도서를 저장할 목록 List 
	private List<Music> favList = new ArrayList<Music>();
	
	public MusicService() { // 기본 생성자

		library.add(new Music("Bad Habits", "Ed sheeran", 1001, "British", 2010);
		library.add(new Music("Like me", "MGee", 1002, "Us", 2022);
		library.add(new Music("Can't feel my self", "dadanny", 1003, "Us", 2023);
		library.add(new Music("MaliciousIntentions", "Pozer", 1004, "Us", 2020);
		library.add(new Music("Static", "Tom Adams", 1005, "Us", 2021);
	}
	public void displayMenu() { // 메뉴
		
		try {
			int menuNum = 0;
			System.out.println("\n===음악 목록 프로그램 =====");
			System.out.println("1. 음악 등록");
			System.out.println("2. 음악 조회");
			System.out.println("3. 음악 수정");
			System.out.println("4. 음악 삭제");
			System.out.println("5. 즐겨 찾기 추가");
			System.out.println("6. 즐겨 찾기 삭제");
			System.out.println("7. 즐겨 찾기 조회 ");
			System.out.println("8. 추천 음악 뽑기");
			System.out.println("0. 프로그램 종료");
			
			System.out.println(" 메뉴를 입력하세요 : ");
			
			menuNum = sc.nextInt();
			
			switch(menuNum){
			case 1 :
				System.out.println(addMusic());break;
			case 2 :
				showMusicList(library); break;
			case 3 : 
				System.out.println(editMusic()); break;
			
			case 4 : 
				System.out.println(deleteMusic()); break;
			/*
			case 5 : addFavorite(); break;
			case 6 : deleteFavorite(); break;
			*/
			
			case 7 : showMusicList(favList); break;
			
			case 8 : randomMusic(); break;
		
			case 0 : System.out.println("종료되었습니다."); break;
			default : System.out.println("메뉴에 있는 번호만 입력하세요!"); break;
			} // 메뉴외에 번호 입력시
				
				
		} while(menuNum != 0);
			
	} catch (Exception e){ //try-catch 블록은 예외를 처리하고, 프로그램이 중단되지 않고 계속 실행되도록 도와줍니다.
		// Exception : 예외 클래스의 최상위 클래스
		System.out.println("예외 발생");
		e.printStackTrace(); // 예외 추적
	}
	}			

	// 음악 등록 메서드
public String addMusic() {
	
	System.out.println("===음악 등록===");
	
	System.out.print(" 음악 번호 : ");
	int MusicNum = sc.nextInt();
	sc.nextLine(); // 입력버퍼에 남은 개행 문자 제거용
	
	System.out.print("음악 제목 : ");
	String title = sc.nextLine();
	
	System.out.print(" 음악 작사 : ");
	String writer = sc.nextLine();
	
	System.out.print(" 음악 가격 : ");
	int price = sc.nextInt();
	sc.nextLine();
	
	System.out.print(" 음악 발매사 : ");
	String publisher = sc.nextLine();

	Music newMusic = new Music(title, artist, price, MusicNum);

library.add(newMusic);

return "등록 완료";

}
// 음악 목록 조회용 메서드
	
public void showMusicList(List<Music> list) {
	
	if(list.isEmpty()) {
		System.out.println("등록된 음악이 없습니다");
	
	} else {
		
		for (Music temp : list) {
			System.out.println(temp); // 임시변수
}
}
}

//도서 수정용 메서드

	public String editBook() {
		
		showMusicList(library); // 등록된 도서를 출력하기
		
		System.out.println("=======도서 수정========");
		
		int editMenu =0; // 수정 메뉴 선택용 변수
		
		System.out.println("수정할 음악 번호를 입력하세요 : ");
		int MusicNum = sc.nextInt();
		
		boolean flag = true;
		
		
		for(Book temp : library) {
			
		
			if(temp.getBookNum() == MusicNum) {
				// 입력한 도서 번호와 도서 목록의 도서 번호가 일치하는걸 찾았을때
			
			flag = false;// 작동하지 않음
			
			System.out.println("1. 음악명");
			System.out.println("2. 음악 작사가");
			System.out.println("3. 음악 가격");
			System.out.println("4. 음악 출판사");
			System.out.println("0. 수정정료");
			System.out.println("어떤 정보를 수정하시겠습니까? ");
			
			editMenu = sc.nextInt(); // 자바에서 사용자로부터 정수 입력을 받아 변수에 저장하는 코드
			sc.nextLine(); // 입력버퍼에 남은 개행 문자 제거
			
			switch(editMenu) {
			case 1 :
				System.out.println("===음악명 수정===");
				System.out.println("수정할 음악명을 입력하세요 : ");
				String title = sc.nextLine();
				temp.setTitle(title);
				break;
				
			case 2 :
				System.out.println("===음악 작사가 수정 ===");
				System.out.println("수정할 작사가를 입력하세요");
				String artist = sc.nextLine();
				temp.setWriter(artist);
				break;
				
			}
			