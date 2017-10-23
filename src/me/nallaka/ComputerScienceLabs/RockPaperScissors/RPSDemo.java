package me.nallaka.ComputerScienceLabs.RockPaperScissors;

import java.util.Scanner;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 10/22/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods: None
 */
public class RPSDemo {
    /**
     * @Name: N/A
     * Purpose: N/A
     * Input: None
     * Return: None
     */
    public static void main(String[] args) {

        //1: Scissors
        //2: Rock
        //3: Paper

        Scanner scanner = new Scanner(System.in);
        int menuChoice = 0;
        int roundChoice = 0;
        boolean quit = false;
        RPSGame game = new RPSGame();

        while (!quit) {
            System.out.println("Welcome to the Main Menu\nPlease choose one of the following choices:\n1) Start a New Game (Infinite)\n2) Play a Set Number of Rounds\n3) Exit the Program ");
            if (scanner.hasNextInt()) {
                menuChoice = scanner.nextInt();
            } else {
                System.out.println("Please use a valid input");
                continue;
            }
            switch (menuChoice) {
                case 1:
                    boolean gameQuit = false;
                    game.resetGame();
                    game.newRound(gameQuit,0, false);
                    break;
                case 2:
                    game.resetGame();
                    gameQuit = false;
                    System.out.println("How many rounds would you like to play?");
                    if (scanner.hasNextInt()) {
                        roundChoice = scanner.nextInt();
                    } else {
                        System.out.println("Please use a valid input");
                        continue;
                    }
                    game.newRound(gameQuit, roundChoice, true);
                    System.out.println("");
                    System.out.println("End Game! Results:");
                    game.printGameStats();
                    break;
                case 3:
                    System.out.println("Bye! Thank you for playing!");
                    quit = true;
                    break;
                default:
                    System.out.println("This is an invalid input, please try again");
                    break;
            }
        }

    }//end main
}//end RPSDemo
