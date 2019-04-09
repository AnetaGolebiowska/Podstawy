package Day7.Zadanie2;

public abstract class Building {
    private  final int numberOfFloors;

    public Building(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    public final int getNumberOfFloors() { //final oznacza, że ie możemy go zmienić
        return numberOfFloors;
    }
    public abstract BuildingType getBuildingType();
}

