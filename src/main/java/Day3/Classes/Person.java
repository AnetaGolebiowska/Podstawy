package Classes;

public class Person {
    private String firstName;
    private String surname;
    private int age;

    // public Person () // konstruktor
    // {firstName "Gal";
    // surname = "Anonim";

   // }
    public Person (){} // konstruktor domyślny

    public Person (String firstName, String surname, int age){ // kontruktor parametrowy, w którym ktoś będzie mógł pwoewadzić dane
        this.firstName = firstName;
        this.surname = surname;
        this.age = age;
    }

    public String getFirstName (){
        return firstName;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }
    public void setAge (int age){
        this.age = age;
    }
}
// ta klasa przechowuje informacje - kontener danych
// ktoś nie ma dostępu do danych, poniewza są prywatne, możliwe jest jedyznie skorzystanie z metory, która jest publiczna