package com.coderscampus.game.service;
import java.util.Random;
import java.util.Scanner;
public class SkyeService {
    public String rockPaperScissorsGame() {
        String result = null;
        Scanner scanner = new Scanner(System.in);
        String[] computerInput = {
                "Rock","Paper","Scissor"
        };
        Random random = new Random();
        System.out.println("Let's play Rock, Paper, Scissor");
        Integer myWins = 0;
        Integer computerWins = 0;
        boolean isGameNotOver = true;
        while (isGameNotOver){
            System.out.println("My wins: " + myWins);
            int randomNumber = random.nextInt(2);
            System.out.println("Computer wins: " + computerWins);
            String computer = computerInput[randomNumber];
            String myInput = scanner.nextLine();
            System.out.println("Computer input: " + computer);
            System.out.println("My input: " + myInput);
            if (computer.equals("Rock") && myInput.equals("Paper")){
                System.out.println("You win!");
                myWins++;
            }  if (computer.equals("Paper") && myInput.equals("Scissor")) {
                System.out.println("You win!");
                myWins++;
            }  if (computer.equals("Scissor") && myInput.equals("Rock")) {
                System.out.println("You win!");
                myWins++;
            } if (computer.equals("Rock") && myInput.equals("Scissor")) {
                System.out.println("You lose!");
                computerWins++;
            } if (computer.equals("Scissor") && myInput.equals("Paper")) {
                System.out.println("Game Over!");
                computerWins++;
            } if (computer.equals("Paper") && myInput.equals("Rock")) {
                System.out.println("You lose!");
                computerWins++;
            } if (computer.equals(myInput)){
                System.out.println("Try again!");
            }
            if (myWins == 3 || computerWins == 3){
                isGameNotOver = false;
            }
        }
        if (myWins == 3){
            result = "I win";
            System.out.println(result);
        } else if (computerWins == 3) {
            result = "Computer wins";
            System.out.println(result);
        }
        return result;
    }
}