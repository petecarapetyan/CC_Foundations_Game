package com.coderscampus.paper.main;

import com.coderscampus.paper.util.Detail;

public class PaperLauncher {

	public static void main(String[] args) {
		
		PaperLauncher paperLauncher = new PaperLauncher();
		paperLauncher.start();
		
	}

	public void start() {
		Detail detail = new Detail();
		detail.mountain("estate");
		System.out.println(detail.mountain("estate"));
	}
	
}
