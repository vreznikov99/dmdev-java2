package com.dmdev.homeworkStrings;

/**
 * Дана строка.
 *
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 *
 * Результат привести к верхнему регистру.
 *
 * Например:
 *
 * “abc Cpddd Dio OsfWw” -> “ABCPDIOSFW”
 */

public class Task1 {
    public static void main(String[] args) {
        String value = "abc Cpddd Dio OsfWw";
        String result = deleteRepeatableChars(value);
        System.out.println(result);
    }

    private static String deleteRepeatableChars(String value) {
        StringBuilder result = new StringBuilder();
        String lowerCase = value.replace(" ", "").toLowerCase();
        char charPrev = 0;
        for(int i = 0; i < lowerCase.length(); i++){
            char charCurrent = lowerCase.charAt(i);
            if (charPrev != charCurrent || i == 0){
                result.append(charCurrent);
                charPrev = charCurrent;
            }
        }
        return result.toString().toUpperCase();
    }
}
