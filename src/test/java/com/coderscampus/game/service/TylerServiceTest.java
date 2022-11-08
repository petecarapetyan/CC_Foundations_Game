package com.coderscampus.game.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TylerServiceTest {

	@Test
	void testMultiplyTwoNumbers() {
		
		TylerService ts = new TylerService();
		Integer result = ts.multiplyTwoNumbers(2, 5);
		
		assertEquals (result, 10);
	}

}
