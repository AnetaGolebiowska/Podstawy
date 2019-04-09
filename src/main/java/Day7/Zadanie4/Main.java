package Zadanie4;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        WordCounter wordCounter= new WordCounter();
        Path panTadeuszPath = Paths.get("src", "main", "resources", "panTadeusz.txt"); // wczytywanie pliku do liczenia słów
        try {
            wordCounter.loadFile(panTadeuszPath); // sprawdzamy, czy usa się załądować plik
            int wordCount = wordCounter.cantWords();
            System.out.println("Ilość słów: " + wordCount);
            Set<String> uniqueWords = wordCounter.uniqueWord();
            System.out.println(uniqueWords.size());
            System.out.println(uniqueWords);
            Map<String, Integer> duplicateWordCointer = wordCounter.countDuplicateWords();
            System.out.println(duplicateWordCointer);

        } catch (IOException e) {
            System.out.println("Taki plik nie istnieje" + panTadeuszPath);
        }
    }
}
