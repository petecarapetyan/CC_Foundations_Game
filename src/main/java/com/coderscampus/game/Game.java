package com.coderscampus.game;

public class Game {


	public static void main(String[] args) {
        // always get out of static hell before doing any real work!
        new Game().playGame();
        
	}

    private void playGame(){
        new ExerciseExampleServices().main();
        helloWorld();
    }
    private void helloWorld() {
    	System.out.println("Hello World");
    	
    }
    


}
