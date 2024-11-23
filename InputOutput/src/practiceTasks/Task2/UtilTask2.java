package practiceTasks.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

public final class UtilTask2 {

    private static final int LIMIT_OF_NUMBERS = 10;
    private static final Random RANDOM = new Random();
    private UtilTask2() {
    }

    public static int getRandomValue() {
        return getRandomValue(LIMIT_OF_NUMBERS);
    }

    public static int getRandomValue(int bound) {
        return RANDOM.nextInt(bound);
    }

    public static List<String> fillFileWithRandomNumbers(int limit) {
        return IntStream.iterate(0, value -> value + 1)
                .limit(limit)
                .map(it -> getRandomValue())
                .mapToObj(String::valueOf)
                .collect(Collectors.toList());
    }

    public static List<String> fillBySortAsc(Path filePath) throws IOException {
        try (Stream<String> lines = Files.lines(filePath)) {
            return lines.mapToInt(Integer::parseInt)
                    .sorted()
                    .mapToObj(String::valueOf)
                    .collect(Collectors.toList());
        }
    }
}
