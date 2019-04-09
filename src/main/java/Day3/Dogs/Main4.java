package Dogs;

public class Main4 {
    public static void main(String[] args) {
        Sznaucer sznaucer = new Sznaucer();
        Lablador lablador = new Lablador();
        York york = new York();
        Pies pies = new Pies("kundel");

        Pies[] psy = new Pies[]{sznaucer, lablador, york, pies};
        Zwierze[] zwierzeta = new Zwierze[]{sznaucer, lablador, york, pies};

        for (Pies tymczasowyPies : psy) {
            System.out.println(tymczasowyPies.getRasa() + " " + tymczasowyPies.szczekaj());
        }
        Dog reksio = new Dog("Reksio", "Kundel", 'M');
        System.out.println(reksio);
    }
}
