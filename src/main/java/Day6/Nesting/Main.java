package Zadanka.Nesting;

public class Main {
    public static void main (String[] args ){
        ParentClass parentClass = new ParentClass();
     //   PrivateNestedClass // nie ma dostępu, nie jest widoczne
        ParentClass.PublicNestedClass publicNestedClass; // możemy zadeklarować zmienną o danym typie
//        publicNestedClass = new ParentClass.PublicStaticNestedClass(); // nie można utworzyć nowego obiektu nigdzie poza klasą rodzica
        publicNestedClass = parentClass.returnsNestedClass(); // zwracanie obiektu tej klasy przez rodzica
        ParentClass.PublicStaticNestedClass publicStaticNestedClass = new ParentClass.PublicStaticNestedClass();
        // możemy deklarować pola oraz tworzyć obiekty tej klasy

        ExampleInterface exampleInretface = new ExampleInterface() {
            // klasa anonimowa, dzięki której możemy utworzyć obiekt danego interfejsu/klasy abatrkacyjne bez tworzenia osobnej klasy

            @Override
            // musimy zaimplementować wszystkie metody abstrakcyjne
            public void fun() {
                System.out.println("Implementacja metody abstrakcyjnej");
            }
        };
        exampleInretface.fun(); //wywołanie metody na obiekcie utworzonym za pomocą klasy anonimowej

        }
    }

