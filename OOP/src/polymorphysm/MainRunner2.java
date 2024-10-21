package polymorphysm;

import inheritance.Computer;
import inheritance.Laptop;
import interfaces.Printable;

public class MainRunner2 {
    public static void main(String[] args) {
        Printable laptop = new Laptop(256, 8, 1.5);
        Printable mobile = new Mobile(128, 16);

//        print(laptop, mobile);
        printWithRandom(new Printable[]{laptop, mobile});
    }

    public static void printWithRandom(Printable[] objects){
        for (Printable object : objects) {
            object.printWithRandom();
            System.out.println();
        }
    }

    public static void print(Printable... objects){
        for (Printable object : objects) {
            object.print();
            System.out.println();
        }
    }
}
