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
        if (isAlive() && health < damage){
            health = 0;
            System.out.println(getName() + " killed");
        } else {
            health -= Math.min(health, damage);
            System.out.println(name + " got damage " + damage + ". Health remains: " + health);
        }
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
