package com.dmdev.exceptions.practice;

/**
 * 1. Объявите переменную со значением null. Вызовите метод у этой
 * переменной. Отловите возникшее исключение.
 */
public class Task1 {
    public static void main(String[] args) {
        String value = null;
        try {
            value.length();
        }catch (NullPointerException e){
            System.out.println("Catch");
            e.printStackTrace();
        }


    }

}
