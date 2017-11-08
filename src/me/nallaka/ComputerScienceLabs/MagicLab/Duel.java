package me.nallaka.ComputerScienceLabs.MagicLab;

import java.util.Scanner;

public class Duel {
    private Spell fireBall = new Spell("FireBall", 8, 2, 2, 3);
    private Spell arrowRain = new Spell("Arrow Rain", 6, 2, 3, 2);
    private Spell thunderbolt = new Spell("ThunderBolt", 10, 5, 5, 7);
    private Spell bloodLeech = new Spell("Blood Leech", 10, 5, 4, 6);
    private Spell shadowWeapon = new Spell("Shadow Sword", 9, 3, 3, 3);

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
            System.out.println(wizardTwo.getName() + " won the round! Total score total is " + wizardTwo.getScore());
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
    }

    public void setWizardSpells(Wizard wizard) {
        System.out.println(wizard.getName() + ": Choose 3 of the following:\n1) Fireball\n2) Arrow Rain\n3) Thunder Bolt\n4) Blood Leech\n5) Shadow Sword");
        int spellOne = scanner.nextInt();
        int spellTwo = scanner.nextInt();
        int spellThree = scanner.nextInt();
        switch (spellOne) {
            case 1:
                wizard.setSpellOne(fireBall);
                break;
            case 2:
                wizard.setSpellOne(arrowRain);
                break;
            case 3:
                wizard.setSpellOne(thunderbolt);
                break;
            case 4:
                wizard.setSpellOne(bloodLeech);
                break;
            case 5:
                wizard.setSpellOne(shadowWeapon);
                break;
        }
        switch (spellTwo) {
            case 1:
                wizard.setSpellTwo(fireBall);
                break;
            case 2:
                wizard.setSpellTwo(thunderbolt);
                break;
            case 3:
                wizard.setSpellTwo(thunderbolt);
                break;
            case 4:
                wizard.setSpellTwo(bloodLeech);
                break;
            case 5:
                wizard.setSpellTwo(shadowWeapon);
                break;
        }
        switch (spellThree) {
            case 1:
                wizard.setSpellThree(fireBall);
                break;
            case 2:
                wizard.setSpellThree(arrowRain);
                break;
            case 3:
                wizard.setSpellThree(thunderbolt);
                break;
            case 4:
                wizard.setSpellThree(bloodLeech);
                break;
            case 5:
                wizard.setSpellThree(shadowWeapon);
                break;
        }
    }

    public String spellToString() {
        return fireBall.toString() + "\n" + arrowRain.toString() + "\n" + thunderbolt.toString() + "\n" + bloodLeech.toString() + "\n" + shadowWeapon.toString();
    }
}