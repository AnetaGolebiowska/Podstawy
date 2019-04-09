package TaskMine;

public class Napoje {
    private int objetosc;
    private String nazwa;
    private boolean temperatura;

    public int getObjetosc() {
        return objetosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public boolean isTemperatura() {
        return temperatura;
    }

    public Napoje(){
        this.objetosc = 5;
        this. nazwa = "jakobs";
        this.temperatura = true;
    }

    public Napoje(int objetosc, String nazwa, boolean temperatura) {
        this.objetosc = objetosc;
        this.nazwa = nazwa;
        this.temperatura = temperatura;

    }
}
