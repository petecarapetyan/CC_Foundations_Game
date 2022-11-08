package com.coderscampus.game;

import com.coderscampus.game.configuration.GameConstants;
import com.coderscampus.game.service.example.ExampleFileReadingService;
import com.coderscampus.game.service.example.ExampleMathService;

public class ExerciseExampleServices {

    // named it main just to be annoying and confusing
    public void main(){
        new ExampleFileReadingService().printFileContents(GameConstants.EXAMPLE_FILE_PATH);
        System.out.println(" 2 * 17 = " + new ExampleMathService().multiply(2, 17));
    }
}
