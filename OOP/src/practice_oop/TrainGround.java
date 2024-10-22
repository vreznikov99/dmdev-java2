package practice_oop;

public class TrainGround {
    public static void main(String[] args) {
        Hero mageDazzle = new Mage("Dazzle", 10);

        Archer archerMirana = new Archer("Mirana", 25);
//        Archer.Wolf weaver = archerMirana.new Wolf("Weaver", 3); // Внутренний класс
//        Archer.Wolf wolf = new Archer.Wolf("Wolf2", 6);          // Вложенный класс

        Hero warriorAxe = new Warrior("Axe", 30);

        Enemy enemy = new Enemy("Krip", 100);

        battleGround(enemy, mageDazzle, archerMirana, warriorAxe);
    }

    public static void battleGround(Enemy enemy, Hero... heroes) {
        while (enemy.isAlive()) {
            for (Hero hero : heroes) {
                if(enemy.isAlive()) {
                    hero.attackEnemy(enemy);
                }
            }
        }
    }
}
