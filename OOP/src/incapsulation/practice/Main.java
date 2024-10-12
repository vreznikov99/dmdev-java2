package incapsulation.practice;

public class Main {

    public static void main(String[] args) {
        Point pointRectLeftAbove = new Point(3,2);
        Point pointRectRightBelowAbove = new Point(6,1);
        Rectangle rectangle1 = new Rectangle(pointRectLeftAbove, pointRectRightBelowAbove);
        System.out.println("Diagonal: " + rectangle1.diagonalCalc());
        System.out.println("Square: " + rectangle1.rectSquare());
        System.out.println("Points: " + pointRectLeftAbove.distance(pointRectRightBelowAbove));

        Point point1 = new Point(2, 10);
        Point point2 = new Point(12, 4);

        System.out.println(point1.distance(point2));
        System.out.println(point2.distance(point1));

        Rectangle rectangle2 = new Rectangle(point1, point2);
        System.out.println(rectangle2.rectSquare());
        System.out.println(rectangle2.diagonalCalc());
    }
}
