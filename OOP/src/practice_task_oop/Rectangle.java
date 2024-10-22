package practice_task_oop;

public class Rectangle extends FigureCalc implements Figure {
    private Point pointLeftAbove;
    private Point pointRightBelow;

    public Rectangle(Point pointLeftAbove, Point pointRightBelow) {
        this.pointLeftAbove = pointLeftAbove;
        this.pointRightBelow = pointRightBelow;
    }

    @Override
    public double getArea() {
        return (Math.abs(pointLeftAbove.getY() - pointRightBelow.getY()) *
                (Math.abs(pointLeftAbove.getX() - pointRightBelow.getX())));

    }

    @Override
    public boolean isAreasEqual(Figure figure) {
        return this.getArea() == figure.getArea();
    }

    @Override
    public double perimetr() {
        return 2 * ((Math.abs(pointLeftAbove.getY() - pointRightBelow.getY()))
                    + (Math.abs(pointLeftAbove.getX() - Math.abs(pointRightBelow.getX())))) ;
    }

    public double diagonalCalc() {
        return pointLeftAbove.distance(pointRightBelow);
    }

    public Point getPointLeftAbove() {
        return pointLeftAbove;
    }

    public void setPointLeftAbove(Point pointLeftAbove) {
        this.pointLeftAbove = pointLeftAbove;
    }

    public Point getPointRightBelow() {
        return pointRightBelow;
    }

    public void setPointRightBelow(Point pointRightBelow) {
        this.pointRightBelow = pointRightBelow;
    }
}
