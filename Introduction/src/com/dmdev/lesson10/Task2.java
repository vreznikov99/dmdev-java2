package com.dmdev.lesson10;

/**
 * 2. Написать функцию, принимающую 2 параметра: строку и слово - и
 * возвращающую true, если строка начинается и заканчивается этим словом.
 */
public class Task2 {
    public static void main(String[] args) {
        String statement = "Dog loves cheese Dog";
        String word = "Dog";
        System.out.println(isStartWithWord(statement, word));
    }

    private static boolean isStartWithWord(String target, String word){
        return target.startsWith(word) && target.endsWith(word);
    }
}
