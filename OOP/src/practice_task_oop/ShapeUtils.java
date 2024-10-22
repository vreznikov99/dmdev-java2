package practice_task_oop;

public class ShapeUtils {
    public static boolean isRectangle(Figure figure) {
        return figure instanceof Rectangle;
    }

    public static boolean isTriangle(Figure figure) {
        return figure instanceof Triangle;
    }
}
