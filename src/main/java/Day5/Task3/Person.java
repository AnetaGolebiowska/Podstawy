package Day5.Task3;

import java.util.Objects;

public class Person implements Comparable { // Ctrl + Q - wykorzystywany jest do sortowania
    private String name;
    private String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public int compareTo(Object o) { // zaimplementowanie matory comperture, klasa Object jest główna w Javie
        Person otherPerson = (Person) o; // rzutujemy, żeby z Object uzyskać person
//
//        int compare = surname.compareTo(otherPerson.surname); // porównanie dwóch person po nazwiskach
//        int compare = surname.toLowerCase().compareTo(otherPerson.surname);// zmiana na wielkie litery
        int compare = surname.compareToIgnoreCase(otherPerson.surname);  //- trzeci najbardziej zalecany sposób

        if (compare == 0) {
            return name.compareTo(otherPerson.name);
        } else {
            return compare;
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                Objects.equals(surname, person.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}

