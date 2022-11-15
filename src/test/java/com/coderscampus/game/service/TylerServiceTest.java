package com.coderscampus.game.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class TylerServiceTest {
	
	TylerService tylerService = new TylerService();

	@Test
	void testMultiplyTwoNumbers() {
		
		Integer result = tylerService.multiplyTwoNumbers(2, 5);
		
		assertEquals (result, 10);
	}

	@Test
	void testAddTwoNumbers() {
	
		Integer result = tylerService.addTwoNumbers(10,  12);
		
		assertEquals (result, 22);
	
	}
	
	@Test
	void testDoFibonacciAtIndex() {
// 		fibonacciSequence[10] = 34
		Integer numberAtIndexNine = tylerService.doFibonacci().get(9);
		
		Integer result = 34;
		Integer tenthIndex = numberAtIndexNine;
		
		assertEquals (result, tenthIndex);
	}
	
	@Test
	void testDivideTwoNumbers() {
		double numberTested = tylerService.divideTwoNumbers(5, 2);
		
		double result = 2.5;
		
		assertEquals (result, numberTested);
		
	}
	
	@Test
	void testPrintHelloWorld () {
		String helloWorld = tylerService.printHelloWorld();
		
		assertEquals ("Hello World", helloWorld);
	}
}
