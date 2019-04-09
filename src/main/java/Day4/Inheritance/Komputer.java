package Inheritance;

public class Komputer {
    private String procesorName;
    private int ram;
    private int discSizeInGb;

    public Komputer(String procesorName, int ram, int discSizeInGb) {
        this.procesorName = procesorName;
        this.ram = ram;
        this.discSizeInGb = discSizeInGb;
    }

    public boolean powerOm (){
        if (discSizeInGb > 0) {
            return true;
        }
        else {
            return false;
        }
    }

    public String getProcesorName() {
        return procesorName;
    }

    public int getRam() {
        return ram;
    }

    public int getDiscSizeInGb() {
        return discSizeInGb;
    }
}
