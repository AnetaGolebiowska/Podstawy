package Classes;

public class Main2 {
    public static void main(String[] args) {
        Person anetaGolebiowska = new Person ("Aneta", "Gołębopwska", 18); // zostanie utworzona nowy obiekt typu Person
        int number = 5;
        System.out.println(number);
        System.out.println(anetaGolebiowska); // bez danych pakiet + nazwa danych
        System.out.println(anetaGolebiowska.getFirstName());
        System.out.println(anetaGolebiowska.getSurname());
        System.out.println(anetaGolebiowska.getAge());

        anetaGolebiowska.setAge(19); // modyfikacja danych prywatnych - setery;
        System.out.println(anetaGolebiowska.getAge());

        Person adamKowalski = new Person ("Adam", "Kowalski", 20);
        System.out.println(adamKowalski.getFirstName());
        System.out.println(adamKowalski.getSurname());
        System.out.println(adamKowalski.getAge());

        anetaGolebiowska.setAge(18);
        System.out.println(anetaGolebiowska.getAge());

        Cake applePie = new Cake(4,2,12);
        System.out.println(applePie.isTasty());

        Cake tastyApplePie = new Cake(2,4,12);
        System.out.println(tastyApplePie.isTasty());

        Cake superTastyPie = new Cake (2,4,10);
        System.out.println(superTastyPie.isTasty());

    }
}
