package com.dmdev.practice;

import java.util.HashMap;
import java.util.Map;

public final class WordUtil {
    private static final String EMPTY = "";
    private static final String SPACE = " ";
    public WordUtil() {
    }
    public static Map<String, Integer> wordFrequency(String text){
        Map<String, Integer> result = new HashMap<>();
        String[] words = text.replace(",", EMPTY).
                replace(".", EMPTY).
                replace("!", EMPTY).
                replace("?", EMPTY).
                toLowerCase().
                split(SPACE);
        for (String word : words) {
            Integer oldCount = result.get(word);
            Integer newCount = oldCount == null ? 1 : ++oldCount;
            result.put(word, newCount);
        }
        return result;
    }

}
