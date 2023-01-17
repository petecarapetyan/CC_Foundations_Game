package com.coderscampus.game.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coderscampus.game.domain.User;
import com.coderscampus.paper.util.Detail;

public class AlexServiceTest {
	
	@Test
	public void should_return_string() {
		Detail detail = new Detail();
		String result = detail.mountain("estate");
		assertEquals("Hello there again estate", result);
	}
	
	@Test
	public void should_create_user() {
		AlexService alexService = new AlexService();
		assertEquals(User.class,alexService.createUser()); 
	}

}
