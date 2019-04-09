package pl.sda.javastart.Day1;


public class Methods {

    public static final double INCH_TO_METER_MULTIPLIER = 0.0254;


    public static void main(String[] args) {

        int a = 2;

        int b = 3;


        System.out.println(a + b);


        printSum(a, b);

        printSum(2, 4);


        int sum = returnSum(a, b); //jedno rozwiazanie

        System.out.println(sum);


        System.out.println(returnSum(a, b)); //drugie rozwiazanie

    }


    public static void printSum(int a, int b) { //metoda nie nie zwraca - tylko się wykonuje

        System.out.println("Efekt działania metody printSum:" + (a + b));

    }


    public static int returnSum(int a, int b) {

        return a + b;

    }


    public static double inchToMeter(double inches) {

        return (inches * INCH_TO_METER_MULTIPLIER);

    }


}
