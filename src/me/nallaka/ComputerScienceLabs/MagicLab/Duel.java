package me.nallaka.ComputerScienceLabs.MagicLab;

public class Duel {
    private int runningGameTotal;

    public void newRound(Wizard wizardOne, Wizard wizardTwo, Spell spell) {
        wizardOne.castSpell(spell, wizardOne, wizardTwo);
        runningGameTotal++;
    }

    public int getRunningGameTotal() {
        return runningGameTotal;
    }

    public void setRunningGameTotal(int runningGameTotal) {
        this.runningGameTotal = runningGameTotal;
    }
}
