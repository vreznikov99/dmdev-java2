package practice_oop;

import generics.weapon.RangeWeapon;

public class Archer<T extends RangeWeapon> extends Hero<T> {

    private Wolf wolf;
    public Archer(String name, int damage) {
        super(name, damage);
        wolf = new Wolf("Wolf", 3);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " shoot in the " + enemy.getName());
//        enemy.takeDamage(getDamage());
        wolf.attackEnemy(enemy);
    }

    public class Wolf {
        private String name;
        private int damage;

        public Wolf(String name, int damage) {
            setName(name);
            setDamage(damage);
        }

        public void attackEnemy(Enemy enemy){
            System.out.println(Archer.this.getName() + " and " + this.getName() + " attack together " + enemy.getName());
            enemy.takeDamage(Archer.this.getDamage() + this.getDamage());
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setDamage(int damage) {
            this.damage = damage;
        }

        public String getName() {
            return name;
        }

        public int getDamage() {
            return damage;
        }
    }
}
