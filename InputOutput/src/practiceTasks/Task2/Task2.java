package practiceTasks.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import static java.nio.file.StandardOpenOption.CREATE;
import static java.nio.file.StandardOpenOption.TRUNCATE_EXISTING;

/**
 * 2. Создать программно и заполнить файл случайными целыми числами.
 * После чего отсортировать содержимое файла по возрастанию (т.е. перезаписать файл с новым порядком чисел)
 */
public class Task2 {
    public static void main(String[] args) throws IOException {
        Path filePath = Path.of("src","practiceTasks", "Task2", "Task2.txt");
        UtilTask2.fillFileWithRandomNumbers(10);
//        Files.write(filePath, UtilTask2.fillFileWithRandomNumbers(10), CREATE, TRUNCATE_EXISTING);
        Files.write(filePath, UtilTask2.fillBySortAsc(filePath), TRUNCATE_EXISTING);

    }
}
