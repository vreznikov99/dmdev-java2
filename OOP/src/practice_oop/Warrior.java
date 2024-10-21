package practice_oop;

public class Warrior extends Hero {

    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println(getName() + " attacked with a sword " + enemy.getName() + ". Health remains: " + enemy.getHealth());
    }
}
