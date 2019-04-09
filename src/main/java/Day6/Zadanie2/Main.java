package Zadanka.Zadanie2;

public class Main {
    public static void main(String[] args) {
        GradeConverter gradeConverter = new GradeConverter();
        System.out.println(gradeConverter.convert(3));
        System.out.println(gradeConverter.convertSwitch(4));
        System.out.println(gradeConverter.convertSwitch(4));

        for (int i = 0; i < 100; i++) {
            if (i % 12 == 0) {
                break; // całkowicie kończy działanie pętli
            }
            System.out.print(i);
        }
        System.out.println(" ");

        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                continue; // pomija dalsze instrukcje w aktualnym przebiegu pętli
            }
            // skomplikowane instrukcje
            System.out.println(i);
        }
    }
}

