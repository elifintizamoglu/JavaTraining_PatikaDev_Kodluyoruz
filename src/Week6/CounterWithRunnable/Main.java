package Week6.CounterWithRunnable;

public class Main {
    public static void main(String[] args) {
        CounterWithRunnable c1 = new CounterWithRunnable("c1");
        CounterWithRunnable c2 = new CounterWithRunnable("c2");
        CounterWithRunnable c3 = new CounterWithRunnable("c3");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);
        Thread t3 = new Thread(c3);

        t1.start();
        t2.start();
        t3.start();
    }
}
