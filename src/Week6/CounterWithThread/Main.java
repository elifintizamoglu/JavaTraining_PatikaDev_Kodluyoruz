package Week6.CounterWithThread;

public class Main {
    public static void main(String[] args) {
        CounterWithThread c1 = new CounterWithThread();
        CounterWithThread c2 = new CounterWithThread();

        c1.start();
        c2.start();
    }
}
