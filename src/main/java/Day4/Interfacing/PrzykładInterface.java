package Day4.Interfacing;

public interface PrzykładInterface {

    public static final int number = 5;

    public void fun ();

    public default void fun2 (){
        System.out.println("coś");
    }

}
