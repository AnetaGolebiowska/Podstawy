package Day8.Zadanie1;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonManager {
    private List<Person> people;


    public void load(Path path) throws IOException {
        Stream<String> lines = Files.lines(path);            // przygotowujemy strumień z zawartoscią pliku
        people = lines.filter(line -> line.contains(";"))    //
                .map(line -> line.split(";"))
                .map(lineArray -> new Person(lineArray[0], lineArray[1]))
                .collect(Collectors.toList());
    }

    public List<Person> getPeople() {
        return people;
    }


//    public static loadPeople(Path path) throws IOException {
//        Stream<String> lines = Files.lines(path);            // przygotowujemy strumień z zawartoscią pliku
//        return lines.filter(line -> line.contains(";"))     // zwracanie od razu wyniku przetwarzania
//                .map(line -> line.split(";"))
//                .map(lineArray -> new Person(lineArray[0], lineArray[1]))
//                .collect(Collectors.toList());
//    }
}
