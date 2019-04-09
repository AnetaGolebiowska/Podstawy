package Day8.Threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class ExtendingThread extends Thread {

    private CyclicBarrier cyclicBarrier;

    public ExtendingThread(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }

    @Override
    public void run() {
        int i = 0;

        while (true) {
            i++;
            System.out.println("Ping" + i);
            try {
                if (i > 50) {
                    cyclicBarrier.await();
                }
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (BrokenBarrierException e) {
                e.printStackTrace();
            }
        }
    }
}
