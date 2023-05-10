package Week1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        int numberOne, numberTwo, option;

        Scanner input =new Scanner(System.in);

        System.out.print("Enter first number: ");
        numberOne = input.nextInt();
        System.out.print("Enter second number: ");
        numberTwo = input.nextInt();

        System.out.print("Enter 1 for addition (+)\nEnter 2 for subtraction (-)\nEnter 3 for multiplication (*)\nEnter 4 for division (/)");
        option = input.nextInt();

        switch (option) {
            case 1 -> System.out.print("Addition: " + (numberOne + numberTwo));
            case 2 -> System.out.print("Subtraction: " + (numberOne - numberTwo));
            case 3 -> System.out.print("Multiplication: " + (numberOne * numberTwo));
            case 4 -> {
                if (numberTwo == 0)
                    System.out.print("A number can not be divided to zero (0)!");
                else
                    System.out.print("Division: " + (numberOne / numberTwo));
            }
        }
    }
}
