package com.hw4.model.dto;

public class Music {

	// 속성
	
	private String title; //  음악 제목
	private String artist; // 작사
	private int price; // 가격
	private int musicNum; // 발매일
	private String publisher;

	// 기능
	public Music(String title, String artist, int price, int musicNum, String publischer) {
		super();
		this.title = title;
		this.artist = artist;
		this.price = price;
		this.musicNum = musicNum;
		this.publisher = publisher;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getArtist() {
		return artist;
	}
	public void setArtist(String artist) {
		this.artist = artist;
	
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getMusicNum() {
		return musicNum;
	}
	public void setMusicNum(int musicNum) {
		this.musicNum = musicNum;
	}
	public String getPublischer() {
		return publisher;
	}
	public void setPublischer(String publischer) {
		this.publisher = publischer;
	}
	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + ", album="  + ", price=" + price + ", musicNum="
				+ musicNum + ", publisher=" + publisher + "]";
	}

	
	
	
	
}
