package Week6;

import java.util.ArrayList;
import java.util.List;

public class Hw_ThreadRace implements Runnable {

    private List<Integer> list;
    private static List<Integer> evenNumbers=new ArrayList<>();
    private static List<Integer> oddNumbers= new ArrayList<>();
    private final Object LOCK = new Object();

    public Hw_ThreadRace(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        for (int number : this.list) {
            if (number % 2 == 0) {
                synchronized (LOCK){
                    this.evenNumbers.add(number);
                }
            } else {
                synchronized (LOCK){
                    this.oddNumbers.add(number);
                }

            }
        }
        printEvenNumber();
        printOddNumber();
    }

    public void printEvenNumber() {
        System.out.println("Even Numbers: ");
        for (int number : evenNumbers) {
            System.out.println(Thread.currentThread().getName() + " : " + number + " ");
        }
    }

    public void printOddNumber() {
        System.out.println("Odd numbers: ");
        for (int number : oddNumbers) {
            System.out.println(Thread.currentThread().getName() + " : " + number + " ");
        }
    }
}

class MainThreadRace {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; i++) {
            list.add(i);
        }

        /*List<Thread> threads = new ArrayList<>();
        for (int i = 0; i <= 100; i += 25) {
            Thread t = new Thread(new Hw_ThreadRace(list.subList(i, i += 25)));
            threads.add(t);
            t.start();
        }*/

        List<Integer> subList1 = list.subList(0, 25);
        List<Integer> subList2 = list.subList(25, 50);
        List<Integer> subList3 = list.subList(50, 75);
        List<Integer> subList4 = list.subList(75, 100);

        Thread t1 = new Thread(new Hw_ThreadRace(subList1));
        Thread t2 = new Thread(new Hw_ThreadRace(subList2));
        Thread t3 = new Thread(new Hw_ThreadRace(subList3));
        Thread t4 = new Thread(new Hw_ThreadRace(subList4));

        t1.start();
        t2.start();
        t3.start();
        t4.start();


        /*System.out.println("Odd numbers: ");
        for (int odd : Hw_ThreadRace.oddNumbers) {
            System.out.print(odd + " ");
        }

        System.out.println("Even numbers: ");
        for (int even : Hw_ThreadRace.evenNumbers) {
            System.out.print(even + " ");
        }
*/
    }
}
