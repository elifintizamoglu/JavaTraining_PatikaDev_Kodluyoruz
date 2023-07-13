package Week6.CounterWithThread;

public class CounterWithThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
}

