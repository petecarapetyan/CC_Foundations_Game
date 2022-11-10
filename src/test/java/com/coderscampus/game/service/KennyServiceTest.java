package com.coderscampus.game.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KennyServiceTest {

	@Test
	void testSubstractingTwoNumbers() {
		KennyService kennyService = new KennyService();
		
		int result = kennyService.substractingTwoNumbers(3, 2);
		assertEquals (result, -1);
	}
	

}
