package homework_oop;

public class Star extends SpaceBody {
    private double speed;

    public Star(String name, double mass, double diameter, double speed) {
        super(name, mass, diameter);
        this.speed = speed;
    }

    @Override
    public double radius() {
        return super.radius();
    }

    @Override
    public double getMass() {
        return super.getMass();
    }

    @Override
    public double getDiameter() {
        return super.getDiameter();
    }

    @Override
    public String toString() {
        return "Star: " + getName();
    }
}
