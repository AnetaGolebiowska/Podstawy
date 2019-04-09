package Zadanka.Exceptions;

// definiowanie wyjtku poprzez rozszerzenie klasy
public class MyExceptions extends Exception {

    // przekazywanie informacji o wyjtku
    public MyExceptions(String message) {
        super(message);
    }
    public MyExceptions(String message, Throwable cause) {
        super(message, cause);
    }
    // throeable cause - co jest przyczyną
}
