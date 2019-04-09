package Day8.GenericClass;

import Day8.Zadanie1.Person;

public class Main {
    public static void main(String[] args) {

        //Utworzenie nowego obiektu klasy generycznej, gdzie w nawiasie <> podajemy typ
        GenericClass<String> genericClass = new GenericClass<String>();
        genericClass.set("Hello World!");   // tylko String, bo jest podany w nawiasach
        genericClass.get();


        // możemy podać tylko typ, który dziedziczy po klasie Number, np. long
        MoreRestrictGenericClass <Long> genericClass2 = new MoreRestrictGenericClass<Long>();
            double result = genericClass2.add(4L, 6L); // w argumencie metody dopuszczalny jest tylko wcześniej
                                                              // zdefiniwoany typ
        System.out.println(result);


        // przykłady użycia metody generycznej
        GenericMethod genericMethod = new GenericMethod();
        genericMethod.print("ppp");
        genericMethod.print(5);
        genericMethod.print(new Person("aaa", "ppp") {
        });

    }

}
