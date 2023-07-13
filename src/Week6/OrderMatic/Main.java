package Week6.OrderMatic;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderMatic oMatic = new OrderMatic();

        List<Thread> islemler = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Thread t = new Thread(oMatic);
            islemler.add(t);
            t.start();
        }


        /*Thread t1 = new Thread(oMatic);
        t1.start();
        t1.join(); //join diyerek bekletebiliyoruz.

        Thread t2 = new Thread(oMatic);
        t2.start();
        t2.join();*/


    }
}
