package com.dmdev.practice;

public class Palindrome {
    private static final String SPACE = " ";
    private static final String EMPTY = "";
    public static void main(String[] args) {
        String value = "а роза упала на лапу Азора";
        System.out.println(isPalindrome(value));
        System.out.println(isPalindromevV2(value));
    }

    private static boolean isPalindrome(String value) {
        value = value.replace(SPACE, EMPTY).toLowerCase();
        char left;
        char right;
        for (int i = 0; i < value.length(); i++) {
            left = value.charAt(i);
            right = value.charAt(value.length() - (i + 1));
            if (left != right){
                return false;
            }
        }
        return true;
    }

    private static boolean isPalindromevV2(String value){
        value = value.replace(SPACE, EMPTY).toLowerCase();
        return new StringBuilder(value).reverse().toString().equals(value);
    }
}
