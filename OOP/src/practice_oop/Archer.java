package practice_oop;

public class Archer extends Hero{
    public Archer(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println(getName() + " shoot in the " + enemy.getName() + ". Health remains: " + enemy.getHealth());
    }
}
