package Zadanie2;

public class Main {

    public static void main(String[] args) {
        NumberMaping numberMaping = new NumberMaping();
        numberMaping.add(5, "ASD");
        System.out.println(numberMaping.get(5).isPresent());
        System.out.println(numberMaping.get(3 ).isPresent());

    }
}
