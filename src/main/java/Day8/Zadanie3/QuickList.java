package Day8.Zadanie3;

import java.util.Arrays;
import java.util.List;

public class QuickList<T> {

    private List<T> elements;

    public QuickList(T... elements) {
        this.elements = Arrays.asList(elements);
    }

    public List<T> toList() {
        return elements;
    }
    //Nie możemy skorzystać z typu generycznego przez metody statyczne,
    // ponieważ podany typ jest znany dopiero podczas tworzenia nowego obiektu


}

