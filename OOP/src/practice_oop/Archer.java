package practice_oop;

public class Archer extends Hero {
    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " shoot in the " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
