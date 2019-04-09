package Day8.SaveToFile;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class SaveToFile {
    public void save(Path path, List<String> lines) throws IOException {
        Files.write(path, lines, StandardOpenOption.APPEND, StandardOpenOption.CREATE);
        Files.write(path, lines, StandardOpenOption.APPEND);
        Files.write(path, lines);
        Files.write(path, lines, StandardCharsets.UTF_8);
        // możemy określić kodowanie pliku

        // Zapisywanie tablicy byteów do pliku
        String string = "Hello World!";
        Files.write(path, string.getBytes(), StandardOpenOption.CREATE);
    }
}

