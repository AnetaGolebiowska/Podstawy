package Day2;

public class ForsExample {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            System.out.println("Adam");

        }
        printFewNaturalNumbers(5);
            }

    public static void printFewNaturalNumbers(int max) {

        for (int i = 0; i < max; i++) {
            System.out.println(i);
        }
        System.out.println(sumNaturalsToLimit(1000));
    }

    public static void printFewNumberWhitoutDividableByParam(int max, int param) {
        for (int i = 0; i < max; i++) {
            if (i % param != 0) {
                System.out.println(i);            }
        }
    }
    public static void printFewNumberWhitoutDividableByParamAnouther(int max, int param) {
        for (int i = 0; i < max; i++)
            if (i % param == 0) {
                continue;
            }
        System.out.println();
        }
       public static int sumNaturalsToLimit(int max){ /// powtórzyć
        int sum = 0;
        for (int i = 0; i<max; i++){
            if (sum+i>=max){ // sum + i - dlatego, że dla większeg nie umieszczamy
                break;
            }
            sum = sum + i;
        }
        return sum;
    }
    public static void printNumbersInTower (int param){
        for (int i = 1; i <= param; i++){
            for (int j = 1; j<= i; j++){
                System.out.println(i);
                            }
            System.out.println(); // dosatkowy wiersz
        }
    }
    public static int sumWhile (int max){
        int sum = 0;
        int counter = 0;
        while (sum + counter<=max){
            sum = sum+ ++counter;
        }
        return sum;
    }
    public static int sumDoWhile (int max){
        int sum = 0; int counter = 0;
        do{
            sum = sum + ++counter;
        } while (sum+counter <=max);
        return sum;
        }
        public static void fibonacci (int param){
        int first = 0;
        int second = 1;
        int counter = 1;
        while (counter<= param-2){ // param - 2, dlatego, że chcemy 6 elementów
            int sum = first + second;

            System. out.println(sum);
            first = second;
            second = sum; // sum nie przyjmuje wartości first
            counter ++;
        }
        }
    }




