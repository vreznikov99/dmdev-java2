package practice_oop;

public class Mage extends Hero {

    public Mage(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        System.out.println(getName() + " spoilt " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
