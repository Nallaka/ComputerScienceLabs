package me.nallaka.ComputerScienceLabs.MagicLab;

import java.util.Scanner;

public class MagicDuelDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice;
        boolean quit = false;
        while (!quit) {
            System.out.println("Welcome to the Main Menu. Please choose one of the following options:\n1) Start a New Duel\n2) Quit");
            if (scanner.hasNextInt()) {
                menuChoice = scanner.nextInt();
            } else {
                System.out.println("Please use a valid input!");
                continue;
            }
            switch (menuChoice) {
                case 1:
                    boolean gameQuit = false;
                    boolean roundQuit = false;
                    Wizard wizardOne = new Wizard();
                    Wizard wizardTwo = new Wizard();
                    while (!gameQuit) {
                        System.out.println("Welcome to the Game Menu. Please choose one of the following options:\n1) Duel! \n2) View Spell Stats\n3) Quit");
                        if (scanner.hasNextInt()) {
                            menuChoice = scanner.nextInt();
                        } else {
                            System.out.println("Please use a valid input!");
                            continue;
                        }
                        switch (menuChoice) {
                            case 1:
                                Duel duel = new Duel();
                                duel.setWizardStats(wizardOne, wizardTwo);
                                while (!roundQuit) {
                                    wizardOne.setHealth(50);
                                    wizardTwo.setHealth(50);
                                    while (wizardOne.getHealth() > 0 || wizardTwo.getHealth() > 0) {
                                        duel.newRound(wizardOne, wizardTwo);
                                    }
                                    if (wizardOne.getScore() == 3) {
                                        System.out.println(wizardOne.getName() + " won the game!");
                                        roundQuit = true;
                                    } else if (wizardTwo.getScore() == 3) {
                                        System.out.println(wizardTwo.getName() + " won the game!");
                                        roundQuit = true;
                                    } else {
                                        System.out.println("New round!");
                                    }
                                }
                                break;
                            case 2:
                                System.out.println(wizardOne.getAllSpells());
                                break;
                            case 3:
                                gameQuit = true;
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.println("Thank you for playing!");
                    quit = true;
                    break;
            }
        }
    }
}