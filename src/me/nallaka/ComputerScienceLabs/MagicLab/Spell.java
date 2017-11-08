package me.nallaka.ComputerScienceLabs.MagicLab;

public class Spell {
    private String spellName, spellSpecialAbility;
    private int maxDamage, minDamage;
    private double critChance, missChance;

    public Spell(String spellName, int maxDamage, int minDamage, double critChance, double missChance) {
        this.spellName = spellName;
        this.maxDamage = maxDamage;
        this.minDamage = minDamage;
        this.critChance = critChance;
        this.missChance = missChance;
    }

    public double getSpellDamage(Spell spell) {
        if ((int) (Math.random()*10) > spell.getMissChance()) {
            if ((int) (Math.random()*10) <= spell.getCritChance()){
                return 2 * ((int) (Math.random()*((spell.getMaxDamage()-spell.getMinDamage())+1)) + spell.getMinDamage());
            } else {
                return (int) (Math.random()*((spell.getMaxDamage()-spell.getMinDamage())+1)) + spell.getMinDamage();
            }
        } else {
            return 0;
        }
    }

    public String getSpellName() {
        return spellName;
    }

    public int getMaxDamage() {
        return maxDamage;
    }

    public int getMinDamage() {
        return minDamage;
    }

    public double getCritChance() {
        return critChance;
    }

    public double getMissChance() {
        return missChance;
    }

    public String getSpellSpecialAbility() {
        return spellSpecialAbility;
    }

    public void setSpellSpecialAbility(String spellSpecialAbility) {
        this.spellSpecialAbility = spellSpecialAbility;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public void setMaxDamage(int maxDamage) {
        this.maxDamage = maxDamage;
    }

    public void setMinDamage(int minDamage) {
        this.minDamage = minDamage;
    }

    public void setCritChance(double critChance) {
        this.critChance = critChance;
    }

    public void setMissChance(double missChance) {
        this.missChance = missChance;
    }

    @Override
    public String toString() {
        return  "spellName='" + spellName + '\'' +
                ", maxDamage=" + maxDamage +
                ", minDamage=" + minDamage +
                ", critChance=" + critChance +
                ", missChance=" + missChance;
    }
}
