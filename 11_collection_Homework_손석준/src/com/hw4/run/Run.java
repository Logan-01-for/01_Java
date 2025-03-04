package com.hw4.run;

import com.hw4.model.service.MusicService;

public class Run {

	public static void main(String[] args) {
		
		MusicService service = new MusicService();
		service.displayMenu();
	}
}
