package pl.sda.java.Zadanie3;

public class Calculator {

//    public int fun(int[] numbes) {
//        int sum = 0;
//        for (int number : numbes) {
////            sum = sum +number;
//            sum += number;
//        }
//        return sum;
//    }
    public int fun(int... numbes) { // przekazanie dowolnej ilości parametrów
        int sum = 0;
        for (int number : numbes) {
//            sum = sum +number;
            sum += number;
        }
        return sum;
    }

}
