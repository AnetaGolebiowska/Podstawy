package Cars;

public class Volkswagen extends Car {

    public Volkswagen(float capacity, int numberOfDoors, String color) {
        super(capacity, numberOfDoors, color);
    }

    @Override
    public void ride() {
        startEngine();
        System.out.println("jadę");
    }
}


