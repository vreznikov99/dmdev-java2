package practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
4. Задан файл с java-кодом. Прочитать текст программы из файла и
все слова public в объявлении атрибутов и методов класса заменить
на слово private. Результат сохранить в другой заранее созданный
файл.
*/

public class Task4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "practice", "Task3.java");
        String string = Files.readString(path);

        Path resultPath = Path.of("resources", "Task3.java");
        String result = string.replace("public", "private");
        Files.writeString(resultPath, result);
    }
}
