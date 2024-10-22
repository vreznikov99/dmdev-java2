package homework_oop;

public class Planet extends SpaceBody{

    public Planet(String name, double mass, double diameter) {
        super(name, mass, diameter);
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
        return "Planet: " + getName();
    }
}
