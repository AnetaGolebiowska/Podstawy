package Task4;

public class Clouth {
    private String type;
    private char size;


    public Clouth(String type, char size) {
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return type;
    }

    public char getSize() {
        return size;
    }

    public void smallTshirt() {
        if (size == 'm') {
            System.out.println("It is normal size");
        } else {
            System.out.println("It is not normal size");
        }

    }
}


