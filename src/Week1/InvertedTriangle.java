package Week1;

import java.util.Scanner;

public class InvertedTriangle {
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (int i = number; i > 0; i--) {
            for (int m = number - i; m > 0; m--) {
                System.out.print(" ");
            }
            for (int j = (2 * i) - 1; j > 0; j--) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
