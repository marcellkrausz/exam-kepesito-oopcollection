package hu.nive.ujratervezes.oopcollection.army;


public class Swordsman extends MilitaryUnit {

    boolean hasShield;

    public Swordsman(boolean hasArmor) {
        super(100, 10, hasArmor);
        this.hasShield = true;
    }

    @Override
    int doDamage() {
        return this.attackDamage;
    }

    @Override
    void sufferDamage(int damage) {
        if (hasShield) {
            hasShield = false;
        } else {
            super.sufferDamage(damage);
        }
    }
}