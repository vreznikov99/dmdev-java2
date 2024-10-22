package practice_oop;

import generics.weapon.MagicWeapon;

public class Mage<T extends MagicWeapon> extends Hero<T> {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " spoilt " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
