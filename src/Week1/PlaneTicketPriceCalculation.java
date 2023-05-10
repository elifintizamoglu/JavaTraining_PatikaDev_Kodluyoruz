package Week1;
import java.util.Scanner;
public class PlaneTicketPriceCalculation {
    public static void main(String[] args) {
        int distance, age, flightType;
        double pricePerKm = 0.10, flightPrice, ageDiscount = 0, firstDiscountedPrice, secondDiscountedPrice;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter distance (km): ");
        distance = input.nextInt();

        System.out.print("Enter your age: ");
        age = input.nextInt();

        System.out.print("Enter flight type (1 => One Way, 2 => Round Trip): ");
        flightType = input.nextInt();

        if((distance<= 0 ) || (age <= 0 )){
            System.out.print("You entered wrong information!");
            System.exit(0);
        }

        flightPrice = distance * pricePerKm;
        if(age<12){
            ageDiscount = flightPrice * 0.50;
        } else if (age <=24) {
            ageDiscount = flightPrice * 0.10;
        } else if (65 <= age) {
            ageDiscount = flightPrice * 0.30;
        }

        firstDiscountedPrice = flightPrice - ageDiscount;

        if(flightType==1){
            System.out.print("Total is " + firstDiscountedPrice);
        }
        else if (flightType == 2){
            secondDiscountedPrice = firstDiscountedPrice * 0.20;
            System.out.print("Total is " + ((firstDiscountedPrice-secondDiscountedPrice)*2));
        }
        else {
            System.out.print("You entered wrong information!");
            System.exit(0);
        }
    }
}
