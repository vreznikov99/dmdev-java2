package inheritance;

import interfaces.Printable;

public abstract class Computer implements Printable {
    private int Ssd;
    private int Ram;

    public Computer(int ssd, int ram) {
        Ssd = ssd;
        Ram = ram;
    }

    public Computer() {
        System.out.println("Constructor Computer");
    }
    @Override
    public void print(){
        System.out.print("SSD: " + this.Ssd + " RAM: " + this.Ram);
    }

    public abstract void load();

//    public void load(){
//        System.out.println("I have loaded");
//    }

    public int getSsd() {
        return Ssd;
    }

    public int getRam() {
        return Ram;
    }
}
