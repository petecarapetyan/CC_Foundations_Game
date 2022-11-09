package com.coderscampus.game.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TylerServiceTest {
	
	TylerService ts = new TylerService();

	@Test
	void testMultiplyTwoNumbers() {
		
		Integer result = ts.multiplyTwoNumbers(2, 5);
		
		assertEquals (result, 10);
	}

	@Test
	void testAddTwoNumbers() {
	
		Integer result = ts.addTwoNumbers(10,  12);
		
		assertEquals (result, 22);
	
	}
}
