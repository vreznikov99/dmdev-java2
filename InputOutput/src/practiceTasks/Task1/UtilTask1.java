package practiceTasks.Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;



public final class UtilTask1 {
    private UtilTask1() {
    }

    public static Map<Character, Integer> letterUsageFrequency(Path path) throws IOException {
        Map<Character, Integer> mapResult = null;
        try (Stream<String> lines = Files.lines(path)) {
            mapResult = lines.map(String::chars)
                    .flatMapToInt(Function.identity())
                    .mapToObj(intValue -> (char) intValue)
                    .filter(Character::isLetter)
                    .map(Character::toLowerCase)
                    .collect(Collectors.toMap(Function.identity(), it -> 1, Integer::sum));
        }
        return mapResult;

    }

    public static List<String> toStringLetterUsageFrequency(Map<Character, Integer> mapLetterFrequency) {
        List<String> resultList = mapLetterFrequency.entrySet().stream()
                .sorted(Map.Entry.comparingByKey())
                .map(entry -> entry.getKey() + ": " + entry.getValue())
                .collect(Collectors.toList());
        return resultList;
    }
}
