package me.nallaka.ComputerScienceLabs.MagicLab;

import java.util.Scanner;

public class Duel {
    private int runningGameTotal;

    private Scanner scanner = new Scanner(System.in);

    public void newRound(Wizard wizardOne, Wizard wizardTwo) {
        System.out.println("\n" + wizardOne.getName() + " (Wizard One): Choose a spell to cast\n");
        System.out.println(wizardOne.getWizardSpellsNames());
        wizardOne.castSpell(scanner.nextInt(), wizardOne, wizardTwo);
        System.out.println("\n"+ wizardTwo.getName() + " (Wizard Two): Choose a spell to cast\n");
        System.out.println(wizardTwo.getWizardSpellsNames());
        wizardTwo.castSpell(scanner.nextInt(), wizardTwo, wizardOne);
        if (!(wizardOne.getHealth() <= 0) || !(wizardTwo.getHealth() <= 0)) {
            System.out.println(wizardOne.getName() + " has " + wizardOne.getHealth() + " HP left.");
            System.out.println(wizardTwo.getName() + " has " + wizardTwo.getHealth() + " HP left.");
        }
        if (wizardOne.getHealth() <= 0) {
            wizardTwo.setScore(wizardTwo.getScore() + 1);
            System.out.println(wizardTwo.getName() + " won the round with " + wizardTwo.getHealth() + " health remaining. Total score total is " + wizardTwo.getScore());
        } else if (wizardTwo.getHealth() <= 0) {
            wizardOne.setScore(wizardOne.getScore()+1);
            System.out.println(wizardOne.getName() + " won the round with " + wizardOne.getHealth() + " health remaining. Total score total is " + wizardOne.getScore());
        }
    }

    public void setWizardStats(Wizard wizardOne, Wizard wizardTwo) {
        System.out.println("Wizard One: Enter your name:");
        wizardOne.setName(scanner.nextLine());
        System.out.println("Wizard Two: Enter your name:");
        wizardTwo.setName(scanner.nextLine());
        System.out.println(wizardOne.getName() + ": Choose 3 of the following:\n1) Fireball\n2) Arrow Rain\n3) Thunder Bolt\n4) Blood Leech\n5) Shadow Sword");
        wizardOne.setWizardSpells(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        System.out.println(wizardTwo.getName() + ": Choose 3 of the following:\n1) Fireball\n2) Arrow Rain\n3) Thunder Bolt\n4) Blood Leech\n5) Shadow Sword");
        wizardTwo.setWizardSpells(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    }

    public int getRunningGameTotal() {
        return runningGameTotal;
    }

    public void setRunningGameTotal(int runningGameTotal) {
        this.runningGameTotal = runningGameTotal;
    }
}