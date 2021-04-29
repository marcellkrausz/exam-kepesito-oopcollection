package hu.nive.ujratervezes.oopcollection.army;

public abstract class MilitaryUnit {

    int hitPoints;
    int attackDamage;
    boolean hasArmor;

    public MilitaryUnit(int hitPoints, int attackDamage, boolean hasArmor) {
        this.hitPoints = hitPoints;
        this.attackDamage = attackDamage;
        this.hasArmor = hasArmor;
    }

    int doDamage() {
        return this.attackDamage;
    }

    void sufferDamage(int damage) {
        if (hasArmor) {
            this.hitPoints -= (damage / 2);
        } else {
            this.hitPoints -= damage;
        }
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
