package homework_oop;

public abstract class SpaceBody implements SpaceExecutable {

    private final String name;
    private final double mass;
    private final double diameter;

    public SpaceBody(String name, double mass, double diameter) {
        this.name = name;
        this.mass = mass;
        this.diameter = diameter;
    }

    @Override
    public double radius() {
        return getDiameter() / 2;
    }

    public double getMass() {
        return mass;
    }

    public double getDiameter() {
        return diameter;
    }

    public String getName() {
        return name;
    }
}
