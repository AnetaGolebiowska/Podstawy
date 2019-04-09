package Day7.Zadanie1;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String someString = "Hello World";
        String anoutherString = new String("Hello Worls");
        // ten sam zapis dwa razy

        LocalDate myBirthday = LocalDate.of(2019, Month.FEBRUARY, 16);
        // Miesiąc korzysta z enuma
        LocalDate myBirthday2 = LocalDate.now();
        Person person = new Person("Imię", "Nazwisko", myBirthday);
        String name = person.getName();
        String surname = person.getSurname();
        LocalDate birthday = person.getBirthday();

//        Animal animal = new Animal() { // nie można strworzyć takiego obiektu, bo jest to klasa abstrakcyjna
        Dog dog = new Dog("ssak");
        Cat cat = new Cat(5);

        cat.hunt();
        cat.kill();
        String specie = cat.getSpecie();

        Animal catAnimal = new Cat(6); // kolekcja zwierząt
        // Cat sommeCat = new Animal - nie możemy, bo Animal nie rzedziczy po kocie

        catAnimal.getSpecie(); // metoda zwracająca gatunek
        // pozostałe metody nie są dostępne

        // kolekcja zwiarząt
        List<Animal> animalList = new ArrayList<>();
        animalList.add(cat);
        animalList.add(catAnimal);
        // dodanie kota do listy zwierząt

        // instatne off sprawdza typ obiektu (raczej tego nie stosujemy)
        if (catAnimal instanceof Predator) {
            System.out.println("kot to predator");
        }

        Predator catPredator = new Cat(4);
        // nowy obiekt klasy, która implementuje interface
        ((Cat) catPredator).getMustacheLength(); // rzutowanie - nie robimy
        catPredator.hunt();
        catPredator.kill();


        // Klasa anonimowa
        Animal abstractAnimal = new Animal("some specie") {
            private int number;

            public void fun() {
                System.out.println();

                // Nie jesteśmy w stanie wywołać tej metody poza obrębem klasy anonimowej
            }

            @Override
            public String getSpecie() {
                System.out.println("Bla bla");
                return null;
            }
        };


        //nie ma możliwości wywołania metody fun, ponieważ klasa aninimowa nie ma nazwy
        // nie możemy skorzystać z rzutowania

        // klasa anonimowa {} wskazują na klasę anonimową
        System.out.println(abstractAnimal.getSpecie());
        // domyślnie wyświetla się "bla bla", ponieważ nadpisaliśmy metodę

        // Każdą klasę anonimową można zastąpić inną klasą


        // kolejna klasa anonimowa, korzystająca z interfacu Predator
        Predator abstractPredator = new Predator() {
            @Override
            public void hunt() {
                System.out.println("Anoniowe polowanie");
            }
        };
        abstractPredator.kill();
        abstractPredator.hunt();

        Map<String, Cat> catMap = new HashMap<>();
        catMap.put("Filemon", cat);
        catMap.put("Bonifacy", new

                Cat(9));

        Cat filemon = catMap.get("Filemon");
        // pobiera wartość z mapy

        boolean filemonExist = catMap.containsKey("Filemon");
        // sprawdza, czy dany klucz istnieje w mapie
        // jeżeli wartośc nie istnieje, otrzymamy null

        Cat mruczek = catMap.get("Mruczek");
        if (mruczek != null) {
            mruczek.hunt();
        }
        // sprawdzenie, czy obiekt nie jest nullem
        // bezpiecznie możemy wywoływać metody
        else {
            System.out.println("Nie ma Mruczka");
        }

        // działa tak samo, jak warunek wcześniej
        // powyższy przypadek jest mniej naturalny

        if (catMap.containsKey("Mruczek")) {
            catMap.get("Mruczek").hunt();
            // jeżeli wateość pod kluczem Mruczek jest null, to program zakończy się niepowodzeniem
        } else {
            System.out.println("Nie ma Mruczka");
        }

        catMap.putIfAbsent("Filemon", new

                Cat(123));
        // nie doda tego klucza, bo już taki istnieje w mapie

        catMap.putIfAbsent("Boifacy", new

                Cat(25));

        catMap.replace("Bonifacy", new

                Cat(88));
        // zadziała, ponieważ dany klucz istnieje w mapie - zmieni dane

        catMap.replace("Mruczek", new

                Cat(1));
        // nie zamieni, bo nie ma Mruczka

        catMap.getOrDefault("Bonifacy", new

                Cat(9));
        // zwróci wartośc pod kluczem Bonifacy
        catMap.getOrDefault("Klakier", new

                Cat(8));
        // zwróci wartość, którą podaliśmy jako drugi argument, który podaliśmy - 8

//       Collation <Cat> values = catMap.values();
//        Set<String> keys = catMap.keySet();
//        Set<Map.Entry<String, Cat> tempKeyValue : catMap.entrySet();
//        for (Map.Entry<String, Cat>) tempKeyValue : catMap.entrySet(){
//            System.out.println();
//            // przejście po wszystkich elementach w mapie
    }

}


