package com.coderscampus.game.service;

import java.util.ArrayList;
import java.util.List;

public class TylerService {

	public Integer multiplyTwoNumbers(Integer a, Integer b) {

		Integer c = a * b;

		return c;

	}

	public Integer addTwoNumbers(Integer a, Integer b) {

		Integer c = a + b;

		return c;
	}
	
	public List<Integer> doFibonacci () {
		
		List<Integer> fibonacciSequence = new ArrayList<>();
		
			int a = 0;
			int b = 1;
			int c;
			
			fibonacciSequence.add(a);
			fibonacciSequence.add(b);
			
			for (int i = 0; i < 12; i++) {
				System.out.print(a + ", ");
				c = a+b;
				a=b;
				b=c;
				fibonacciSequence.add(c);
			}
						
		return fibonacciSequence;
	}
}
