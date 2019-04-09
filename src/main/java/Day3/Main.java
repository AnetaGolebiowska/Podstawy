package Day3;

public class Main<tab2> {

    private int number = 3; // zmienna zadeklarowana dla wszystkich metod w klasie

    public static void main(String[] args) {
        // zmienne
        int numberOne;
        numberOne = 1;
        int numberTwo = 2;

        byte b;
        short s;
        int i2;
        long l;
        // pudełka na lliczby, im większe, ty, więcej się w nim mieści
        float f = 1.5f;
        double d = 2.5;

        char c = 'r';
        char ch = '\n';
        boolean bool1 = true;
        boolean bool2 = false;

        // domyślną wartością w typach obiektowych jest "null", zaś w typach prostych jest 0 "zero"
        Byte bb = null; // dodstaniemy wyjątek
        Short ss;
        Integer ii = 5;
        Long ll = 5L; // nie da się przypisać liczby do Longa, trzeba dodać "L" - wilekie L

        Float ff = 5.5f;
        Double dd = 5.5;

        Character cc = 'c';

        Boolean bbb = true;

        // warunki logiczne

        if (1 > 5) {
            System.out.println("1 większe od 5");
        } else {
            System.out.println("jeden mniejsze od 5");
        }
        if (numberOne < numberTwo) { // >, >=, <, <=, ==, !=
            System.out.println("numberTwo jest większe");
        } else if (numberTwo > 5) {
        } else if (numberTwo > 1000) {

        } else {
            //
        }
        if ((1 == 1 && 5 == 5) || 14 == 14) {
        } else if (1 == 2 || 6 == 6) {
        }

        //pętle
        for (int i = 0; i < 5; i++) {
            System.out.println(i);

        }
        for (int i = -50; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        for (int i = -50; i <= 100; i = i + 2) {
            System.out.println(i);
        }
        int someNumber = 5;
        while (someNumber > 1) {
            someNumber--;
            System.out.println(someNumber);
        }
        int first = 5;
        int second = 5;
        int i = 5 + first++;
        someNumber--;
        int i1 = 5 + ++second;
        --someNumber;


        // Tablice

        int[] tab = new int[]{6, 8, 9};
        int[] tab2 = new int[5];
        tab2[0] = 245;
        tab2[4] = 100;

        System.out.println(tab.length);
        int[] tab3 = {3, 5, 7};

        for (int j = 0; j < tab.length; j++) {
            System.out.println(tab[j]);
        }
        for (int element : tab) {
            System.out.println(element);
        }
        // tablice dwuwymiarowe
        int[][] multiTab;


        //metody

    }
    // dostępne wartości public, private, protected, packagePrivate (jeśli nie napiszemy, to jest domyślne)
    public static int someMethod (){
        return 5;

    }
    public static void someMethod2 (){
//        System.out.println(someMethod2("Metoda 2"));
    }
    public static int someMethod3 (int param1, long param2) {
        double result = param1 + param2;
        return (int) result; // rzutowanie
    }


}
