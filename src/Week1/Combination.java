package Week1;

import java.util.Scanner;

public class Combination {
    public static void main(String[] args) {
        int n, r, i, subtraction, nFac = 1, rFac=1, subFac=1, comb;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements of the set (n): ");
        n = input.nextInt();

        System.out.print("Enter the number to create a combination (r): ");
        r = input.nextInt();

        if(n<r){
            System.out.print("You entered wrong numbers! R can not be greater than n.");
            System.exit(0);
        }

        subtraction = n-r;

        for(i=1;i<=n;i++){
            nFac *= i;
        }
        for(i=1;i<=r;i++){
            rFac *= i;
        }
        for(i=1;i<=subtraction;i++){
            subFac *= i;
        }
        comb = nFac / (rFac * subFac);
        System.out.println("Combination of (" + n + "," + r + "): " + comb);
    }
}
