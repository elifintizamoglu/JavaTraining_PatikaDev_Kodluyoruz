package Week1;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        int n;
        double result=0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of N: ");
        n = input.nextInt();

        for (double i = 1; i <= n; i++) {
            result += (1/i);
        }

        System.out.print(result);
    }
}
