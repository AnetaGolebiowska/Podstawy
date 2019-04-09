package Day5.Task3;

import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Person marcinZrbra = new Person("Marcin", "Zebra");
        Person adamZrbra = new Person("Adam", "Zebra");
        Person wojtekBanan = new Person("Wojtek", "Banan");
        Person wojtekArbuz = new Person("wojtek", "barbuz");


        ArrayList<Person> people = new ArrayList<>();
        people.add(marcinZrbra);
        people.add(adamZrbra);
        people.add(wojtekBanan);
        people.add(wojtekArbuz);

        for (Person person : people) {
            System.out.println(person);
        }
        System.out.println();

        /////////////

        List<String> linkedList = new LinkedList<>();  // działa szybciej przy dodawaniu elementów
        linkedList.add("aaa");
        linkedList.add("aaa2");
        linkedList.add(1, "ccc"); // lepiej nie dodawać w ten sposób, bo zmniejsza to wydajność
//        dodawanie elementów jest szybkie, przeszukiwanie wolne
        ((LinkedList<String>) linkedList).addFirst("aaa");
        ((LinkedList<String>) linkedList).addLast("ppp");

        ((LinkedList<String>) linkedList).getFirst();
        ((LinkedList<String>) linkedList).getLast();
        //szukanie pierwszego i ostatniego jest bardzo szybkie

        ///////////////////////
        Set<Integer> numbers = new HashSet<>();
        numbers.add(6);
        numbers.add(3);
        numbers.add(3);

        Person miachal = new Person("Michał", "Jaszczyk");
        Person miachal2 = new Person("Michał", "Jaszczyk");

        HashSet<Person> peopleSet = new HashSet<>();
        peopleSet.add(miachal);
        peopleSet.add(miachal2);
        // Java uznaje, że te dwie osoby o takich samych danych, to różne osoby
//        po dodaniu equals i hashcode, wyświetli jedną osobę, bo je porówna
        System.out.println(peopleSet);

        /////////////////////////
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(4);
        System.out.println(treeSet);
        treeSet.add(4);
        System.out.println(treeSet);
        treeSet.add(9);
        System.out.println(treeSet);
        treeSet.add(3);
        System.out.println(treeSet);


        TreeSet<Person> personTreeSet = new TreeSet<>(); // mamy już compareTo, dlatego możemy
        personTreeSet.add(marcinZrbra);
        System.out.println(personTreeSet);
        personTreeSet.add(adamZrbra);
        System.out.println(personTreeSet);
        personTreeSet.add(wojtekBanan);
        System.out.println(personTreeSet);
        personTreeSet.add(wojtekArbuz);
        System.out.println(personTreeSet);

        ////////////////////////////////////////////////

        LinkedHashSet<Person> personLinkedHashSet = new LinkedHashSet<>(); // mamy już compareTo, dlatego możemy
        personLinkedHashSet.add(marcinZrbra);
        System.out.println(personLinkedHashSet);
        personLinkedHashSet.add(adamZrbra);
        System.out.println(personLinkedHashSet);
        personLinkedHashSet.add(wojtekBanan);
        System.out.println(personLinkedHashSet);
        personLinkedHashSet.add(wojtekArbuz);
        System.out.println(personLinkedHashSet);

        ///////////////////////////////

        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(5, new Person("A", "B")); // Kluczenie nie mogą się powtarzać
        personMap.put(120, new Person("A", "B"));
        personMap.put(5, new Person("Z", "Z")); // zamiana wartości pod kluczem

        personMap.putIfAbsent(5, new Person("D", "D"));

        Person existingPersonZZ = personMap.putIfAbsent(5, new Person("D", "D"));
        Person nonExistingPerson = personMap.putIfAbsent(50, new Person("D", "D"));

        Person personZZForKey = personMap.get(5); // pobietanie obiektu spod klucza
        Person personZZForKeyNull = personMap.get(55); // pobietanie obiektu spod klucza - dostaniemy null, bo nie ma takiej osoby

        if (personMap.containsKey(55)) { // szukanie, czy istieje taki klucz
            Person personNullValute = personMap.get(55);
        }

        personMap.putIfAbsent(123, null); // nie należy do mapy wrzucać nulla

        Person thisPersonCannBeNull = personMap.get(55);
        if (thisPersonCannBeNull != null) {
            thisPersonCannBeNull.getName(); // zabezpieczenie przed nulem, można np pobrać imię
        }

        for (Map.Entry<Integer, Person> keyValue : personMap.entrySet()) {
            System.out.println(" " + keyValue.getValue() + keyValue.getValue()); // spacja na początku, żeby nie było podkreślenia
        }

        for (Integer key : personMap.keySet()) {
            System.out.println(key);
            Person person = personMap.get(key);
                }
        for (Person person : personMap.values()) { // pobieranie wartości pod kluczami
            System.out.println(person);
        }
        Person replacePerson = personMap.replace(5, new Person("t", "t")); // zmiana warości
        Person replacePerson2 = personMap.replace(66, new Person("h", "h")); //  nie mzoeni wartości, tylko wywoła null

        TreeMap<Integer, Person> treeMap = new TreeMap<>();
        treeMap.put(5, new Person("R", "R"));

    }
}