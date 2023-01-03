package com.coderscampus.game.service;

import org.junit.jupiter.api.Test;

public class SkyeServiceTest {
    @Test
    public void should_return_string(){
        SkyeService skyeService = new SkyeService();
      skyeService.rockPaperScissorsGame();
    }
}
