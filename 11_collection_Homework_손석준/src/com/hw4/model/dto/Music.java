package com.hw4.model.dto;

public class Music {

	// 속성
	
	private String title; //  음악 제목
	private String artist; // 작사
	private String album; // 앨범
	private int price; // 가격
	private int musicNum; // 발매일 

	// 기능
	
	public Music(String title, String artist, String album, int price, int musicNum) {
		super();
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.price = price;
		this.musicNum = musicNum;;
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

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getReleaseDate() {
		return musicNum;
	}

	public void setReleaseDate(int musicNum) {
		musicNum = musicNum;
	}

	@Override
	public String toString() {
		return "Music [title=" + title + ", artist=" + artist + ", album=" + album + ", price=" + price
				+ ", ReleaseDate=" + musicNum + "]";
	}
	
	
}
