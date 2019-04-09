package Enums;

public enum Kolor {
    RED(3),
    WHITE(123),
    BLACK(888);

    private int number;

   private Kolor(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public Kolor getKolor(int number) {
        for (Kolor kolor : Kolor.values()) { // bierzemy wszystkie doatępne kolory, jezli tak, zwracamy ten kolor
            if (kolor.number == number) {
//                if (kolor.getNumber == number) {  - nie musimy przez get, bo znajduje się w klasi
                return kolor;
            }

        }
        return WHITE;
    }
}
