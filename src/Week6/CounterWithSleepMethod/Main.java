package Week6.CounterWithSleepMethod;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new CounterWithSleepMethod("c1", 1));
        t1.start();

        Thread t2 = new Thread(new CounterWithSleepMethod("c2", 2));
        t2.start();

        CounterWithSleepMethod c3= new CounterWithSleepMethod("c3",3);
        Thread t3 = new Thread(c3);
        t3.start();
        Thread.sleep(2000);
        c3.stop();
    }
}
