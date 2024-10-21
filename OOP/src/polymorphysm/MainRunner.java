package polymorphysm;

import inheritance.Computer;
import inheritance.Laptop;

public class MainRunner {
    public static void main(String[] args) {
        Computer laptop = new Laptop(256, 8, 1.5);
        Computer mobile = new Mobile(128, 16);

        loadComputers(laptop, mobile);
        printInformation(new Computer[]{laptop, mobile});
    }
    public static void printInformation(Computer[] computers){
        for (Computer computer : computers) {
            computer.print();
            if (computer instanceof Laptop){
                Laptop laptop = (Laptop) computer;
                laptop.open();
            }
            System.out.println();
        }
    }

    public static void loadComputers(Computer... computers){
        for (Computer computer : computers) {
            computer.load();
            System.out.println();
        }
    }
}
