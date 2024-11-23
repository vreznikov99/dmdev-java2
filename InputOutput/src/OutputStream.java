import java.io.*;
import java.nio.file.Path;

public class OutputStream {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "output.txt").toFile();
        try (BufferedOutputStream outputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            String string = "Hello world!";
            outputStream.write(string.getBytes());
            outputStream.write(System.lineSeparator().getBytes());
        }
    }
}
