package me.nallaka.ComputerScienceLabs.ArrayLabTwo;

import java.util.Scanner;

public class RaceDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice;
        boolean quit = false;
        while (!quit) {
            System.out.println("Welcome to the Main Menu. Please choose one of the following options:\n1) Work with a new array\n2) Quit");
            if (scanner.hasNextInt()) {
                menuChoice = scanner.nextInt();
            } else {
                System.out.println("Please use a valid input!");
                continue;
            }
            switch (menuChoice) {
                case 1:
                    boolean raceQuit = false;
                    while (!raceQuit) {
                        System.out.println("Choose one of the following:\n1) Create a new Race\n2) New Race Round\n3) View Player Scores");
                        if (scanner.hasNextInt()) {
                            menuChoice = scanner.nextInt();
                        } else {
                            System.out.println("Please use a valid input!");
                            continue;
                        }
                        switch (menuChoice) {
                            case 1:
                                System.out.println("How long should the track be?");
                                Race race = new Race(scanner.nextInt());
                                race.newRound();
                                break;
                            case 2:
                                break;
                            case 3:
                                break;
                            case 4:
                                raceQuit = true;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Thank you for using the program!");
                    quit = true;
                    break;
            }
        }
    }
}
