package Dzien4.Finale;

public class FinaleKeyword {

    private final int number = 5;
    private final int anoutherNumber;

    public FinaleKeyword (int someNumber){
        this.anoutherNumber = someNumber;
    }
    public void fun (){
//        number = 4;  - nie może być, ponieważ finale nie można zmienić wartości
    }
    public final void methodThatCanNotBeOverriden (){

    }

}
