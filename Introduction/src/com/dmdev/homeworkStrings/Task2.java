package com.dmdev.homeworkStrings;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * <p>
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * <p>
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 * <p>
 * Например:
 * <p>
 * “Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?” -> 18 (8+1+2+4+3)
 */
public class Task2 {


    public static void main(String[] args) {
        String value = "Hello 1 bsn4bosbi 89buo 10";
        int[] arrayInt = getIntArrayFromString(value);
        int sumOfNumbers = sum(arrayInt);
        StringBuilder numbers = new StringBuilder();
        for (int i : arrayInt){
            numbers.append(i).append(" ");
        }
        System.out.print(value + " -> " + sumOfNumbers + " (" + numbers + ")");

    }

    private static int sum(int[] arrayInt) {
        int sum = 0;
        for (int i: arrayInt) {
            sum += i;
        }
        return sum;
    }

    private static int[] getIntArrayFromString(String value) {
        value = value.replace(" ", "").toLowerCase();
        int[] tempArr = new int[value.length()];
        int counter = 0;

        for (int i = 0; i < value.length(); i++) {
            char valueChar = value.charAt(i);
            if (Character.isDigit(valueChar)) {
                tempArr[counter] = Character.getNumericValue(valueChar);
                counter++;
            }
        }
        int[] resultArray = new int[counter];
        System.arraycopy(tempArr, 0, resultArray, 0, counter);
        return resultArray;
    }
}
