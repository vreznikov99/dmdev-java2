package practice_oop;

public class Enemy implements Mortal{
    private String name;
    private int health;

    public Enemy(String name, int health) {
        this.name = name;
        this.health = health;
        System.out.println(getName() + " spawned. with health: " + getHealth());
    }

    public void takeDamage(int damage){

        health -= Math.min(health, damage);
    }

    @Override
    public boolean isAlive() {
        return (health > 0);
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }
}
