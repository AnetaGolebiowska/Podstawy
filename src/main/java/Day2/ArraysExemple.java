package Day2;

import java.util.Arrays;

public class ArraysExemple {

    public static void main(String[] args) {
        int[] tabBed = new int[5];
        int[] tab = new int[5];
        tab[0] = 1;
        tab[1] = 2;
        tab[2] = 3;
        tab[3] = 4;
        tab[4] = 5;

        int[] anotherTable = new int[]{2, 4, 6, 8, 10};
        System.out.println(printPreatyArray(anotherTable));
        System.out.println(Arrays.toString(anotherTable));
    }

    public static void printElementOfarray(int[] tab) {
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }
    }

    public static void printElementOfarrayForEach(int[] tab) {
        for (int element : tab) {
            System.out.println(element);
        }
    }

    public static String printPreatyArray(int[] tab) {
        String result = "[  ";
        int counter = 1;
        for (int element : tab) {
            result = result + element;
            if (counter < tab.length - 1) ;
            return result + (",");

               }


        return result + " ]";
    }

    public static int[] minAndMaxValue(int[] tab) {
        int min = tab[0];
        int max = tab[0];
        for (int element : tab) {
            if (min > element) ;
            {
                min = element;
            }
            if (max < element) {
                max = element;
            }
        }
        return tab;
    }
}


