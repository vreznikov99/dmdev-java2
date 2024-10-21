package inheritance;

public final class Laptop extends Computer{
    private double weight;
    public Laptop(int ssd, int ram, double weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    public Laptop() {
        open();
        System.out.println("I have downloaded");
    }

    public double getWeight() {
        return weight;
    }

    public void open(){
        System.out.println("Lid is opened");
    }

    @Override
    public void load() {
        System.out.println("I have loaded");
    }

    @Override
    public void print() {
        super.print();
        System.out.print(" Weight: " + this.weight);
    }
}
