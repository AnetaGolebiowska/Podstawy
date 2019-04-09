package Inheritance;

public class Laptop extends Komputer {

    private boolean backLightKeeboard;
    private float screenSize;

    public boolean isBackLightKeeboard() {
        return backLightKeeboard;
    }

    public float getScreenSize() {
        return screenSize;
    }

    public Laptop(String procesorName, int ram, int discSizeInGb, boolean backLightKeeboard, float screenSize) {
        super(procesorName, ram, discSizeInGb);
        this.backLightKeeboard = backLightKeeboard;
        this.screenSize = screenSize;


    }
}
