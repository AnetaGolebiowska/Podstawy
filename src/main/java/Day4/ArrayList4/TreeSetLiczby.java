//11p. Stwórz kolekcję przechowującą tylko unikalne liczby całkowite
//        12p. Kolekcja powinna być automatycznie posortowana za
//        każdym razem kiedy dodamy nowy element (TreeSet)
//        13p. Dodaj do kolekcji następujące liczby i wyświetl jej zawartość po każdym dodaniu liczby:
//        5, 3, 50, 12, 1, 3, 100, 12, 0

package Dzien4.ArrayList4;

import java.util.TreeSet;

public class TreeSetLiczby {
    public static void main(String[] args) {

        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        System.out.println(treeSet);
        treeSet.add(3);
        System.out.println(treeSet);
        treeSet.add(50);
        System.out.println(treeSet);
        treeSet.add(12);
        System.out.println(treeSet);
        treeSet.add(1);
        System.out.println(treeSet);
        treeSet.add(3);
        System.out.println(treeSet);
        treeSet.add(100);
        System.out.println(treeSet);
        treeSet.add(12);
        System.out.println(treeSet);
        treeSet.add(0);
        System.out.println(treeSet);
    }
}
