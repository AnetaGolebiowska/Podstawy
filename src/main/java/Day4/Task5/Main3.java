package Task5;

public class Main3 {
    public static void main(String[] args) {

        Apple apple = new Apple();
        Cherry cherry = new Cherry();
        Pear pear = new Pear();
        Friut applefriut = new Apple();
        Friut cherryfriut = new Cherry();
        Friut pearfriut = new Pear();

        Friut[] friuts = {apple, cherry, pear, applefriut, cherryfriut, pearfriut};
        for (Friut  temporaryFriut : friuts) {
            System.out.println(temporaryFriut.colour() + " ");
            System.out.println(temporaryFriut.size() + " ");
            System.out.println(temporaryFriut.taste() + " ");
            System.out.println();
        }

    }
}
