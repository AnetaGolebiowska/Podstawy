package pl.sda.javastart.Day1;


import java.util.Scanner;


public class CalculatorExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę:");

        int firstValue = scanner.nextInt();

        System.out.println("Podaj drugą liczbę:");

        int secondValue = scanner.nextInt();


        System.out.println("a+b=" + (firstValue + secondValue));

        System.out.println("a-b=" + (firstValue - secondValue));

        System.out.println("a*b=" + (firstValue * secondValue));

        System.out.println("a/b=" + (firstValue / secondValue));

        System.out.println("|a-b|=" + Math.abs(firstValue - secondValue));

        System.out.println("Max(a,b)=" + Math.max(firstValue, secondValue));

        System.out.println("Pow(a,b)=" + Math.pow(firstValue, secondValue));

        System.out.println(2 + 3);
        System.out.println(2 - 4);
        System.out.println(5 / 2);
        System.out.println(5.0 / 2);
        System.out.println(5 / 2.0);
        System.out.println(5.0 / 2.0);
        System.out.println(100L - 10);
        System.out.println(2f - 3);
        System.out.println(5f / 2);
        System.out.println(5d / 2);
        System.out.println('A' + 2);
        System.out.println('a' + 2);
        System.out.println("a" + 2);
        System.out.println("a"+"b");
        System.out.println('a' + 'b');
        System.out.println("a" + 'b');
        System.out.println("a" + 'b' + 3);
        System.out.println('b' + 3 + "a");
        System.out.println(9%4);
        System.out.println(-5 + 8 * 6);
        System.out.println("" + 5 + 8 + 6);
        System.out.println((55 + 9) % 9);
        System.out.println(20 + -3 * 5 / 8);
        System.out.println(5 + 15 / 3 * 2 - 8 % 3);


    }

}