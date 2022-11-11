package com.coderscampus.game.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

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
	
	@Test
	void testDoFibonacciAtIndex() {
// 		fibonacciSequence[10] = 34
		Integer numberAtIndexNine = ts.doFibonacci().get(9);
		
		Integer result = 34;
		Integer tenthIndex = numberAtIndexNine;
		
		assertEquals (result, tenthIndex);
	}
}
