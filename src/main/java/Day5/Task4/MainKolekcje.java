package Task4;//package Dzien4.ArrayList4;
//--- Zadanie 4 ---
//        0. Dla zadań z literką "p" wypisz zawartość kolekcji na konsolę
//        1. Stwórz klasę Task4.MainKolekcje wraz z metodą Main (skrót: psvm)
//        2p. Stwórz tablicę przechowującą liczby całkowite oraz zainicjalizuj ją następującymi liczbami:
//        31, 12, 5, 7, -3, 123, 6, 0
//        3p. Posortuj elementy tablicy od najmniejszego do największego (pomocna będzie klasa Arrays)
//        4p. Posortuj elementy tablicy od największego do najmniejszego (klasa Arrays + klasa Collections)
//        ----------------



import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MainKolekcje {
    public static void main(String[] args) {
        Integer[] numbers = {31, 12, 5, 7, -3, 123, 6, 0};

        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Arrays.sort(numbers, Collections.reverseOrder());
        System.out.println(Arrays.toString(numbers));
    }
}

