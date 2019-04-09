package Classes;

public class Cake {
    private float flourInKg;
    private float waterInL;
    private int numberOfEggs;

    public Cake(float flourInKg, float waterInL, int numberOfEggs) {
        this.flourInKg = flourInKg;
        this.waterInL = waterInL;
        this.numberOfEggs = numberOfEggs;
    }
    public boolean isTasty (){
        if (moreFlourThanWater(flourInKg, waterInL)){
            return false;
        }
        else if (numberOfEggs()){
            return true;
        }
        else {
            return true;
        }
    }

    private boolean numberOfEggs() {
        return numberOfEggs < 0 || numberOfEggs >= 12;
    }

    private boolean moreFlourThanWater(float flourInKg, float waterInL) {
        return flourInKg > waterInL;
    }
}
