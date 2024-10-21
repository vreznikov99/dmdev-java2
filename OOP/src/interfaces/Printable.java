package interfaces;

import java.util.Random;

public interface Printable {
    int SOME_VALUE = 10_000;
    Random RANDOM = new Random();

    void print();

    default void printWithRandom(){
        System.out.println(generateRandom());
        print();
    }

    private int generateRandom(){
        return RANDOM.nextInt();
    }
}
