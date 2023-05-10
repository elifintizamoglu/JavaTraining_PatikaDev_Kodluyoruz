package Week1;

import java.util.Scanner;

public class ExponentialNumber {
    public static void main(String[] args) {
        int n, r, total = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a base number: ");
        n = input.nextInt();
        System.out.print("Enter the exponent of the number: ");
        r = input.nextInt();

        for (int i = 1; i <= r; i++) {
            total *= n;
        }
        System.out.println("Exponential: " + total);
    }
}
