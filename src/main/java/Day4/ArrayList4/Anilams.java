//5. Stwórz listę przechowującą ciągi znaków
//        6p. Dodaj do listy następujące wyrazy:
//        kot, pies, bocian, aligator, zebra, chomik, kaczka
//        7p. Odwróć kolejność wyrazów na liście
//        8p. Posortuj listę alfabetycznie
//        9p. Wymieszaj elementy na liście w losowy sposób
//        10p. Posortuj listę alfabetycznie w odwrotnej kolejności

package Dzien4.ArrayList4;

import javafx.print.Collation;

import java.lang.reflect.Array;
import java.util.*;

public class Anilams {
    public static void main(String[] args) {

        ArrayList<String> anilams = new ArrayList<>();

        anilams.add("kat");
        anilams.add("pies");
        anilams.add("bocian");
        anilams.add("aligator");

        System.out.println(anilams);

//        Colletions.reverse(anilams);
//        System.out.println(anilams);
//
//        anilams.sort(Comparator.naturalOrder());
//        System.out.println(anilams);
//
//        Collations.shuffle(animals, new Random()); // ten sam sposób losowania
//        System.out.println(anilams);
//
//        Collections.sort(Comparator.reverseOrder());
//        System.out.println(anilams);
    }


}

