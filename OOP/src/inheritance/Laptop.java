package inheritance;

public final class Laptop extends Computer{
    private double weight;

    {
        System.out.println("init laptop");
    }
    static {
        System.out.println("static init laptop");
    }
    public Laptop(int ssd, int ram, double weight) {
        super(ssd, ram);
        this.weight = weight;
    }

    public Laptop() {
        System.out.println("Constructor Laptop");
    }

    public double getWeight() {
        return weight;
    }

    public void open(){
        System.out.println("Lid is opened");
    }

    @Override
    public void load() {
        System.out.println("Laptop has loaded");
    }
}
