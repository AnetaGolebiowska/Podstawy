package Zadanka.Zadanie3Exceptions;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double result = 0;
        try {
            System.out.println("Tworzenie pliku tymczasowego");
            System.out.println(calculator.divide(3, 2));
            System.out.println(calculator.divide(3, 0));
            result = calculator.divide(5, 0);
            System.out.println(result);
            System.out.println("Koniec");
//        System.out.println("Usuwanie pliku tymczasowego");

        } catch (DivideByZeroException e) {
            e.printStackTrace();
            System.out.println("Chcesz podzielić przez 0");
        }finally {
            System.out.println("Usuwanie pliku tymczasowego");
            System.out.println("Sprzątanie po wykonaniu bloky try");
        }
        System.out.println("Kolejne instrukcje");
    }
}
