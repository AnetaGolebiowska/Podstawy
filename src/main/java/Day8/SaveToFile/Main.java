package Day8.SaveToFile;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        Path path = Paths.get("C:\\Users\\hp\\Documents\\Kurs Java\\test.txt");
        SaveToFile saveToFile = new SaveToFile();
        List<String> lines = new ArrayList<>();
        lines.add("Ala Mma kota");
        lines.add("Hello world");
        lines.add("Lubię piątki");

        saveToFile.save(path,lines);

    }
}
