package Cars;

public class Car {

    private float capacity;
    private int numberOfDoors;
    private String color;
    private boolean manualGear = true;
    private boolean engineStarted;

    public Car(float capacity, int numberOfDoors, String color) {
        this.capacity = capacity;
        this.numberOfDoors = numberOfDoors;
        this.color = color;
    }

    public boolean startEngine (){
        return true;
    }

    public boolean statebeltsFastened(){
        return true;

    } public void  ride (){



    }

    public boolean isEngineStarted() {
        return engineStarted;
    }
}
