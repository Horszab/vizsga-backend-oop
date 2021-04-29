package hu.nive.ujratervezes.oopcollection.army;

public class Swordsman extends MilitaryUnit {

    private boolean hasShield = true;

    public Swordsman(boolean equippedWithArmor) {

        hasArmor = equippedWithArmor;
        healthPoints = 100;
        damage = 10;

    }

    @Override
    public void sufferDamage(int damage) {

        if (hasShield) {

            hasShield = false;
            return;

        }

        super.sufferDamage(damage);
    }

}