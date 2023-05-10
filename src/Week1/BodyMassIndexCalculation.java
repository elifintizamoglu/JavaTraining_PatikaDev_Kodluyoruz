package Week1;

import java.util.Scanner;
public class BodyMassIndexCalculation {
    public static void main(String[] args) {
        double height, weight, bodyMassIndex;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height (meter): ");
        height = input.nextDouble();

        System.out.print("Enter your weight: ");
        weight = input.nextDouble();

        bodyMassIndex = weight / (height * height);
        System.out.print("Your body mass index: " + bodyMassIndex);
    }

}

