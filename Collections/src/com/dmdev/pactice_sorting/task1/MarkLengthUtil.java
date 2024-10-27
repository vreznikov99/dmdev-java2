package com.dmdev.pactice_sorting.task1;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public final class MarkLengthUtil {
    private final static int LENGTH = 4;
    private final static String TO_INSERT = "****";

    private MarkLengthUtil() {
    }

    public static List<String> length4Insert(List<String> list){
        List<String> resultList = new LinkedList<>(list);
        ListIterator<String> listIterator = resultList.listIterator();
        while(listIterator.hasNext()){
            String next = listIterator.next();
            if(next.length() == LENGTH){
                listIterator.set(TO_INSERT);
                listIterator.add(next);
            }
        }
        return resultList;
    }
}
