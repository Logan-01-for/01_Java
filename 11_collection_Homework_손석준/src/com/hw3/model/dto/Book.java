package com.hw3.model.dto;

public class Book {

	// 속성
	private String title; // 책 제목
	private String writer; // 저자
	private int price; // 가격
	private String publisher; // 출판사
	private int bookNum; //책 번호
	
	// 기능
	public Book() {}

	public Book(String title, String writer, int price, String publischer, int bookNum) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
		this.publisher = publischer;
		this.bookNum = bookNum;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPublischer() {
		return publisher;
	}

	public void setPublischer(String publischer) {
		this.publisher = publischer;
	}

	public int getBookNum() {
		return bookNum;
	}

	public void setBookNum(int bookNum) {
		this.bookNum = bookNum;
	}

	@Override
	public String toString() {
		return  bookNum + "번 도서 : [도서제목 : " + title + 
				" / 도서저자 : " + writer 
				+ " / 도서가격 : " + price + "원 / 출판사 : " + publisher + "]" ;
	}

}