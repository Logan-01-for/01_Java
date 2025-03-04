package com.hw4.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw4.model.dto.Music;

public class MusicService {

	// 필드
	private Scanner sc = new Scanner(System.in); 

	private List<Music> library = new ArrayList<Music>();
	
	// 즐겨찾기 도서를 저장할 목록 List 
	private List<Music> favList = new ArrayList<Music>();
	
	public MusicService() { // 기본 생성자

		library.add(new Music("Bad Habits", "Ed sheeran", 2010, 1001, "British"));
		library.add(new Music("Like me", "MGee", 2022, 1002, "Us"));
		library.add(new Music("Can't feel myself", "dadanny", 2023, 1003, "Us"));
		library.add(new Music("MaliciousIntentions", "Pozer", 2020, 1004, "Us"));
		library.add(new Music("Static", "Tom Adams", 2021, 1005, "Us"));
	}
	public void displayMenu() { // 메뉴
		
		try {
			
			int menuNum = 0;
			do {
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
	int musicNum = sc.nextInt();
	sc.nextLine(); // 입력버퍼에 남은 개행 문자 제거용
	
	System.out.print("음악 제목 : ");
	String title = sc.nextLine();
	
	System.out.print(" 음악 작사 : ");
	String artist = sc.nextLine();
	
	System.out.print(" 음악 가격 : ");
	int price = sc.nextInt();
	sc.nextLine();
	
	System.out.print(" 음악 발매사 : ");
	String publisher = sc.nextLine();

	Music newMusic = new Music(title, artist, price, musicNum, publisher);
	
			
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

	public String editMusic() {
		
		showMusicList(library); // 등록된 도서를 출력하기
		
		System.out.println("=======도서 수정========");
		
		int editMenu =0; // 수정 메뉴 선택용 변수
		
		System.out.println("수정할 음악 번호를 입력하세요 : ");
		int MusicNum = sc.nextInt();
		
		boolean flag = true;
		
		
		for(Music temp : library) {
			
		
			if(temp.getMusicNum() == MusicNum) {
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
				temp.setArtist(artist);
				break;
				
			case 4 :
				System.out.println("===음악 출판사 수정===");
				System.out.println("수정할 출판사를 입력하세요 : ");
				String publisher = sc.nextLine();
				temp.setPublischer(publisher);
				break;
				
			case 0: System.out.println("종료합니다..."); break;
			default : System.out.println("메뉴에 있는 번호만 선택하세요");
				
			}
			}
		}
		if (flag) {
			return "일치하는 음악 번호가 없습니다";
		}
			return "수정 완료";
	}
	
	// 음악 삭제용 메서드
	public String deleteMusic() {
		System.out.println("====음악 삭제====");
		
		showMusicList(library);// 컬렉션에서 책의 목록을 출력하는 역할
		
		System.out.println("삭제할 음악의 번호를 입력하세요 : ");
		int deleteNum = sc.nextInt(); // 숫자를 입력 받아 삭제 번호로 사용
		
		for(Music temp : library) {
			
			if (temp.getMusicNum() == deleteNum) {
				int index = library.indexOf(temp);
				// List에 일치하는 객체가 있으면 그 객체가 있는 index번호 반환
				
				System.out.println("index 번호 : + index"); // 문자열 연결
				
				System.out.println("정말 삭제하시겠습니까? (Y/N) : ");
				
				char answer = sc.next().toUpperCase().charAt(0); 
				
				if (answer == 'Y') {
					library.remove(index);
					break;
				} else {
					return "삭제를 진행하지 않습니다";
				}
			}
			return "삭제 끝";
		}
	}
		
		// 추천 음악 뽑기
		
		public void randomMusic() {
			
		int max = library.size(); 
		
		int random = (int)(Math.random() * max);
		
		System.out.println(library.get(random).getTitle());
			
			
			
						}
		}
	