package practice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * 3. Задан файл с текстом. В каждой строке найти и вывести
 * наибольшее число цифр, идущих подряд.
 */
public class Task3 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "poem.txt");
        Files.readAllLines(path).stream()
                .map(Task3::findMaxSequenceOfNumbersPerLine)
                .forEach(System.out::println);

    }

    private static Integer findMaxSequenceOfNumbersPerLine(String line) {
        int result = 0;
        int counter = 0;
        for (int i = 0; i < line.length(); i++){
            if(Character.isDigit(line.charAt(i))){
                counter++;
            }
            else{
                if(counter > result){
                    result = counter;
                }
                counter = 0;
            }
        }
        return result;
    }
}
