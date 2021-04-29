package hu.nive.ujratervezes.oopcollection.army;

public class HeavyCavalry extends MilitaryUnit {

    boolean firstAttack;

    public HeavyCavalry() {
        super(150, 20, true);
        this.firstAttack = true;
    }

    @Override
    int doDamage() {
        if (this.firstAttack) {
            this.firstAttack = false;
            return this.attackDamage * 3;
        }
        return this.attackDamage;
    }
}