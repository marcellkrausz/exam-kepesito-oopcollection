package hu.nive.ujratervezes.oopcollection.army;


import java.util.ArrayList;
import java.util.List;

public class Army {

    List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        for (int i = 0; i < army.size(); i++) {
            army.get(i).sufferDamage(damage);
            if (army.get(i).getHitPoints() < 25) {
                army.remove(army.get(i));
                i--;
            }
        }
    }

    public int getArmyDamage() {
        int sum = 0;

        for (MilitaryUnit unit : army) {
            sum += unit.doDamage();
        }
        return sum;
    }

    public int getArmySize() {
        return army.size();
    }
}