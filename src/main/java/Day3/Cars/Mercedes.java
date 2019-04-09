package Cars;

public class Mercedes extends Car {

    private boolean sportVersion;

    public Mercedes(float capacity, int numberOfDoors, String color, boolean sportVersion) {

        super(capacity, numberOfDoors, color);
        this.sportVersion = sportVersion;


    }
    public boolean isSportVersion () {
        return sportVersion;
    }

        @Override
        public void ride(){
            if (isEngineStarted()){
                System.out.println("Jadę bardzo szybko");
            } else {
                System.out.println("Nie jadę");
            }
            Car samochódTypuMercedes = new Mercedes(2.0f, 4, "Brown", true);
            Car samochódTypuVw = new Volkswagen(1, 4, "White");

            samochódTypuMercedes.ride();
            samochódTypuMercedes.startEngine();
            samochódTypuMercedes.ride();
            System.out.println(((Mercedes) samochódTypuMercedes).isSportVersion());

                    }

    }

    //  parametry pobrane z klasy, z której jest dziedziczenie, możeby dodawać nowe parametry


    // możemy zdecydować, czy mercedesy zawsze będą miały 4 drzwy, i zamiast
    // number ofdoors, wpisujemy 4



