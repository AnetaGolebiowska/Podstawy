package Cars;

public class Main3 {
    public static void main(String[] args) {

        Mercedes mercedes = new Mercedes(2.5f, 4, "black", true);
        mercedes.ride ();
        System.out.println(mercedes.startEngine());
        mercedes.ride();
        System.out.println(mercedes.isSportVersion());

        Car syrenka = new Car(3.0f, 4, "Yellow");
        }

    }

