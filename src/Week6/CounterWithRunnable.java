package Week6;

public class CounterWithRunnable implements Runnable {
    private String name;

    public CounterWithRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(this.getName() + " sayacı başladı.");
        for (int i = 0; i < 100; i++) {
            System.out.println(this.getName() + " : " + i);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Main2{
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
