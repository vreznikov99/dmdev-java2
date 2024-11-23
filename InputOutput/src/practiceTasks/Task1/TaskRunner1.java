package practiceTasks.Task1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Map;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.*;

/**
 * 1. Задан файл со стихотворением Александра Пушкина.
 * Определить частоту повторяемости всех букв в стихотворении, игнорируя регистр.
 * Вывести результат в файл в виде:
 * а - 15
 * б - 7
 * ....
 * я - 11
 */
public class TaskRunner1 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "poem.txt");
        Map<Character, Integer> mapLetterFrequency = UtilTask1.letterUsageFrequency(path);

        Path resultPath = Path.of("src","practiceTasks", "Task1", "Task1.txt");
        List<String> stringList = UtilTask1.toStringLetterUsageFrequency(mapLetterFrequency);
        Files.write(resultPath, stringList, CREATE, TRUNCATE_EXISTING);
    }
}
