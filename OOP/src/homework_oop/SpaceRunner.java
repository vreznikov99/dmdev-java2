package homework_oop;

public class SpaceRunner {
    public static void main(String[] args) {
        SpaceBody earth = new Planet("Earth", 5.29, 12.7);
        SpaceBody star = new Star("A-104X",2.29, 3.7, 509);
        System.out.println(SpaceUtils.isStar(star));
        System.out.println(SpaceUtils.gravityForce(earth, star, 30));
        System.out.println(earth);
        System.out.println(star);

    }
}
