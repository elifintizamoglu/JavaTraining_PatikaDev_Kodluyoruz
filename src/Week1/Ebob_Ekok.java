package Week1;

import java.util.Scanner;

public class Ebob_Ekok {
    public static void main(String[] args) {
        int num1, num2, smallest, biggest, ebob = 1, ekok, i=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = input.nextInt();

        System.out.print("Enter second number: ");
        num2 = input.nextInt();

        if (num1 >= num2) {
            smallest = num2;
            biggest = num1;
        } else {
            smallest = num1;
            biggest = num2;
        }

        //birim maliyeti=18 döngü
        /*
        for (int i = 1; i <= smallest; i++) {
            if (smallest % i == 0 && biggest % i == 0) {
                System.out.print(i);
                ebob = i;
            }
        }
         */

        //birim maliyeti=14 döngü
        //ebob
        for (int k = smallest; k >= 1; k--) {
            if (smallest % k == 0 && biggest % k == 0) {
                ebob = k;
                System.out.println("Ebob: " + ebob);
                break;
            }
        }

        //ekok
        for (int m = 1; m <= (smallest * biggest); m++) {
            if (m % smallest == 0 && m % biggest == 0) {
                ekok = m;
                System.out.println("Ekok: " + ekok);
                break;
            }
        }

        System.out.println("=============");
        //Ebob - Ekok with While
        while(i<=smallest){
            if (smallest % i == 0 && biggest % i == 0) {
                ebob = i;
            }
            i++;
        }
        ekok = (smallest * biggest)/ebob;
        System.out.println("Ebob: " + ebob);
        System.out.println("Ekok: " + ekok);
    }
}
