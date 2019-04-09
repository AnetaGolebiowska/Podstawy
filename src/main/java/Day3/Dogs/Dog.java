package Dogs;

public class Dog {

    private  String name;
    private String bread;
    private char gender;

    public Dog(String name, String bread, char gender) {
        this.name = name;
        this.bread = bread;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public String getBread() {
        return bread;
    }

    public char getGender() {
        return gender;
    }

    @Override
    public String toString() { // metodę tString możemy sobie dowolnie zmieniać
        return name + " " + bread + " " + gender;
    }
}
