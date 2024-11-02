package com.dmdev.exceptions.practice;

import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * 6. Создать метод случайным образом выбрасывающий одно из 3-х видов
 * исключений.
 *           Вызвать этот метод в блоке try-catch, отлавливающем любое из 3-х.
 */
public class Task6 {
    private static final Map<Integer, Throwable> exceptions = new HashMap<>(Map.of(
            0, new RuntimeException("runtime"),
            1, new FileNotFoundException("file"),
            2, new IndexOutOfBoundsException("index")
    ));

    public static void main(String[] args) {
        Random random = new Random();
        try {
            unsafe(random.nextInt(3));
        } catch (IndexOutOfBoundsException exception) {
            System.out.println("1");
            exception.printStackTrace();
        } catch (FileNotFoundException exception) {
            System.out.println("2");
            exception.printStackTrace();
        } catch (RuntimeException exception) {
            System.out.println("3");
            exception.printStackTrace();
        } catch (Throwable exception) {
            System.out.println("4");
            exception.printStackTrace();
        }

    }

    public static void unsafe(int randomValue) throws Throwable {
        Throwable exception = exceptions.getOrDefault(randomValue, new DmDevException("not found"));
        throw exception;
    }
}
