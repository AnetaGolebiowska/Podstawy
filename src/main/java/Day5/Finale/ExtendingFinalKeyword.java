package Dzien4.Finale;

public final class ExtendingFinalKeyword extends FinaleKeyword{
// żadna inna klasa nie może rozszerzać funkcjonalności tej klasy

    public ExtendingFinalKeyword(int someNumber) {
        super(someNumber);
    }

//    Nie można zrobić drugiej takiej samej metody w klasie dziedziczącej
    // ponieważ metoda w klasie bazowej jest Finale
}
