package com.coderscampus.game.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DebbieServiceTest {

		@Test
		 void testPrintHelloworld() {
			DebbiesService debbiesService =new DebbiesService();
		String test=	debbiesService.printHelloWorld();
		
		assertEquals("Hello World",test);
		}
}
