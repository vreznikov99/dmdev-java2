package com.dmdev.practice;

import java.util.Map;

/**
 * 1. Задан текст на английском языке. Выделить все различные слова.
 * <p>
 * Для каждого слова подсчитать частоту его встречаемости.
 * Слова, отличающиеся регистром букв, считать различными.
 * </p>
 */
public class WordRunner {


    public static void main(String[] args) {
        String text = "Fruit and vegetables contain the vitamins and minerals " +
                "we need to stay healthy. But five is actually a fictional number " +
                "thought up by an American nutritionist. She looked at what the average " +
                "person ate and doubled it. According to more recent research, the right " +
                "number is actually eight. The research shows that people who have eight " +
                "pieces of fruit and vegetables a day are much less likely to suffer " +
                "from heart disease than those who eat three.";

        Map<String, Integer> mapText = WordUtil.wordFrequency(text);

        System.out.println(mapText);
    }


}
