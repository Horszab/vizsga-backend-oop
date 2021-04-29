package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    protected int healthPoints;
    protected int damage;
    protected boolean hasArmor;

    public int getHitPoints() {

        return healthPoints;

    }

    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage) {

        if (hasArmor) {
            healthPoints -= (damage / 2);
        } else {
            healthPoints -= damage;
        }

    }
}
