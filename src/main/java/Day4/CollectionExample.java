package Dzien4;

import java.util.*;

public class CollectionExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};
        int[] numbers2 = new int[]{1, 2, 3};
        int length = numbers.length;

        List<Integer> listOfNumbers; // piwerwszy sposób imprelemnopwania
        listOfNumbers = new ArrayList<>();
        listOfNumbers.add(5);
        listOfNumbers.add(3);
        listOfNumbers.add(123);


        for (int number : listOfNumbers) {
            System.out.println(number);

    }
        Integer pierwszyElement = listOfNumbers.get(0); // pobieranie pierwszego elementu, ponieważ są indeksowane od zera
        int size = listOfNumbers.size(); // podanie wielkości listy (liczby elementów)
        ArrayList<Integer> listOfNumbers2 = new ArrayList<>(); // można w ten sposób inicjalizować
        listOfNumbers.remove(2); // pierwszy sposób usuwania (indeksowanie od 0)
        listOfNumbers.remove(new Integer(5)); // usuwanie elementów o nr 5 z listy


        // do usuwania wykorzystywana jest matoda equals

//        usuwanie wszystkich elementów z listy
        for (int i = 0; i < listOfNumbers.size(); i++) {
            System.out.println("indeks: " + i);
//            if listOfNumbers.get(i) == (5) {
//            System.out.remove(i);
            i--;
    }

        // sortowanie listy
        listOfNumbers.sort(Comparator.naturalOrder()); // naturalne sortowanie
        listOfNumbers.sort(Comparator.reverseOrder()); // sortowanie w odwrotną stronę
        System.out.println(listOfNumbers);



        List <String> words = new LinkedList<>();
        words.add ("aaa");
        words.add ("bbb");
        words.remove (0);
        words.remove ("bbb");

        //unikalne elementy w kolejności dodania
        Set<Integer> setOfNumbers = new HashSet<>();
        setOfNumbers.add(5);
        setOfNumbers.add(3);
        setOfNumbers.add(333);
        setOfNumbers.add(3);

        setOfNumbers.remove(5);

        for (int someNumber : setOfNumbers){
            System.out.println(someNumber);
        }
        // unikalne elementy posortowane
        Set<String>setOfStrings = new TreeSet<>();
        setOfStrings.add("aaa");
        setOfStrings.add ("zzz");
        setOfStrings.add ("bbb");

        for (String someString : setOfStrings){
            System.out.println(someString);
        }

        // unikalne elementy, największa szybkość
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(3);
        linkedHashSet.add(44);
        linkedHashSet.add (3);

        for (int number : linkedHashSet){
            System.out.println(number);
        }

}
}
