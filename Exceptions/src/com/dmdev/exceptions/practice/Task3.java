package com.dmdev.exceptions.practice;

/**
 * 3. Создать собственный класс-исключение - наследник класса Exception.
 *           Создать метод, выбрасывающий это исключение.
 *           Вызвать этот метод и отловить исключение. Вывести stack trace в
 * консоль.
 *
 * 4. Повторить предыдущее упражнение, но наследуя свой класс от класса
 * RuntimeException.
 * Добавить в конструктор своего класса возможность указания
 * сообщения.
 */

public class Task3 {
    public static void main(String[] args) {
        try{
            unsafe();
        } catch (DmDevException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getCause());
            e.printStackTrace();
        }

    }

    public static void unsafe(){
        throw new DmDevException(new RuntimeException("runtime exceptiuon"));
    }

}
