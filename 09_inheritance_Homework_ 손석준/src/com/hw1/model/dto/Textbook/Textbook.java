package com.hw1.model.dto.Textbook;

import com.hw1.model.dto.Book.Book;

public class Textbook extends Book{

	// 속성
	private String subject;
	
	// 기능
	public Textbook() {}

	public Textbook(String subject) {
		super();
		this.subject = subject;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return super.toString()+ " / " + subject;
	}
}
