package Day7.Zadanie1;

public interface Predator {
    void hunt ();
    // wszystkie metody w interfejsie są abstrakcyjne, dlatego po () jest od razu średnik

    default void kill (){
        System.out.println("Poluję jak drapieżnik");
    }
}
