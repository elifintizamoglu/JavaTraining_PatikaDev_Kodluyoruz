package Week1;
import java.util.Scanner;
public class FindSumOfNumbersMultipleOf4 {
    public static void main(String[] args) {
        int number, sum =0;

        Scanner input = new Scanner(System.in);

        do{
            System.out.print("Enter a number: ");
            number = input.nextInt();
            if(number % 4 == 0){
                sum += number;
            }
        }while(number%2==0);

        System.out.print("Sum of numbers that are multiples of 4: " + sum);
    }
}
