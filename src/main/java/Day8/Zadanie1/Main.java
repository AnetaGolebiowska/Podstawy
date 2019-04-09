package Day8.Zadanie1;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        PersonManager personManager = new PersonManager();
        Path path = Paths.get("src", "main", "resources", "people.txt"); // przygotowanie ścieżki do pliku

        personManager.load(path); // pobranie pliku
        List <Person> people = personManager.getPeople(); // utworzenie listy osób z parametrami
        System.out.println(people);

//        List <Person> people2 = PersonManager.loadPeople(path); // utworzenie listy osób z parametrami
//        System.out.println(people2);
//


    }
}
