package Day8.Threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

public class Main {

    private static Object threadBlocker = new Object();

    public static void main(String[] args) {

        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);   // sprawdzanie, czy dany wątek się zakończył
        // utworzenie bariery współdzielonej między wątkami

        Thread threadOne = new ExtendingThread(cyclicBarrier); // przygotowanie nowego wątku
        threadOne.start(); // uruchomienie nowego wątku

        ImplementingRunnable threadTwo = new ImplementingRunnable(cyclicBarrier);
        new Thread(threadTwo).start(); // uruchominie nowego wątku

        CountDownLatch countDownLatch = new CountDownLatch(2); // - w nawiasie liczba wątków
        countDownLatch.countDown();
//        countDownLatch.await(); // zatrzymuje wątek do momentu aż countDoun nie osiągnie zera

        List<String> list = new ArrayList<>();
        synchronized (threadBlocker){
            list.add("QQQ"); // newralgiczne operacje powinny być wewnątrz bloku synchronized
        }
    }
    public synchronized void fun (){ // ta metoda może być wywołana tylko przez jeden wąrek na raz
        // Nie decydujemy, który, ten, który pierwszy na nią trafi

    }
}
