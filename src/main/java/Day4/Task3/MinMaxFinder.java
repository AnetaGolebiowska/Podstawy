package Task3;

public class MinMaxFinder {
    private int[] numbers;

    public MinMaxFinder(int[] numbers) {
        this.numbers = numbers;
    }

    public void printTwoSmallAdnTwoLargest() {
        if (numbers.length < 2) {

            System.out.println("Tablica musi mieć co najmniej 2 elementy");
        } else {

            int min1 = numbers[0];
            int min2 = numbers[1];
            int max1 = numbers[0];
            int max2 = numbers[1];

            for (int i = 1; i < numbers.length; i++) {

                if (min1 > numbers[i]) {
                    min2 = min1; // ważne, żeby przypisanie było przed porównaniem
                    min1 = numbers[i];
                } else if (min2 > numbers[i]) {
                    min2 = numbers[i];
                }
                if (max1 < numbers[i]) {
                    max2 = max1;
                    max1 = numbers[i];
                } else if (max2 < numbers[i]) {
                    max2 = numbers[i];
                }

            }
            System.out.println("Najmniejsza wartość " + min1);
            System.out.println("Druga najmniejsza wartość " + min2);
            System.out.println("Największa wartość " + max1);
            System.out.println("Druga największa wartość " + max2);
        }
    }
}
