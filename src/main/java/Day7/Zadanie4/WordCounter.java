//16. Stwórz klasę WordCounter
//        17. Stwórz metodę loadFile, która jako argument przyjmuje ścieżkę
//        do pliku (Path) i zapisuje zawartoś pliku jako listę Stringów
//        18. Dodaj metodę countWords, która zwróci liczbę wyrazów z wczytanego pliku
//        (skorzystać z metody split na Stringu)
//        19. Dodaj metodę uniqueWords, która zwróci kolekcję unikalnych słów
//        20. Dodaj metodę countDuplicatedWords, która zwróci kolekcję słów wraz
//        z liczbą wystąpienia danego słowa (użyj Map)

package Zadanie4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;

public class WordCounter {

    private List<String> fileContent;

    public void loadFile(Path path) throws IOException {   // metoda wczytująca plik Path
        fileContent = Files.readAllLines(path);            // lista linii każdy element listy jest osobną listą w pliku
    }

    public int cantWords() {                          // wywołujemy metodę getWords, która zwraca listę  wszystkich slów
        return getWords().size();                     // pobieramy rozmiar listy
    }

    public Set<String> uniqueWord() {
        List<String> words = getWords();
        Set<String> unigueWord = new HashSet<>(words);
        return unigueWord;

//        return new HashSet<>(getWords()); - to samo, co wyżej
    }

    public Map<String, Integer> countDuplicateWords() {
        Map<String, Integer> wordsToCount = new HashMap<>();
        List<String> words = getWords();
        for (String word : words) {
            Integer count = wordsToCount.get(word);
            if (count != null) {
                wordsToCount.replace(word, count + 1);
            } else {
                wordsToCount.put(word, 1);
            }
        }
        return wordsToCount;
    }
//    public List<String> frequencyWords() {
//        List<String> frequencyWords = getWords();
//
//        for (String word : frequencyWords) {
////            List<String> frequencyWord = (Collections.frequency(frequencyWords, ));
//
//        }
//    }

    private List<String> getWords() {
        List<String> wordList = new ArrayList<>();
        for (String line : fileContent) {                             // przechodzimy po wszystkich liniach
            line = line.toLowerCase();
            String[] words = line.split("[ ,.:;!?()]");         // dzielimy linie na słowa i eliminujemy znaki specjalne
            List<String> lineWords = Arrays.asList(words);            // zamieniamy tablicę na listę
            wordList.addAll(lineWords);                               // dodajemy słowa do linii wynikó
        }
//        wordList.removeAll(Arrays.asList(" "));                     // usuwa wszystkie podane w kolekcji elementy
        List<String> immutableList = (Collections.singletonList(" "));           // Nowa lista z pojedynczym elementem, której ie można modyfikować
        wordList.removeAll(immutableList);


        return wordList;
    }
}



//    public Set<String> uniqueWord() {
//
//        Set<String> uniqueWord = new HashSet<>(); // Przygotowujemy Set na unikalne słowa
//
//        for (String line : fileContent) { // przechodzimy po wszystkich liniacj
//
//            String[] words = line.split(" ");      /// dzielimy liię na słowa
////            for (String word: words){ // dodanie wszystkicj słów w linni do Setu
////                uniqueWord.add(word);
//
//
//            List<String> listOfWords = Arrays.asList(words); // dodanie listy słów (cały plik)
//            uniqueWord.addAll(Arrays.asList()); // zamiana tablicy na listę, dzięi Arrays
//
//            // działa tak samo jak powyższy for
//
//        }
//        return uniqueWord;
//}