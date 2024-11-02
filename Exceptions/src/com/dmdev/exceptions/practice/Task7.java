package com.dmdev.exceptions.practice;

import java.io.FileNotFoundException;
import java.util.Random;

/**
 * 7. Написать метод, который в 50% случаев бросает исключение.
 *           Вызвать этот метод в конструкции try-catch-finally. Протестировать
 * работу блока finally.
 */
public class Task7 {
    public static void main(String[] args) {
        System.out.println("Main start");
        Random random = new Random();
        try {
            unsafe(random.nextBoolean());
        } catch (FileNotFoundException e) {
            System.out.println("Caught exception");
            throw new RuntimeException(e);
        } finally {
            System.out.println("Main finally");
        }
        System.out.println("Main end");
    }

    public static void unsafe(boolean value) throws FileNotFoundException{
          if (!value){
              throw new FileNotFoundException();
          }
    }
}
