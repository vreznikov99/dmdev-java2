package com.dmdev.exceptions.practice;

/**
 * 2. Написать код, который создаст, а затем отловит
 * ArrayIndexOutOfBoundsException.
 */
public class Task2 {
    public static void main(String[] args) {
        int[] values = {1,3,4,5,6};
        try {
            for (int i = 0; i <= values.length; i++) {
                System.out.println(values[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("catch");
            e.printStackTrace();
        }
    }
}
