package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	// 필드
	private Scanner sc = new Scanner(System.in);
	
	// java.util.List 인터페이스 : List에 반드시 필요한 필수 기능을 모아둔 인터페이스
		// * 인터페이스 객체 생성 X, 부모 참조변수 O
		
		// java.util.ArrayList : 배열 형태 List (가장 대표적인 List 자식 클래스)
		
		// new ArrayList() : 기본생성자 -> 기본 크기 10짜리 리스트 생성
		// 하지만 리스트의 크기는 늘었다 줄었다 하기때문에 큰 의미 없음
		
		// 책 정보를 저장할 List 생성
	
	private List<Book> library = new ArrayList<Book>();
	// private List<Student> studentList = new LinkedList<>(); // 추가, 수정, 삭제 효율적
	// 부모타입(List) 참조변수(bookList) = 자식객체(ArrayList) 주소

	
	// 즐겨찾기 도서를 저장할 목록 List 
	private List<Book> favList = new ArrayList<Book>();
	
	public BookService() { // 기본 생성자
		
		// BookService 객체가 생성될때 library List에 5개 도서 등록
		library.add(new Book("세이노의 가르침", "세이노", 6480, "데이원", 1111));
		library.add(new Book("문과남자의 과학공부", "유시민", 15750, "돌베게", 2222));
		library.add(new Book("역행자", "자청", 17550, "웅진지식하우스", 3333));
		library.add(new Book("꿀벌의 예언", "베르나르베르베르", 15120, "열림책들", 4444));
		library.add(new Book("도둑맞은 집중력", "요한 하리", 16920, "어크로스", 55555));
		
	}
	
	// 메서드
	public void displayMenu() { // 메뉴
		
		try { // 예외 처리를 위한 블록을 정의
	
			int menuNum =0; // 메뉴 선택용 변수
		
		do { //조건이 거짓일 경우에도 최소한 한 번은 실행되는 반복문
			System.out.println("\n=====도서 목록 프로그램 ======");
			System.out.println(" 1. 도서 등록 ");
			System.out.println(" 2. 도서 조회 ");
			System.out.println(" 3. 도서 수정 ");
			System.out.println(" 4. 도서 삭제 ");
			System.out.println(" 5. 즐겨찾기 추가 ");
			System.out.println(" 6. 즐겨찾기 삭제 ");
			System.out.println(" 7. 즐겨찾기 조회 ");
			System.out.println(" 8. 추천 도서 뽑기 ");
			System.out.println(" 0. 프로그램 종료 ");
			
			System.out.println(" 메뉴를 입력하세요 : ");
			
		
			menuNum = sc.nextInt(); // 사용자로부터 정수 입력을 받아 변수에 저장하는 코드
			
			switch(menuNum) { //  다양한 조건을 분기 처리할 수 있는 제어문
			case 1 : 
				System.out.println(addBook()); break;
			case 2 : 
				showBookList(library); break;
			
			case 3 : 
				System.out.println(editBook()); break;
			
			case 4 : 
				System.out.println(deleteBook()); break;
			/*
			case 5 : addFavorite(); break;
			case 6 : deleteFavorite(); break;
			*/
			
			case 7 : showBookList(favList); break;
			
			case 8 : randomBook(); break;
		
			case 0 : System.out.println("종료되었습니다."); break;
			default : System.out.println("메뉴에 있는 번호만 입력하세요!"); break;
			} // 메뉴외에 번호 입력시
				
				
		}while(menuNum != 0);
				
		
	} catch (Exception e){ //try-catch 블록은 예외를 처리하고, 프로그램이 중단되지 않고 계속 실행되도록 도와줍니다.
		// Exception : 예외 클래스의 최상위 클래스
		System.out.println("예외 발생");
		e.printStackTrace(); // 예외 추적
	}
	}			

	// 도서 등록 메서드

		public String addBook() {
	
			System.out.println("===도서 등록===");
			
			System.out.print(" 도서 번호 : ");
			int bookNum = sc.nextInt();
			sc.nextLine(); // 입력버퍼에 남은 개행 문자 제거용
			
			System.out.print("도서 제목 : ");
			String title = sc.nextLine();
			
			System.out.print(" 도서 저자 : ");
			String writer = sc.nextLine();
			
			System.out.print(" 도서 가격 : ");
			int price = sc.nextInt();
			sc.nextLine();
			
			System.out.print(" 도서 출판사 : ");
			String publisher = sc.nextLine();
		
		Book newBook = new Book(title, writer, price, publisher, bookNum);
		
		library.add(newBook);
		
		return "등록 완료";
		
}
	// 도서 목록 조회용 메서드

	
	public void showBookList(List<Book> list) {
		
		if(list.isEmpty()) {
			System.out.println("등록된 도서가 없습니다");
		
		} else {
			
			for (Book temp : list) {
				System.out.println(temp); // 임시변수
			}
		}
	}
	
	


	// 도서 수정용 메서드
	
	public String editBook() {
		
		showBookList(library); // 등록된 도서를 출력하기
		
		System.out.println("=======도서 수정========");
		
		int editMenu =0; // 수정 메뉴 선택용 변수
		
		System.out.println("수정할 도서 번호를 입력하세요 : ");
		int bookNum = sc.nextInt();
		
		boolean flag = true;
		
		
		for(Book temp : library) {
			
		
			if(temp.getBookNum() == bookNum) {
				// 입력한 도서 번호와 도서 목록의 도서 번호가 일치하는걸 찾았을때
			
			flag = false;// 작동하지 않음
			
			System.out.println("1. 도서명");
			System.out.println("2. 도서 저자");
			System.out.println("3. 도서 가격");
			System.out.println("4. 도서 출판사");
			System.out.println("0. 수정정료");
			System.out.println("어떤 정보를 수정하시겠습니까? ");
			
			editMenu = sc.nextInt(); // 자바에서 사용자로부터 정수 입력을 받아 변수에 저장하는 코드
			sc.nextLine(); // 입력버퍼에 남은 개행 문자 제거
			
			switch(editMenu) { // 변수의 값을 기준으로 여러 가지 경우(case)를 처리
			case 1 : 
				System.out.println("===도서명 수정===");
				System.out.println("수정할 도서명을 입력하세요 : ");
				String title = sc.nextLine();
				temp.setTitle(title);
				break;
			
			case 2 :
				System.out.println("===도서 저자 수정===");
				System.out.println("수정할 저자명을 입력하세요 : ");
				String writer = sc.nextLine();
				temp.setWriter(writer);
				break;
				
			case 3 :
				System.out.println("===도서 가격 수정===");
				System.out.println("수정할 가격을 입력하세요 : ");
				int price = sc.nextInt();
				temp.setPrice(price);
				break;
				
			case 4 :
				System.out.println("===도서 출판사 수정===");
				System.out.println("수정할 출판사를 입력하세요 : ");
				String publisher = sc.nextLine();
				temp.setPublischer(publisher);
				break;
				
			case 0 : System.out.println("종료합니다..."); break;
			default : System.out.println("메뉴에 있는 번호만 선택하세요");
				
				
			}
			
		}
		
	
		}
	if(flag) {// flag가 true일 때 특정 코드를 실행
		return "일치하는 도서 번호가 없습니다";
	}
	return "수정 완료";
}
	

	// 도서 삭제용 메서드
	public String deleteBook() {
		System.out.println("====도서 삭제===");
		
		showBookList(library); // 컬렉션에서 책의 목록을 출력하는 역할
		
		System.out.println("삭제할 도서의 번호를 입력하세요 : ");
		int deleteNum = sc.nextInt();// 숫자를 입력 받아 삭제 번호로 사용
		
		for(Book temp : library) {
			
			if(temp.getBookNum() == deleteNum) {
				int index = library.indexOf(temp);
				// List에 일치하는 객체가 있으면 그 객체가 있는 index번호 반환
				
				System.out.println("index 번호 : " + index);// 문자열 연결
				
				System.out.println("정말 삭제하시겠습니까? (Y/N) : ");
				
				char answer = sc.next().toUpperCase().charAt(0);// "y" -> "Y" -> 'Y'
				//		문자열을 반환/문자를 대문자로 변환/ 문자열의 첫 번째 문자(인덱스 0)를 char 타입으로 반환
				if (answer == 'Y') {
					library.remove(index);
					break;
				} else {
					return "삭제를 진행하지 않습니다";
				}
				}
			}
		return "삭제 끝";
		
	}
	
	// 추천 도서 뽑기
	
	public void randomBook() {
	
		int max = library.size();// 컬렉션에 저장된 원소의 개수를 얻어와서 max라는 변수에 저장하는 코드
		
		int random = (int)(Math.random() * max);// 0 이상 max 미만의 정수를 생성하는 식
		
		System.out.println( library.get(random).getTitle() );
	
	
	}

	
	
	
	
}
	