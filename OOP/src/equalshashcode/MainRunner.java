package equalshashcode;

public class MainRunner {
    public static void main(String[] args) {
        Users user1 = new Person(1, "Vasya", "Pupkin");
        Users user2 = new Person(1, "Vasya", "Pupkin");

        System.out.println(user1.hashCode());
        System.out.println(user2.hashCode());
        System.out.println(user1.equals(user2));

    }
}
