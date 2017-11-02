package me.nallaka.ComputerScienceLabs.MagicLab;

public class Wizard {
    private String name;
    private double health, maxHealth;
    private int score;

    Spell fireBall = new Spell("FireBall", 8, 2, .2, .3);
    Spell arrowRain = new Spell("Arrow Rain", 6, 2, .3, .2 );
    Spell thunderbolt = new Spell("ThunderBolt", 10, 5, .5, .7);
    Spell bloodLeech = new Spell("Blood Leech", 10, 5, .4, .6);
    Spell shadowWeapon = new Spell("Shadow Sword", 9, 3, .3, .3);

    public void castSpell(Spell spell, Wizard wizardCaster, Wizard wizardReciever) {
        double spellDamage = spell.getSpellDamage(spell);
        if (spellDamage != 0) {
            wizardReciever.setHealth(wizardReciever.getMaxHealth() - spellDamage);
            System.out.println(wizardCaster.getName() + " hit " + wizardReciever.getName() + " for " + spellDamage + " hp.");
        } else {
            System.out.println("The caster missed!");
        }
    }

    public Wizard(String name, double health, double maxHealth) {
        this.name = name;
        this.health = health;
        this.maxHealth = maxHealth;
    }

    public String getName() {
        return name;
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
}
