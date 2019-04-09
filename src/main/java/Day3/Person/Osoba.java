package Day3.Person;

public class Osoba {

    private String firstName;
    private String surname;
    private int age;
    private char gender;

    public String getFirstName() {
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public Osoba(String firstName, String surname, int age, char gender) {
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }
}
