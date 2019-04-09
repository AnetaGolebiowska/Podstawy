package Day8.GenericClass;

public class GenericClass <T> {
    private T someValue; // T jest stringiem

    public void set (T value){ // podobnie jak setter
        this.someValue = value;
    }
    public T get (){ // podobnie jak getter
        return someValue;
    }
    public String convertToString (T value){
//        return value.toString();
        return String.valueOf(value);    // przekształćenie w Stringa
    }

}
