//1. Wypisz wszystkie liczby z zakresu 20 do 123.
//        2. Wypisz wszystkie liczby z zakresu -40 do 15.
//        3. Wypisz wszystkie liczby z zakresu 1 do 100 w kolejności od największej do najmniejszej
//        4. Wypisz wszystkie liczby parzyste z przedziału 0 do 100.
//        5. Dla liczb z przedziału 0 do 100 podaj informację, czy są podzielne przez 2, 3 i 5,
//        w następujący sposób:
//        0, podzielne przez: 2, 3, 5
//        1
//        2, podzielne przez: 2
//        3, podzielne przez: 3
//        4, podzielne przez: 2
//        5, podzielne przez: 5
//        6, podzielne przez: 2, 3
//        7
//        8, podzielne przez: 2
//        9, podzielne przez: 3
//        10, podzielne przez: 2, 5

package Zadanka.Zadanie1;

public class Calculator {
    public static void main(String[] args) {


        for (int i = 20; i <= 123; i++) {
            System.out.println(i);
        }
        for (int i = -40; i <= 15; i++) {
            System.out.println(i);
        }
        for (int i = 100; i <= 0; i--) {
            System.out.println(i);
        }

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0 && i % 3 == 0 && i % 5 == 0) {
                System.out.println("Podzielne przez: 2, 3, 5 ");
            } else if (i % 2 == 0 && i % 3 == 0) {
                System.out.println("Podzielne przez: 2, 3");
            } else if (i % 2 == 0 && i % 5 == 0) {
                System.out.println("Podzielne przez: 2, 5");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Podzielne przez: 3, 3");
            } else if (i % 2 == 0) {
                System.out.println("Podzielne przez: 2");
            } else if (i % 3 == 0) {
                System.out.println("Podzielne przez: 3");
            } else if (i % 5 == 0) {
                System.out.println("Podzielne przez: 5");
            } else {
                System.out.println();
            }
        }
    }
}
