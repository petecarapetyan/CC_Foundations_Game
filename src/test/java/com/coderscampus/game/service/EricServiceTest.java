package com.coderscampus.game.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coderscampus.game.MainApp;

public class EricServiceTest {

	@Test
	public void should_output_hello_extreme() {
		MainApp main = new MainApp();
		String someString = main.go();
		
		assertEquals("Hello Extreme", someString);
	}
}
