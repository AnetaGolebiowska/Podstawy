package Day8.Lambdas;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws IOException {
        LambdasExample lambdasExample = new LambdasExample();
        Integer powerResult = lambdasExample.power().apply(5); // apply - przyjmuje liczbę całkowitą
        System.out.println(powerResult);

        Integer sum = lambdasExample.add().apply(3, 5);
        System.out.println(sum);

        Path path = Paths.get("src", "main", "resources", "panTadeusz.txt");
        Stream<String> lines = Files.lines(path);                    // przygotowanie strumienia do wczytania
        List<String> parsedLinees = lines.filter(line -> line.contains("."))       // filtrowanie -  akceptowanie linii z kropkami
                .filter(line -> line.contains("a"))                  // filtr odrzuci część linii bez litery "a"
                .map(line -> line.toLowerCase())                     // "mapowanie" - zmiana linii na małe litery
                .collect(Collectors.toList());                       // zapisanie wyniku przetwarzania do listy
        // tworzymy łańcuch funkcjonalności po "."

        System.out.println(parsedLinees);


        List<String> parstLinesForList = new ArrayList<>();            //przygotowujemy listę wynikóe z przetworzonymi liniami
        List<String> lineList = Files.readAllLines(path);              // wczytujemy z pliku
        for (String line : lineList) {                                 // przejście po wszystkich liniach
            if (line.contains(".") && line.contains("a")) {            //  wybranie wszystkich, które zawierajaą kropkę i literę "a"
                line = line.toLowerCase();                             // "mapowanie" i zmiana na małe litery
                parstLinesForList.add(line);                           // dodawanie przetworzonej linii do listy wyników
            }
        }
        System.out.println(parstLinesForList);

        List<String> words = new ArrayList<>();
        words.add("Ala ma kota");
        words.add("Hello World!");
        words.add("Dzisiaj jets niedziela");

        List<String> result = words.stream()
                .filter(word -> word.contains("!"))                      // bierzemy tylko linie z !
                .map(word -> word.split(" "))                     // dzielimy linie na słowa
                // po wykonaniu map, mamy tablicę łańcuchów znakowych (Stringów)
                .map(wordArray -> Arrays.asList(wordArray))              // zamieniamy tablicę Stringów na listę Stringów
                .flatMap(list -> list.stream())                          // zamiania listę na strumień
                // po wykonaniu mamy znów strumień Strongów, nie tablicę Strongów
                .collect(Collectors.toList());                           // zmieniamy strumień na listę

        System.out.println(result);

        Map<String, Integer> wordsToCount = new HashMap<>();
        wordsToCount.put("A", 1);
        wordsToCount.put("B", 15);
        wordsToCount.put("C", 1);
        wordsToCount.put("D", 14);

//        System.out.println(wordsToCount);
//        for (Map.Entry<String, Integer> keyValue: wordsToCount.entrySet()){
//            if (keyValue.getValue() == 1){
//                wordsToCount.remove(keyValue.getKey());
//            }
//        }
//        System.out.println();
//        System.out.println(wordsToCount);

        // Nie zadziała, bo nie możemy usunąć elementu w trakcie jego sprawdzania

        // Set, w którym przechowujemy klucz (String), wartość (Inetger)
        Set<Map.Entry<String, Integer>> enterySet = wordsToCount.entrySet();        // pobieramy wszystkie elementy
        Iterator<Map.Entry<String, Integer>> iterator = enterySet.iterator();       // pobranie itratora kolekcji (pobietanie kolejnych elementó kolekcji
        // Iterator umożliwia usuwanie lementów podczas przechodenia po wszystkich elementach danej kolkcji
        // Iterator to jest interface
        while (iterator.hasNext()) {                                                   // pętla while będie wykonywana dopóki istnieje kolejny element tej kolekcji
            Map.Entry<String, Integer> nextKeyValue = iterator.next();
            if (nextKeyValue.getValue() == 1) {
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println(wordsToCount);

        // to samo co wyżej, tylko z parametrem lambda

        wordsToCount.entrySet()
                .removeIf(keyValue -> keyValue.getValue() == 1);
        wordsToCount.forEach((key, value) -> System.out.println(key + " : " + value));


        //lambdy zwracajce wynik
        Function<String, String> lambdaForOneParameterAndOneResult;
        BiFunction<String, String, String> lambdaForTwoParameterAndOneResultat;

        // lambdy nie dajce rezultaw, traktowane jak metody typu void
        Consumer<String> lambdaForOneParameterAdnNoRelult;
        BiConsumer<String, String> lambdaForTwoPatameterAndNoResult;
    }
}
