package com.coderscampus.game.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalebServiceTest {
	@Test
	void should_multiply_two_numbers() {
		CalebService calebService = new CalebService();
		int result = calebService.multiplyTwoNumbers(2, 5);
		
		assertEquals(10, result);
	}

}
