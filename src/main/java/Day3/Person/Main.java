package Day3.Person;

public class Main {
    public static void main(String[] args) {
        Osoba anetaGolebiowska = new Osoba("Aneta", "Gołębiowska", 18, 'K');
        Indeks indeksAnety = new Indeks(anetaGolebiowska);


        int[] oceny = new int []{2,4,6,3,3};
        indeksAnety.setTablicaOcen(oceny);
        double srednia = indeksAnety.obliczSrednia();
        System.out.println(srednia);

        System.out.println(indeksAnety.isZagrożenie());
    }
}
