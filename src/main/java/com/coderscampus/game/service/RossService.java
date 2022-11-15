package com.coderscampus.game.service;

import com.coderscampus.game.domain.RossData;

public class RossService {

			public void printData() {
				RossData rossData = new RossData();
				rossData.setName("Ross");
				rossData.setAge(80);
				rossData.setGender('M');
				System.out.println(rossData);
				RossData ercan = new RossData("Ercan", 95, 'M');
				System.out.println(ercan);
				RossData debbie = new RossData("Debbie");
				System.out.println(debbie);
			}
			
}