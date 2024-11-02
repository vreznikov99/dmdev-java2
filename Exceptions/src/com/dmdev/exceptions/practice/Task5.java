package com.dmdev.exceptions.practice;

/**
 * 5. Бросить одно из существующих в JDK исключений, отловить его и
 * выбросить своё собственное, указав в качестве причины отловленное.
 */
public class Task5 {
    public static void main(String[] args) {
        try {
            catchCustomException();
        } catch (DmDevException e){
            System.out.println("caught in main");
            e.printStackTrace();
        }

    }

    public static void catchCustomException() {
        try {
            unsafe();
        } catch (RuntimeException e) {
            System.out.println("catch in CustomException method");
//            e.printStackTrace();
            throw new DmDevException(e);
        }
    }

    public static void unsafe() {
        throw new RuntimeException("Oops");
    }
}
