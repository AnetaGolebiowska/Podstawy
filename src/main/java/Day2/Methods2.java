package Day2;

public class Methods2 {
    public static void main(String[] args) {
        String someText = "8.9";
        System.out.println(Day2.ApplicationUtils.convertToDouble(someText));

        someText = someText + "   "; // Musimy jeszcze raz przypisać, bo nie da się nadać innej wartości zmiennej srringowi
        System.out.println(Day2.ApplicationUtils.convertToDouble(someText));

        someText = null;
        System.out.println(Day2.ApplicationUtils.convertToDoubleObject(someText));

    }
}
