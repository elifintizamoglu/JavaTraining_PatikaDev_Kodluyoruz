package Week2;
import java.util.Scanner;

public class Hw_RecursivePrimeNumber {
    static boolean isPrime(int number,int divisor){
        if(number <=2)  //Numbers less than 2 is not a prime number
            return number == 2;  // If number is 2, it is prime number.

        if(number % divisor == 0) // If number is divided to divisor, it is not a prime number.
            return false;

        if(divisor * divisor > number) // If number is less than the square of divisor, it is a prime number.
            return true;

        return isPrime(number,divisor+1); // Add 1 to divisor and call the function again.
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        if (isPrime(number, 2))
            System.out.println("Yes it's a prime number!");
        else
            System.out.println("Not a prime number!");
    }
}
