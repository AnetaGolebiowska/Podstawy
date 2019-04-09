package Day8.Zadanie3;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        // utworzenie nowego obiektu QuickList, który przyjmuje listy całkowite
        QuickList<Integer> integerQuickList = new QuickList<>(2, 5, 6);
        List<Integer> numbers = integerQuickList.toList(); // pobieramy listę wcześniej przygotowanych elementów
        System.out.println(numbers);

        System.out.println(new QuickList<>(2, 9, 8 ).toList());

        // sktócony zapis tego, co powyżej
    }
}
