package incapsulation.practice;

public class Rectangle {
    private Point pointLeftAbove ;
    private Point pointRightBelow;

    public Rectangle(Point pointLeftAbove, Point pointRightBelow) {
        this.pointLeftAbove = pointLeftAbove;
        this.pointRightBelow = pointRightBelow;
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

    public double rectSquare(){
        return (Math.abs(pointLeftAbove.getY() - pointRightBelow.getY()) *
                        (Math.abs(pointLeftAbove.getX() - pointRightBelow.getX())));

    }

    public double diagonalCalc(){
        return pointLeftAbove.distance(pointRightBelow);
    }
}
