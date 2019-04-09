package Zadanka.Exceptions;

// definiowanie wasnych wyjtkw poprzez rozszerzenie klasy
public class UncheckedExceptions extends RuntimeException{

    public UncheckedExceptions (String message){
        super(message);
    }
    public UncheckedExceptions(String message, Throwable cause){
        super(message, cause);
    }
}
