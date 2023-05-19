package Week1;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int number, basNumber = 0, tempNumber, basValue, result = 0, basPow;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        tempNumber = number;

        while (tempNumber != 0) {
            tempNumber /= 10;
            basNumber++;
        }

        tempNumber = number;

        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            basPow =1;
            for(int i=1;i<=basNumber;i++){
                basPow *= basValue;
            }
            result += basPow;
            tempNumber /= 10;
        }

        if(result == number){
            System.out.print(number+ " is armstrong number.");
        }
        else{
            System.out.print(number +" is Not armstrong number");
        }
    }
}
