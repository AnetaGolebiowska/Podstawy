package Day8.Zadanie4;

public class Class1 extends Thread {

    @Override
    public void run() {
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
                try {
                    sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}