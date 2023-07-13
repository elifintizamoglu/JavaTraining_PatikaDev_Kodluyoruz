package Week6.OrderMatic;

import java.util.ArrayList;
import java.util.List;

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
