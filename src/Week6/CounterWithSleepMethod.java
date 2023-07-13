package Week6;

public class CounterWithSleepMethod implements Runnable {
    private String name;
    private int id;
    private boolean isRun = true;

    public CounterWithSleepMethod(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println(this.name + " çalıştı.");
        while(isRun){
            for (int i = 0; i < 50; i++) {
                try {
                    Thread.sleep(1000L * this.id);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println(this.name + " : " + i);
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void stop(){
        this.isRun = false;
    }
}

class Main3 {
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
