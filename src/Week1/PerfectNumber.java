package Week1;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        int number, result = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it is perfect number: ");
        number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                result += i;
            }
        }
        if(number == result){
            System.out.println(number + " is perfect number.");
        }
        else{
            System.out.println(number + " is NOT a perfect number.");
        }

    }
}
