package practice_oop;

public class TrainGround {
    public static void main(String[] args) {
        Hero mageDazzle = new Mage("Dazzle", 10);
        Hero archerMirana = new Archer("Mirana", 25);
        Hero warriorAxe = new Warrior("Axe", 70);

        Enemy enemy = new Enemy("Krip", 100);

        battleGround(enemy, mageDazzle, archerMirana, warriorAxe);
    }

    public static void battleGround(Enemy enemy, Hero... heroes){
        for (Hero hero : heroes) {
            hero.attackEnemy(enemy);
        }
    }
}
