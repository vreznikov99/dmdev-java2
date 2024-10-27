package com.dmdev.hw_sorting.comparators;

import com.dmdev.hw_sorting.Chat;

import java.util.Comparator;

public class ComparatorByUserAmount implements Comparator<Chat> {
    @Override
    public int compare(Chat o1, Chat o2) {
        return Integer.compare(o2.getAmountOfUsers(), o1.getAmountOfUsers());
    }
}
