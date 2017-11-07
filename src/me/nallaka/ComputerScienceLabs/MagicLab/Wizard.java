package me.nallaka.ComputerScienceLabs.MagicLab;

public class Wizard {
    private String name;
    private double health, maxHealth;
    private int score;

    private Spell spellOne;
    private Spell spellTwo;
    private Spell spellThree;

    private Spell fireBall = new Spell("FireBall", 8, 2, 2, 3);
    private Spell arrowRain = new Spell("Arrow Rain", 6, 2, 3, 2);
    private Spell thunderbolt = new Spell("ThunderBolt", 10, 5, 5, 7);
    private Spell bloodLeech = new Spell("Blood Leech", 10, 5, 4, 6);
    private Spell shadowWeapon = new Spell("Shadow Sword", 9, 3, 3, 3);


    public void castSpell(Spell spell, Wizard wizardCaster, Wizard wizardReceiver) {
        double spellDamage = spell.getSpellDamage(spell);
        if (spellDamage != 0) {
            wizardReceiver.setHealth(wizardReceiver.getHealth() - spellDamage);
            System.out.println(wizardCaster.getName() + " hit " + wizardReceiver.getName() + " for " + spellDamage + " hp.");
        } else {
            System.out.println("The caster missed!");
        }
    }

    public Wizard(String name, double health, double maxHealth, int spellOne, int spellTwo, int spellThree) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
        switch (spellOne) {
            case 1:
                this.spellOne = fireBall;
                break;
            case 2:
                this.spellOne = arrowRain;
                break;
            case 3:
                this.spellOne = thunderbolt;
                break;
            case 4:
                this.spellOne = bloodLeech;
                break;
            case 5:
                this.spellOne = shadowWeapon;
                break;
        }
        switch (spellTwo) {
            case 1:
                this.spellTwo = fireBall;
                break;
            case 2:
                this.spellTwo = arrowRain;
                break;
            case 3:
                this.spellTwo = thunderbolt;
                break;
            case 4:
                this.spellTwo = bloodLeech;
                break;
            case 5:
                this.spellTwo = shadowWeapon;
                break;
        }
        switch (spellThree) {
            case 1:
                this.spellThree = fireBall;
                break;
            case 2:
                this.spellThree = arrowRain;
                break;
            case 3:
                this.spellThree = thunderbolt;
                break;
            case 4:
                this.spellThree = bloodLeech;
                break;
            case 5:
                this.spellThree = shadowWeapon;
                break;
        }
    }

    public Wizard() {}

    public String getName() {
        return name;
    }

    public String getWizardSpells() {
        return "1) " +this.spellOne.toString() + " \n2) "
                + this.spellTwo.toString() + "\n3) "
                + this.spellThree.toString() + "\n";
    }

    public String getAllSpells(){
        return fireBall.toString() + " \n "
                + arrowRain.toString() + "\n"
                + thunderbolt.toString() + "\n"
                + bloodLeech.toString() + "\n"
                + shadowWeapon.toString() + "\n";
    }

    public double getHealth() {
        return health;
    }

    public double getMaxHealth() {
        return maxHealth;
    }

    public int getScore() {
        return score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public void setMaxHealth(double maxHealth) {
        this.maxHealth = maxHealth;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setWizardSpells(int spellOne, int spellTwo, int spellThree) {
        switch (spellOne) {
            case 1:
                this.spellOne = fireBall;
                break;
            case 2:
                this.spellOne = arrowRain;
                break;
            case 3:
                this.spellOne = thunderbolt;
                break;
            case 4:
                this.spellOne = bloodLeech;
                break;
            case 5:
                this.spellOne = shadowWeapon;
                break;
        }
        switch (spellTwo) {
            case 1:
                this.spellTwo = fireBall;
                break;
            case 2:
                this.spellTwo = arrowRain;
                break;
            case 3:
                this.spellTwo = thunderbolt;
                break;
            case 4:
                this.spellTwo = bloodLeech;
                break;
            case 5:
                this.spellTwo = shadowWeapon;
                break;
        }
        switch (spellThree) {
            case 1:
                this.spellThree = fireBall;
                break;
            case 2:
                this.spellThree = arrowRain;
                break;
            case 3:
                this.spellThree = thunderbolt;
                break;
            case 4:
                this.spellThree = bloodLeech;
                break;
            case 5:
                this.spellThree = shadowWeapon;
                break;
        }
    }
}
