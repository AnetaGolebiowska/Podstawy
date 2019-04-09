package Day2;

import org.junit.Test;

import static org.junit.Assert.*;


public class IfsExample {

    @Test
    public void shouldNotAnswerBecauseWeAreAsleep() {
        boolean mum = true;
        boolean isMorning = true;
        boolean isAsleep = true;

        boolean result = IfsExample.answerCall(mum, isMorning, isAsleep);

        assertFalse(result);

    }

    @Test
    public void shouldNotAnswerBecauseWeAreNotAsleepAndItIsNotMama() {
        boolean mum = false;
        boolean isMorning = true;
        boolean isAsleep = false;

        boolean result = IfsExample.answerCall(mum, isMorning, isAsleep);

        assertFalse(result);

    }

    public static void main(String[] args) {
        System.out.println(isEven(2));
        System.out.println(dividableByThreeAndFive(15));
        System.out.println(introduce("Michał", 30, true));
        System.out.println(answerCall(true, true, false));
        System.out.println(isEvenTernary(1000));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }

    }

    public static boolean dividableByThreeAndFive(int number) {
        if ((number % 3 == 0 && (number % 5 == 0))) {
            return true;
        }
        return false;
    }

    public static String introduce(String name, int age, boolean male) {
        String gender; // inicjalizowanie zmiennej, bez zadeklarowania, ponieważ zmienna będzie używana w niżej występujących metodach if i else

        if (male) {
            gender = "mężczyzną.";
        } else {
            gender = "kobietą.";
        }
        String result = ("Cześć jestem " + name + " mam " + age + " lat i jestem " + gender);

        return result;
    }

    public static boolean threeParamsSum(int a, int b, int c) {
        if (a + b == c) {
            return true;
        }
        if (a + c == b)
            return true;
        {
            if (b + c == a) {
                return true;
            }
            return false;

        }
    }

    public static boolean answerCall(boolean mum, boolean isMorning, boolean inAsleep) {
        if (inAsleep) {
            return false;
        }
        if (isMorning && !mum) {
            return false;
        }
        return true;
    }

    public static Double switchCalculator(int a, int b, char sign) {

        switch (sign) {

            case '+':

                return Double.valueOf(a + b); //jedna opcja (nie zapewnia dokładności typu double)

            case '-':

                return Double.valueOf(a - b);

            case '*':

                return (double) a * b; //druga opcja -> rozszerzanie typu a potem autoboxing

            case '/':

                if (b == 0) {

                    System.out.println("Nie dziel cholero przez zero!!!");

                    return null;

                }

                return (double) (a / b);

            default:

                System.out.println("Nie wybrales znaku");

                return null;
        }
    }
    public static boolean isEvenTernary (int a){
        boolean result = a % 2 == 0?true:false; // return a%2 == 0 - dopuszczalna krótsza wersja
        return result;


    }
}
