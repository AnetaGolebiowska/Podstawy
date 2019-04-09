package Day2;

public class ApplicationUtils {

    public static double convertToDouble(String text) {
        return Double.parseDouble(text);

    }

    public static Double convertToDoubleObject(String text) {
        if (text == null) {
            return null;
        }
        return Double.parseDouble(text); // typ prosty opakowany jest typem obiektowym, dlatego duże Double działa
    }
}
