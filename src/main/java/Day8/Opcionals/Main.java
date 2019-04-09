package Day8.Opcionals;


import Day8.Zadanie1.Person;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person michalJaszczyk = new Person("Miachał", "JAszczyk");
        Person nullPerson = null;

//        nullPErson.getName();  - aplikacja nie będzie dizałać

        if (nullPerson != null) {
            System.out.println(nullPerson.getName()); //- jesteśmy bezpieczni
        }
        Optional<Person> optionalPerson = Optional.ofNullable(nullPerson);
//            Optional.of(nullPerson);

//        Person person = optionalPerson.get();
        Person person1 = optionalPerson.orElse(new Person("Domyślna", "osoba"));
        System.out.println(person1.getName());

        List<String> hello = methodThatReturnOptional()                 // metoda zwraca optionala
                .map(sentence -> sentence.split(" "))             // bierzemy wartość opakowaną przez optional
                .map(wordArray -> Arrays.asList(wordArray))             // zamieniamy tablicę na listę
                .filter(wordsList -> wordsList.contains("ello"))       // tylko te elementy listy z których jednym z elementów jest kot
//                .get() // ostrożnie! jeżeli nie ma żadnego elementu, to dostaniemy wyjątek
                .orElse(new ArrayList<>());
        System.out.println(hello);


        List<String> hello2 = methodThatReturnOptional()               // metoda zwraca optionala
                .map(sentence -> sentence.split(" "))           // bierzemy wartość opakowaną przez optional
                .map(wordArray -> Arrays.asList(wordArray))           // zamieniamy tablicę na listę
                .map(wordsList -> wordsList.stream()                    // zamianiamy tablicę na listę
                        .filter(listElementcontains                     // zamiana listy na stream i sprawdzanie hello
                                -> listElementcontains.contains("ello"))
                        .collect(Collectors.toList()))  // tylko te elementy listy z których jednym z elementów jest kot
                .orElse(new ArrayList<>());
        System.out.println(hello);
    }

    public static Optional<String> methodThatReturnOptional() {
        return Optional.ofNullable("Hello World!");
    }
}

