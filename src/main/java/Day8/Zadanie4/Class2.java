package Day8.Zadanie4;

public class Class2 implements Runnable {

    @Override
    public void run() {
        for (int i = 50; i > 0; i--) {
            if ( (i%2 != 0))
            while (true) {
                System.out.println(i);
                try {
                    Thread.sleep(250);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        }
    }
}