package com.dmdev.lambdas;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
//        Comparator<Integer> comparator1 = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        };
        Comparator<Integer> comparator = ((o1, o2) -> o1.compareTo(o2));
        Comparator<Integer> comparator2 = Integer::compare;

        System.out.println(comparator.compare(100, 50));
        System.out.println(comparator2.compare(25, 100));



    }
}
