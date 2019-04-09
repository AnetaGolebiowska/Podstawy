package Day8.Zadanie4;

public class Main {
    public static void main(String[] args) {
        Class1 class1 = new Class1();
        class1.start();

        Class2 class2 = new Class2();
        new Thread(class2).start();

        // szybki sposb na wątki
        new Thread(() -> System.out.println("ping")).start();

        // niżej jest zapisane to, co wyżej

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("pong");
            }
        }).start();
    }
}
