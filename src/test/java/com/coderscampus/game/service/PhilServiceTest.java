package com.coderscampus.game.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PhilServiceTest {
	PhilService philService = new PhilService();
	@Test
	void testPrintList() {
		List<Integer> numbersListTest = philService.printList();
		
		assertEquals(Arrays.asList(1,2,3), numbersListTest);
		
	}
}
