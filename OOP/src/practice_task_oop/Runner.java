package practice_task_oop;

public class Runner {
    public static void main(String[] args) {
        Figure rectangle = new Rectangle(new Point(0, 0), new Point(3, 4));
        Figure triangle = new Triangle(new Point(0,0), new Point(0, 4), new Point(3, 0));

        System.out.println("Rectangle's area: " + rectangle.getArea());
        System.out.println("Triangle's area: " + triangle.getArea());
        System.out.println("Area compare: " + rectangle.isAreasEqual(triangle));
        System.out.println(ShapeUtils.isRectangle(rectangle));

    }
}
