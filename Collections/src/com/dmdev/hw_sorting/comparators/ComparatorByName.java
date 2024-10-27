package com.dmdev.hw_sorting.comparators;

import com.dmdev.hw_sorting.Chat;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        int comparatorByAmount = new ComparatorByUserAmount().compare(o1, o2);
        if (comparatorByAmount == 0){
            return o1.getName().compareTo(o2.getName());
        } else {
            return comparatorByAmount;
        }
    }
}
