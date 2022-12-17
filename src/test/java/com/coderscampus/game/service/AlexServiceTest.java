package com.coderscampus.game.service;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.coderscampus.game.domain.User;

public class AlexServiceTest {
	
	@Test
	public void should_create_user() {
		AlexService alexService = new AlexService();
		assertEquals(User.class,alexService.createUser()); 
	}

}
