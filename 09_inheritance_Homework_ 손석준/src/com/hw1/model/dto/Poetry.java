package com.hw1.model.dto;

import com.hw1.model.dto.Book.Book;

public class Poetry extends Book{

	private int numberOfPoems;
	
	public void numberOfPoems() {}

	public Poetry(String title, String author, int numberOfPoems) {
		super(title, author);
		this.numberOfPoems = numberOfPoems;
	}

	public int getNumberOfPoems() {
		return numberOfPoems;
	}

	public void setNumberOfPoems(int numberOfPoems) {
		this.numberOfPoems = numberOfPoems;
	}
	
	@Override
	public String toString() {
		
		return super.toString() + " / " + numberOfPoems;
	}
}
