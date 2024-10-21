package practice_oop;

public class Mage extends Hero{

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        enemy.takeDamage(getDamage());
        System.out.println(getName() + " spoilt " + enemy.getName() + ". Health remains: " + enemy.getHealth());
    }
}
