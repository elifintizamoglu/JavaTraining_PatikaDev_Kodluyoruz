package Week6.CounterWithRunnable;

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
