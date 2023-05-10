package Week1;
import java.util.Scanner;
public class OfferActivityAccordingToWeather {
    public static void main(String[] args) {
        int heat;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter heat: ");
        heat = input.nextInt();

        if(heat<5){
            System.out.print("You can ski!");
        }
        else if(heat <= 15){
            System.out.print("You can go to cinema!");
        }
        else if(heat <= 25){
            System.out.print("You can go to picnic!");
        }
        else{
            System.out.print("You can swim!");
        }
    }
}
