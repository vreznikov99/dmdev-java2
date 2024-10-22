package generics.practice;

public class PairRunner {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Hello", 2905);
        System.out.println(pair);

        System.out.println(PairUtils.swap(pair));
    }
}
