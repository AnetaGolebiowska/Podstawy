package Task6;

public class MainGrzyby {
    public static void main(String[] args) {
        Prawdziwek prawdziwek = new Prawdziwek();
        Pieczarka pieczarka = new Pieczarka();
        Muchomor muchomor = new Muchomor();

//        Jadlany jadalny = new Jadalny;
        Grzyb grzybPieczarka = new Pieczarka();
        Grzyb grzybMuchomor = new Muchomor();
        Grzyb grzybPrawdziwek = new Prawdziwek();


        Jadalny jadalnyPieczarka = new Pieczarka();
//        Jadalny jadalnybMuchomor = new Muchomor();
        Jadalny jadalnyPrawdziwek = new Prawdziwek();

        Grzyb[] grzyby = {pieczarka, prawdziwek, muchomor,
                grzybMuchomor, grzybPieczarka, grzybPrawdziwek};
        for (Grzyb tymczasowyGrzyb : grzyby) {
            tymczasowyGrzyb.zbierz();
        }

        Jadalny[] jadalne = {jadalnyPieczarka, jadalnyPrawdziwek};
        for (Jadalny jadalny : jadalne) {
            jadalny.zjedz();
        }
    }
}
