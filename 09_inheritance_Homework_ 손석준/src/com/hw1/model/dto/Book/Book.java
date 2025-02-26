package com.hw1.model.dto.Book;

public class Book {
	// 기능
	private String title;
	private String author;
	
	// 속성
	public Book() {}
	
	// field
	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	@Override
	public String toString() {
		return title + " / " + author;
	}
}
