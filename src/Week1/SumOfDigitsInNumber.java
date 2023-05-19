package Week1;

import java.util.Scanner;

public class SumOfDigitsInNumber {
    public static void main(String[] args) {
        int number, tempNumber, basNumber =0, basValue=0, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        tempNumber = number;
        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;
        while(tempNumber != 0){
            basValue = tempNumber % 10;
            result += basValue;
            tempNumber/=10;
        }

        System.out.println("Your number is: " + number);
        System.out.print("Sum of digits in your number is: " + result);
    }
}
