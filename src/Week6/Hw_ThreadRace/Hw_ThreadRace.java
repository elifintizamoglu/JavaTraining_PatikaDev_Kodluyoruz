package Week6.Hw_ThreadRace;

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