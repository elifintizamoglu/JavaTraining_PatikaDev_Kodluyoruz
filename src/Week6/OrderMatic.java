package Week6;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderMatic implements Runnable {
    private int orderNo;
    private final Object LOCK = new Object();

    public OrderMatic() {
        this.orderNo = 0;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // Critical section'ı synchronized ile belirttik ilk yöntem bu
        /*synchronized (LOCK){
            this.orderNo++;
            System.out.println(Thread.currentThread().getName() + " Order No: " + this.orderNo);
        }*/

        // ikinci yöntem - metodu synchronized yapma
        increaseOrder();
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public synchronized void increaseOrder(){
        this.orderNo++;
        System.out.println(Thread.currentThread().getName() + " Order No: " + this.orderNo);
    }
}

class Main4 {
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
