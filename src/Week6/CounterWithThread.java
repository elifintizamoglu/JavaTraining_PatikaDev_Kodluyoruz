package Week6;

public class CounterWithThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());

        for (int i = 0; i < 50; i++) {
            System.out.println(i);
        }
    }
}

class Main {
    public static void main(String[] args) {
        CounterWithThread c1 = new CounterWithThread();
        CounterWithThread c2 = new CounterWithThread();

        c1.start();
        c2.start();
    }
}

