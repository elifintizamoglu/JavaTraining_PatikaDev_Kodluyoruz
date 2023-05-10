package Week1;

import java.util.Scanner;

public class FindsForcesOf4And5 {
    public static void main(String[] args) {
        int number, i = 1, j = 1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        while (i <= number && j <= number) {
            System.out.println(i + " " + j);
            i *= 4;
            j *= 5;
        }
    }


}
