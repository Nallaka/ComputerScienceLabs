package me.nallaka.ComputerScienceLabs.MagicLab;

import java.util.Scanner;

public class MagicDuelDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menuChoice;
        boolean quit = false;
        while (!quit) {
            System.out.println("Welcome to the Main Menu. Please choose one of the following options:\n1) Start a New Duel\n2)Quit" );
            if (scanner.hasNextInt()) {
                menuChoice = scanner.nextInt();
            } else {
                System.out.println("Please use a valid input");
                continue;
            }
            switch (menuChoice) {
                case 1:
                    boolean gameQuit = false;
                    Wizard wizardOne = new Wizard();
                    Wizard wizardTwo = new Wizard();
                    while (!gameQuit) {
                        System.out.println("Welcome to the Game Menu. Please choose one of the following options:\n1) Duel! \n2)Quit");
                        if (scanner.hasNextInt()) {
                            menuChoice = scanner.nextInt();
                        } else {
                            System.out.println("Please use a valid input");
                            continue;
                        }
                        switch (menuChoice) {
                            case 1:
                                System.out.println("Wizard One: Enter your name:");
                                wizardOne.setName(scanner.nextLine());
                                System.out.println("Wizard Two: Enter your name:");
                                wizardTwo.setName(scanner.nextLine());
                                System.out.println("Wizard One: Choose 3 of the following:\n1) Fireball\n2) Arrow Rain\n3) Thunder Bolt\n4) Blood Leech\n5) Shadow Sword");
                                wizardOne.setWizardSpells(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                                System.out.println("Wizard Two: Choose 3 of the following:\n1) Fireball\n2) Arrow Rain\n3) Thunder Bolt\n4) Blood Leech\n5) Shadow Sword");
                                wizardTwo.setWizardSpells(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
                                while (wizardOne.getHealth() > 0 || wizardTwo.getHealth() > 0) {
                                    System.out.println("Wizard One: Choose a spell to cast");
                                    System.out.println(wizardOne.getWizardSpells());
                                    System.out.println("Wizard Two: Choose a spell to cast");
                                    System.out.println(wizardTwo.getWizardSpells());
                                }
                                break;
                            case 2:
                                quit = true;
                                break;

                        }
                    }
                    break;
                case 2:
                    quit = true;
                    break;

            }
        }
    }
}
