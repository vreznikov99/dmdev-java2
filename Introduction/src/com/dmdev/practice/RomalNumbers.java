package com.dmdev.practice;

/**
 * Написать программу, преобразующую строку, содержащую число в римском формате, в число в арабском формате.
 * <p>
 * Границы чисел: от 1 до 3999. Предусмотреть случай, когда меньший символ идёт перед большим:
 * <p>
 * Например CM == 900.
 * <p>
 * Соответствие:
 * <p>
 * M 1000
 * <p>
 * D 500
 * <p>
 * C 100
 * <p>
 * L 50
 * <p>
 * X 10
 * <p>
 * V 5
 * <p>
 * I 1
 */
public class RomalNumbers {
    public static void main(String[] args) {
        String romanValue = "IMM";
        int arabicNumber = calcToArabic(romanValue);
        System.out.println(arabicNumber);
    }

    private static int calcToArabic(String romanValue) {
        int prevNum = getArabicNumber(romanValue.charAt(romanValue.length() - 1));
        int result = 0;
        for (int i = romanValue.length() - 2; i >= 0; i--) {
            int currentNum = getArabicNumber(romanValue.charAt(i));
            result += (currentNum < prevNum) ? (prevNum - currentNum) : currentNum;
            prevNum = currentNum;
        }
        return result;
    }

    public static int getArabicNumber(char romanValue) {
        return switch (romanValue) {
            case 'M' -> 1000;
            case 'D' -> 500;
            case 'C' -> 100;
            case 'L' -> 50;
            case 'X' -> 10;
            case 'V' -> 5;
            case 'I' -> 1;
            default -> 0;
        };
    }
}
