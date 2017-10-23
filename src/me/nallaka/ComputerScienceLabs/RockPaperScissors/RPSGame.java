package me.nallaka.ComputerScienceLabs.RockPaperScissors;

import java.util.Scanner;

/**
 * @author: Mithul Nallaka
 * @dateCreated: 10/22/2017
 * @dueDate: N/A
 * Purpose: N/A
 * Methods: None
 */
public class RPSGame {
    /**
     * @Name: N/A
     * Purpose: N/A
     * Input: None
     * Return: None
     */
    private int computerChoice;
    private int playerChoice;
    private int computerWinTotal;
    private int playerWinTotal;
    private int runningGameTotal;

    Scanner scanner = new Scanner(System.in);
    //1: Rock
    //2: Paper
    //3: Scissors

    public void getChoices(int playerChoice, int computerChoice) {
        switch (playerChoice) {
            case 1:
                System.out.println("Player Choose Rock");
                break;
            case 2:
                System.out.println("Player choose Paper");
                break;
            case 3:
                System.out.println("Player choose Scissors");
                break;
            case 4:
                System.out.println("Player did not input a valid choice");
        }

        switch (computerChoice) {
            case 1:
                System.out.println("Computer Choose Rock");
                break;
            case 2:
                System.out.println("Computer choose Paper");
                break;
            case 3:
                System.out.println("Computer choose Scissors");
                break;
            case 4:
                System.out.println("Computer did not input a valid choice");
        }
    }

    public int generateComputerChoice() {
        return (int)(Math.random()*3)+1;
    }

    public String getRoundWinner(int playerChoice) {
        computerChoice = generateComputerChoice();
        runningGameTotal++;
        getChoices(playerChoice, computerChoice);
        if (playerChoice == computerChoice) {
            return "It's a Tie!\n";
        } else if (playerChoice == 3 && computerChoice == 1) {
            computerWinTotal++;
            return "The Computer Wins!\n";
        } else if (playerChoice == 1 && computerChoice == 3) {
            playerWinTotal++;
            return "The Player Wins!\n";
        } else if (playerChoice > computerChoice) {
            playerWinTotal++;
            return "The Player Wins!\n";
        } else if (computerChoice > playerChoice) {
            computerWinTotal++;
            return "The Computer Wins!\n";
        } else {
            return "Invalid Inputs\n";
        }
    }

    public void printGameStats() {
        System.out.println("Game Stats:\nPlayer Wins: " + playerWinTotal + "\nComputer Wins: " + computerWinTotal + "\nTotal Games Played: " + runningGameTotal);
        System.out.print("Current Winner: ");
        if (playerWinTotal > computerWinTotal) {
            System.out.print("Player");
        } else if (computerWinTotal > playerWinTotal) {
            System.out.print("Computer");
        } else if (playerWinTotal == computerWinTotal) {
            System.out.print("It's a Tie!");
        }
        System.out.println("\n\n");
    }

    public void newRound(boolean gameQuit,int roundChoice, boolean isMetered) {
        if (isMetered) {
            while (!gameQuit && getRunningGameTotal() < roundChoice) {
                System.out.println("Welcome to the Game Menu\nPlease Choose One of the Following:\n1) Play a Round\n2) View the Current Scores\n3) Reset Game\n4) Quit to Main Menu");
                int menuChoice;
                if (scanner.hasNextInt()) {
                    menuChoice = scanner.nextInt();
                } else {
                    System.out.println("Please use a valid input");
                    continue;
                }
                switch (menuChoice) {
                    case 1:
                        System.out.println("Please Choose One:\n1) Rock\n2) Paper\n3) Scissors");
                        if (scanner.hasNextInt()) {
                            playerChoice = scanner.nextInt();
                        } else {
                            System.out.println("Please use a valid input");
                            continue;
                        }
                        if (playerChoice <= 3) {
                            System.out.println(getRoundWinner(playerChoice));
                        } else {
                            System.out.println("You didn't not provide a valid input. Please try again");
                        }
                        break;
                    case 2:
                        printGameStats();
                        break;
                    case 3:
                        System.out.println("Resetting the game stats!");
                        resetGame();
                        break;
                    case 4:
                        System.out.println("Ending the game!");
                        gameQuit = true;
                        break;
                    default:
                        System.out.println("This is not a valid input, please try again");
                        break;
                }
            }
        } else {
            while (!gameQuit) {
                System.out.println("Welcome to the Game Menu\nPlease Choose One of the Following:\n1) Play a Round\n2) View the Current Scores\n3) Reset Game\n4) Quit to Main Menu");
                int menuChoice;
                if (scanner.hasNextInt()) {
                    menuChoice = scanner.nextInt();
                } else {
                    System.out.println("Please use a valid input");
                    continue;
                }
                switch (menuChoice) {
                    case 1:
                        System.out.println("Please Choose One:\n1) Rock\n2) Paper\n3) Scissors");
                        if (scanner.hasNextInt()) {
                            playerChoice = scanner.nextInt();
                        } else {
                            System.out.println("Please use a valid input");
                            continue;
                        }
                        if (playerChoice <= 3) {
                            System.out.println(getRoundWinner(playerChoice));
                        } else {
                            System.out.println("You didn't not provide a valid input. Please try again");
                        }
                        break;
                    case 2:
                        printGameStats();
                        break;
                    case 3:
                        System.out.println("Resetting the game stats!");
                        resetGame();
                        break;
                    case 4:
                        System.out.println("Ending the game!");
                        gameQuit = true;
                        break;
                    default:
                        System.out.println("This is not a valid input, please try again");
                        break;
                }
            }
        }
    }

    public void resetGame() {
        playerChoice = 0;
        playerWinTotal = 0;
        computerChoice = 0;
        computerWinTotal = 0;
        runningGameTotal = 0;
    }

    //Getters
    public int getComputerChoice() {
        return computerChoice;
    }

    public int getPlayerChoice() {
        return playerChoice;
    }

    public int getComputerWinTotal() {
        return computerWinTotal;
    }

    public int getPlayerWinTotal() {
        return playerWinTotal;
    }

    public int getRunningGameTotal() {
        return runningGameTotal;
    }

    //Setters
    public void setComputerChoice(int computerChoice) {
        this.computerChoice = computerChoice;
    }

    public void setPlayerChoice(int playerChoice) {
        this.playerChoice = playerChoice;
    }

    public void setComputerWinTotal(int computerWinTotal) {
        this.computerWinTotal = computerWinTotal;
    }

    public void setPlayerWinTotal(int playerWinTotal) {
        this.playerWinTotal = playerWinTotal;
    }

    public void setRunningGameTotal(int runningGameTotal) {
        this.runningGameTotal = runningGameTotal;
    }

    public static void main(String[] args) {

    }//end main
}//end RPSGame
