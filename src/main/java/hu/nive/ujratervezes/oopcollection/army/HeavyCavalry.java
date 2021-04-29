package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    private boolean isCharging = true;

    public HeavyCavalry() {

        hasArmor = true;
        healthPoints = 150;
        damage = 20;

    }

    @Override
    public int doDamage() {

        if (isCharging) {

            isCharging = false;
            return damage * 3;

        }

        return damage;

    }
}