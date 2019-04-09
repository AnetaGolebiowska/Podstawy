package Zadanka.Varargs;

public class VarargsExample {
    //metody o zmiennej liczbie argumentów
    public void fun (int a) {
        System.out.println(a);
    }
    public void fun (int a, int b){
        System.out.println(a);
    }

    // przyjmuje dowolną ilość argumentów (nawet 0)
    public void fun (int... numbers){ // argument varargs traktujemy jak tablicę
        int length = numbers.length; // możemy sprawdzić ilość argumentów
        for (int i : numbers){
            System.out.println(i);
        }
        // nie można zdefiniować jeżeli już istnieje metoda używająca varargs
        //    public void fun(int[] a) {
    }
    // varargs musi być ostatnim argumentem
    public void fun (String a, int... b){}
    //String a - argument stały
    // int... b - grupa argumentów (jakbyśmy w argumencie trzymali tablicę

}
