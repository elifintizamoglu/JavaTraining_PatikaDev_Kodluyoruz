package Week6.Hw_ThreadRace;

import java.util.ArrayList;
import java.util.List;

public class Hw_ThreadRace implements Runnable {

    private List<Integer> list;
    private static List<Integer> evenNumbers = new ArrayList<>();
    private static List<Integer> oddNumbers = new ArrayList<>();

    public Hw_ThreadRace(List<Integer> list) {
        this.list = list;
    }

    @Override
    public void run() {
        for (Integer number : this.list) {
            if (number % 2 == 0) {
                evenNumbers.add(number);
            } else {
                oddNumbers.add(number);
            }
        }
    }

    public static List<Integer> printEvenNumbers() {
        return evenNumbers;
    }

    public static List<Integer> printOddNumbers() {
        return oddNumbers;
    }
}