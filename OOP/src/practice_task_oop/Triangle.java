package practice_task_oop;

public class Triangle extends FigureCalc implements Figure {

    Point point1;
    Point point2;
    Point point3;
    double sideA;
    double sideB;
    double sideC;

    public Triangle(Point p1, Point p2, Point p3) {
        point1 = p1;
        point2 = p2;
        point3 = p3;
        sideA = point1.distance(point2);
        sideC = point2.distance(point3);
        sideB = point3.distance(point1);
        System.out.println("Triangle's length of sides\nA = " + sideA + " B = " + sideB + " C = " + sideC);
    }

    public double getHight(){
        return 2 * getArea() / sideC;
    }

    @Override
    public double getArea() {
        return Math.sqrt(halfPerimetr() * (halfPerimetr() - sideA) * (halfPerimetr() - sideB) * (halfPerimetr() - sideC));
    }

    @Override
    public boolean isAreasEqual(Figure figure) {
        return getArea() == figure.getArea();
    }

    @Override
    public double perimetr() {
        return sideA + sideB + sideC;
    }

}
