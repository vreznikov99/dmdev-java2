package com.dmdev.pactice_lesson;

import java.util.*;

/**
 * 4. Сложить два многочлена заданной степени, если коэффициенты
 * многочлена хранятся в объекте HashMap в виде:
 * Ключ: номер степени
 * Значение: значение множителя
 * Вывести результирующий многочлен в виде строки: ax^6 + bx^4 +
 * cx^3 + dx + 8
 */

public class Task4 {
    public static void main(String[] args) {
        Map<Integer, Integer> map1 = new HashMap<>(Map.of(
                3, 2,
                5, 4,
                2, 1,
                4, 5
        ));

        Map<Integer, Integer> map2 = new HashMap<>(Map.of(
                5, 1,
                2, 6,
                4, 2,
                1, 3,
                0, 8
        ));
        // 5x^5 + 7x^4 + 2x^3 + 7x^2 + 3x
        Map<Integer, Integer> map = sum(map1, map2);
        System.out.println(convertToString(map));

    }
    public static String convertToString(Map<Integer,Integer> map){
        Map<Integer, Integer> result = new TreeMap<>(Comparator.reverseOrder());
        result.putAll(map);
        List<String> list = new ArrayList<>(result.size());
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            String value = entry.getKey() == 0 ?
                    String.valueOf((entry.getValue())) :
                entry.getValue() + "x^" + entry.getKey();
            list.add(value);
        }
        return String.join(" + ", list);
    }
    public static Map<Integer, Integer> sum(Map<Integer, Integer> map1, Map<Integer, Integer> map2){
        Map<Integer, Integer> resultMap = new HashMap<>(map1);
        for (Map.Entry<Integer, Integer> entry : map2.entrySet()) {
            Integer value = resultMap.getOrDefault(entry.getKey(), 0);
            resultMap.put(entry.getKey(), value + entry.getValue());
//            resultMap.merge(entry.getKey(), entry.getValue(), (newValue, oldValue) -> newValue + oldValue);
//            resultMap.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return resultMap;
    }
}
