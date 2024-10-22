package generics;

import generics.weapon.*;
import practice_oop.Archer;
import practice_oop.Hero;
import practice_oop.Warrior;

public class WeaponRunner {
    public static void main(String[] args) {
        Archer<Bow> archer = new Archer<>("Mirana", 20);
        archer.setWeapon(new Bow());

        Warrior<Sword> warrior = new Warrior<>("Axe", 30);
        warrior.setWeapon(new Sword());

        printWeaponDamage(warrior);
    }

    public static <T extends Weapon> void printWeaponDamage(Hero<T> hero){
        System.out.println(hero.getWeapon().getDamage());
    }

}
