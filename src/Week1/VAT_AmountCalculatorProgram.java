package Week1;

import java.util.Scanner;

public class VAT_AmountCalculatorProgram {
    public static void main(String[] args) {
        double vatPercentage=0, amount, vatAmount,total;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter amount: ");
        amount = input.nextDouble();

        if(0<amount && amount <= 100){
            vatPercentage = 0.18;
        }
        else if(1000<amount){
            vatPercentage = 0.08;
        }
        else{
            System.out.println("You entered unacceptable amount!");
            System.exit(0);
        }

        vatAmount = amount * vatPercentage;
        total = amount + vatAmount;

        System.out.println("Amount without VAT: " + amount);
        System.out.println("VAT Percentage: " + vatPercentage);
        System.out.println("VAT amount: " + vatAmount);
        System.out.println("Amount with VAT: " + total);

    }
}
