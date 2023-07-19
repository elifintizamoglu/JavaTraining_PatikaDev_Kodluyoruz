package Week6.Hw_ThreadRace;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 10000; i++) {
            list.add(i);
        }

        ExecutorService pool = Executors.newFixedThreadPool(4);

        int x, y;
        for (int i = 0; i < 4; i++) {
            x = i * 2500;
            y = x + 2500;
            pool.execute(new Hw_ThreadRace(list.subList(x, y)));
            Thread.sleep(1000);
        }

        pool.shutdown();
        try {
            pool.awaitTermination(5, TimeUnit.SECONDS);
            System.out.println("Threads are completed.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Odd Numbers: " + Hw_ThreadRace.printOddNumbers());
        System.out.println("Even Numbers: " + Hw_ThreadRace.printEvenNumbers());

    }
}
