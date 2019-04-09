package Day8.Threads;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.TimeUnit;

public class ImplementingRunnable implements Runnable {

    private CyclicBarrier cyclicBarrier;

    public ImplementingRunnable(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }



    @Override
    public void run() {
        int i = 0;
        while (true) {
            i++;
            System.out.println("Pong" + i);
            try {
                if (i > 100) {
                    cyclicBarrier.await();
                }
                Thread.sleep(100);
            } catch (InterruptedException | BrokenBarrierException e) { // zapisa taki sam jak w poprzedniej klasie
                e.printStackTrace();
            }
        }
    }
}
