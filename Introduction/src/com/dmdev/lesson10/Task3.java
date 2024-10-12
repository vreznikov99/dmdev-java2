package com.dmdev.lesson10;

/**
 * 3. Написать функцию, принимающую в качестве параметров имя, фамилию и
 * отчество и возвращающую инициалы
 *  в формате "Ф.И.О". Учесть, что входные параметры могут быть в любом
 * регистре, а результирующая строка должна быть в верхнем.
 */
public class Task3 {
    public static void main(String[] args) {
        System.out.println(format("Petya", "Ivanov", "Leonardovich"));
    }

    private static String format(String firstName, String lastName, String patronymicName){
//        char firstNameChar = firstName.toUpperCase().charAt(0);
//        char lastNameChar = lastName.toUpperCase().charAt(0);
//        char patronymicNameChar = patronymicName.toUpperCase().charAt(0);
        char firstNameChar = Character.toUpperCase(firstName.charAt(0));
        char lastNameChar = Character.toUpperCase(lastName.charAt(0));
        char patronymicNameChar = Character.toUpperCase(patronymicName.charAt(0));
//        return lastNameChar + "." + firstNameChar + "." + patronymicNameChar;
        return String.format("%s.%s.%s", lastNameChar, firstNameChar, patronymicNameChar);
    }
}
