package Day3.Person;

public class Indeks {

    private double sredniaOcen;
    private Osoba daneOsobowe;
    private int[] tablicaOcen;

    public Indeks(Osoba daneOsobowe) {
        this.daneOsobowe = daneOsobowe;
    }

    public double getSredniaOcen() {
        return sredniaOcen;
    }

    public boolean isZagrożenie() {
        for (int ocena : tablicaOcen) {
            if (ocena <= 2) {
                return true;
            }
        }return false;
    }



    public int[] getTablicaOcen() {
        return tablicaOcen;
    }

    public void setTablicaOcen(int[] tablicaOcen) {
        this.tablicaOcen = tablicaOcen;
    }

    public Osoba getDaneOsobowe() {
        return daneOsobowe;
    }

    public double obliczSrednia (){
    double suma = 0;
    for (int i = 0; i < tablicaOcen.length; i++){
        suma = suma + tablicaOcen[i]; // bierzemy aktualną wartość do sumowanych dotychczas elementów i bierzemy koolejny, który równiez dodajemy
    }
    return (double) suma / tablicaOcen.length; // dzieląc 2 licby całkowite przez siebie, otrzymamy liczbę całkowitą
    // można zrobić sumę jako double i nie trzeba będzie wtedy robić rzutowania
    }


}
