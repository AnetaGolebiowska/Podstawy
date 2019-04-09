package Day7.Zadanie1;

public class Cat extends Animal implements Predator{
    private int mustacheLength;
    // rozszerzenie cech kota

    public Cat(int mustacheLength) { // dodanie danych do konstruktora mustacheLength
        super("ssak");
        this.mustacheLength = mustacheLength;
                //this oznacza, że mamy do czynienia ze zmienną klasy
    }

    public int getMustacheLength() {
        return mustacheLength;
        // getter do mustacheLength
    }

    @Override
    public void hunt() {
        System.out.println("Poluję jak kot");
    }

    @Override
    public void kill() {
        System.out.println("Zabijam jak kot");
    }

    @Override
    public String toString(){
        return "Cat";
    }
}
