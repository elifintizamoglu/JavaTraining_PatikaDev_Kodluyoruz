package Week1;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int number, firstNum = 0, secondNum = 1, result;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        System.out.print(firstNum + " " + secondNum);

        for (int i = 2; i < number; i++) {
            result = secondNum + firstNum;
            System.out.print(" " + result);
            firstNum = secondNum;
            secondNum = result;
        }
    }
}
