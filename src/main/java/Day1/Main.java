package pl.sda.javastart.Day1;

import java.util.Date;

public class Main {

    public static void main(String[] arg) {

        System.out.println("Hello, world!");



        Date date = new Date();

        System.out.println(date);

        System.out.println("\"ADAM\"");

        // komentarz moze byc tutaj

        System.out.println("Adam \nNowak "); // tu będzie nowa linia

        // literały:

        System.out.println(13);

        System.out.println('a');

        System.out.println("napis");

        System.out.println(true);



        String text = "jakis text";

        String anotherText = new String("inny text");

        int length = text.length(); //pierwszy sposób

        System.out.println(length);

        System.out.println(text.length()); //drugi sposób



        String textWithWhitespaces = " Adam";

        System.out.println(textWithWhitespaces.trim());



        System.out.println("\"a\"+2= " + ("a" + 2));

        System.out.println('a' + 4 + "b");

        System.out.println("a" + 4 + 'b');





        System.out.println(3 == 3 && 3 == 4);

        System.out.println(3 != 5 || 3 == 5);

        System.out.println("(2+4)>(1+3):" + ((2 + 4) > (1 + 3)));

        System.out.println("cos".equals("cos"));//obiekty powinnismy porownywac za pomoca .equals()

        System.out.println("cos" == "cos");//nigdy nie porównujmy obiektów za pomocą ==, tylko typy proste

        System.out.println("cos" == new String("cos"));

    }

}
