package com.dmdev.pactice_sorting.task1;

import java.util.LinkedList;
import java.util.List;

public class MainRunner {
    public static void main(String[] args) {
        List<String> sourceList = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        List<String> result = MarkLengthUtil.length4Insert(sourceList);
        System.out.println(result);
    }
}
