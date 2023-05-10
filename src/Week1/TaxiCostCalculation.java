package Week1;

import java.util.Scanner;
public class TaxiCostCalculation {
    public static void main(String[] args) {
        int km;
        double perKm =2.20, total , startPrice = 10;

        System.out.print("Enter distance in terms of KM: ");
        Scanner input = new Scanner(System.in);
        km = input.nextInt();

        total = startPrice + (km * perKm);

        total = (total<20) ? 20 : total;
        System.out.println("You need to pay " + total);
    }
}
