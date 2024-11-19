package com.dmdev.stream;

import java.util.IntSummaryStatistics;
import java.util.List;

public class MainStream {
    public static void main(String[] args) {
        List<String> strings = List.of("22","33","44","55","66");
        IntSummaryStatistics intSummaryStatistics = strings.stream()
                .map(string -> string + string)
                .map(Integer::valueOf)
                .filter(value -> value % 2 == 0)
                .sorted()
                .limit(2)
                .mapToInt(Integer::intValue)
//                .mapToObj(Integer::valueOf)
                .summaryStatistics();

        System.out.println(intSummaryStatistics);
    }
}
