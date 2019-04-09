package Zadanka.Exceptions;

public class MainExceptions {
    // throws powoduje wrzucenie wyjątku
    public static void main(String[] args) throws Exception {
        methodThatThrowExpection(3);
//        methodThatThrowExpection(130);

        methodThatExecutesMethodWithException();
        try { // możemy obsłużyć wyjątek za pomocą bloku try-catch
           methodThatExecutesMethodWithException();
        }catch (IndexOutOfBoundsException | NullPointerException e) {
            ////obsługa IndexOutOfBoundsException i NullPointerException tą samą logiką
        }// tutaj powinna być logika do obsługi wyjątku
        catch (RuntimeException e) {
            e.printStackTrace();
            // obsłużyc wyjątek lub go zignorować}
                }
        System.out.println("koniec programu");

    }

    public static void methodThatThrowExpection(int number) throws Exception {
        if (number > 100) {
            throw new Exception();
            // jeżeli nie jesteśmy w stanie obsłużyć danej sytuacji to możemy rzucić wyjątkiem
//            throw new IOException();
            //  przykład wyjątku wejścia/wyjścia
        }
        System.out.println("Koniec metody");
    }
    public static void methodThatExecutesMethodWithException(){
        try {
            methodThatThrowExpection(3); // może zostać rzucony wyjątek
            System.out.println("zwykłe instrukcje"); //  nie wykona się w przypadku rzucenia wyjątku w poprzedniej linii

        } catch (Exception e) {
            e.printStackTrace();
            // obsługa wyjątku, powinniśmy zapewnić aby nasza aplikacj dalej działała prawidłowo
        }
        System.out.println("normalne działanie metody"); // zawsze się wykona, ponieważ złapaliśmy wyjątek w bloku try-catch
    }
    public static void methodThatThrowsUncheckedException(){
        throw new RuntimeException();
        // wszystkie klasy dziedziczące po RuntimeException są typu unchecked i nie muszą być obsługiwane.
        // W przypadku wystąpienia zakończą działanie całej aplikacji
//        throw new NullPointerException(); // przykłady unchecked excpetion
//        throw new IndexOutOfBoundsException();
    }

}
