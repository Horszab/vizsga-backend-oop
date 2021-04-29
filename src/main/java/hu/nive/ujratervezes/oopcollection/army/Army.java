package hu.nive.ujratervezes.oopcollection.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> armyUnits = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {

        armyUnits.add(militaryUnit);

    }

    public void damageAll(int damage) {

        for (int i = 0; i < armyUnits.size(); i++) {

            armyUnits.get(i).sufferDamage(damage);

            if (armyUnits.get(i).getHitPoints() < 25) {

                armyUnits.remove(i);
                i--;

            }

        }

    }

    public int getArmyDamage() {

        int armyDamage = 0;

        for (MilitaryUnit militaryUnit : armyUnits) {

            armyDamage += militaryUnit.doDamage();

        }

        return armyDamage;

    }

    public int getArmySize() {

        return armyUnits.size();

    }

}