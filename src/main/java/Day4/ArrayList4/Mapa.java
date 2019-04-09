//14. Stwórz kolekcję, która będzie przechowywać mapowanie liczb całkowitych na słowa
//        (2 -> dwa, 5 -> pięć)
//        15p. Dodaj następujące liczby wraz z odpowiedniemi słowami:
//        5, 3, 9, 1, 0
//        16p. Wyświetl słowo pod liczbą 1
//        17p. Wyświetl wszystkie przechowywane liczby
//        18p. Wyświetl wszystkie przechowywane słowa
//        19p. Wyświetl liczby wraz z odpowidającymi im słowami
//        (np. 1 = jeden)

package Dzien4.ArrayList4;

import java.util.HashMap;
import java.util.Map;

public class Mapa {

    public static void main(String[] args) {

        Map<Integer, String> numbersMap = new HashMap<>();

        numbersMap.put(5, "pięć");
        ((HashMap) numbersMap).put(3, "trzy");
        ((HashMap) numbersMap).put(1, "jeden");
        ((HashMap) numbersMap).put(0, "zero");


        System.out.println(numbersMap.get(1));
        System.out.println(numbersMap.keySet());
        System.out.println(numbersMap.values());
        System.out.println(numbersMap.entrySet());

    }
}
