package homework_oop;

public final class SpaceUtils {

    public final static double G = 6.67 * Math.pow(10, -11);
    private SpaceUtils() {
    }
    public static double gravityForce(SpaceBody body1, SpaceBody body2, double distance){
        return G * (body1.getMass() * body2.getMass()) / (Math.pow(distance, 2));
    }

    public static boolean isStar(SpaceBody body){
        return body instanceof Star;
    }
}
