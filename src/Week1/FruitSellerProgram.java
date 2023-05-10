package Week1;

import java.util.Scanner;
public class FruitSellerProgram {
    public static void main(String[] args) {
        double pearPrice = 2.14, applePrice = 3.67, tomatoPrice = 1.11, bananaPrice = 0.95, eggplantPrice = 5;
        double pearKilo, appleKilo, tomatoKilo, bananaKilo, eggplantKilo, total;

        Scanner input = new Scanner(System.in);
        System.out.print("How many kilos of pears?: ");
        pearKilo = input.nextInt();

        System.out.print("How many kilos of apples?: ");
        appleKilo = input.nextInt();

        System.out.print("How many kilos of tomatos?: ");
        tomatoKilo = input.nextInt();

        System.out.print("How many kilos of bananas?: ");
        bananaKilo = input.nextInt();

        System.out.print("How many kilos of eggplants?: ");
        eggplantKilo = input.nextInt();

        total = (pearKilo * pearPrice) + (appleKilo * applePrice) + (tomatoKilo * tomatoPrice) + (bananaKilo * bananaPrice) + (eggplantKilo * eggplantPrice);
        System.out.print("Total price: " + total);
    }
}
