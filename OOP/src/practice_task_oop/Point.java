package practice_task_oop;

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point anotherPoint) {
        return Math.sqrt(Math.pow(this.getX() - anotherPoint.getX(), 2) +
                Math.pow(this.getY() - anotherPoint.getY(), 2));
    }
}
