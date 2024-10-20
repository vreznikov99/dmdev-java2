package inheritance;

public abstract class Computer {
    private int Ssd;
    private int Ram;

    {
        System.out.println("init computer");
    }
    static {
        System.out.println("static init computer");
    }

    public Computer(int ssd, int ram) {
        Ssd = ssd;
        Ram = ram;
    }

    public Computer() {
        System.out.println("Constructor Computer");
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
