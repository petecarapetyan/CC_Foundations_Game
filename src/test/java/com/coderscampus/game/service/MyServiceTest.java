package com.coderscampus.game.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import com.coderscampus.game.service.example.ExampleFileReadingService;
import com.coderscampus.game.service.example.ExampleMathService;
import org.junit.jupiter.api.Test;

import com.coderscampus.game.configuration.GameConstants;

class MyServiceTest {
\

	@Test
	void testMultiply() {
		assertEquals(34, new ExampleMathService().multiply(2, 17));
	}

	@Test
	void testFileContents() {ExampleFileReadingService exampleFileReadingService = new ExampleFileReadingService();
    String fileContents = exampleFileReadingService.fileContents(GameConstants.EXAMPLE_FILE_PATH);
		assertTrue(fileContents.startsWith("File line #1"));
	}

}
