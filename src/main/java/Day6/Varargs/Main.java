package Zadanka.Varargs;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {

        Path path = Paths.get("aaa", "zzz", "xx", "xx");
        VarargsExample varargsExample = new VarargsExample();
        varargsExample.fun(1);
        varargsExample.fun(1, 3);
        varargsExample.fun(1, 3, 7, 7, 3, 2); // możemy podać dowolną liczbę argumentów
        varargsExample.fun(); // możemy nie podawać żadnego argumentu

    }
}
