import java.awt.*;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class FilesOutput {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "filesOutput.txt");
        Files.write(path, List.of("Hello world", "Java"));

    }
}
