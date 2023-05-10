package Week1;

import java.util.Scanner;

public class DivisibiltyTo3And4 {
    public static void main(String[] args) {
        int number, i, counter = 0 ;
        double average, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();

        for (i = 0; i <= number; i++) {
            if ((number % 3 == 0) && (number % 4 ==0)) {
                sum += number;
                counter++;
            }
        }
        if(counter == 0){
            System.out.print("There is no number that can be divided to 3 and 4");
            System.exit(0);
        }

        average = sum / counter;
        System.out.print("Average of numbers that can be divided to 3 adn 4: " + average);
    }

}
