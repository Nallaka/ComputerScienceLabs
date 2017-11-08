package me.nallaka.ComputerScienceLabs.MagicLab;

public class Wizard {
    private String name;
    private double health;
    private int score;

    private Spell spellOne;
    private Spell spellTwo;
    private Spell spellThree;

    public void castSpell(int spellChoice, Wizard wizardCaster, Wizard wizardReceiver) {
        Spell spell = this.spellOne;
        switch (spellChoice) {
            case 1:
                spell = this.spellOne;
                break;
            case 2:
                spell = this.spellTwo;
                break;
            case 3:
                spell = this.spellThree;
                break;
        }
        double spellDamage = spell.getSpellDamage(spell);
        if (spellDamage != 0) {
            wizardReceiver.setHealth(wizardReceiver.getHealth() - spellDamage);
            System.out.println(wizardCaster.getName() + " hit " + wizardReceiver.getName() + " for " + spellDamage + " hp.");
        } else {
            System.out.println("The caster missed!");
        }
    }

    public Wizard() {
        this.score = 0;
        this.health = 50;
    }

    public String getName() {
        return name;
    }

    public String getWizardSpellsNames() {
        return "1) " +this.spellOne.getSpellName() + " \n2) "
                + this.spellTwo.getSpellName() + "\n3) "
                + this.spellThree.getSpellName() + "\n";
    }


    public double getHealth() {
        return health;
    }

    public int getScore() {
        return score;
    }

    public void setSpellOne(Spell spellOne) {
        this.spellOne = spellOne;
    }

    public void setSpellTwo(Spell spellTwo) {
        this.spellTwo = spellTwo;
    }

    public void setSpellThree(Spell spellThree) {
        this.spellThree = spellThree;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
