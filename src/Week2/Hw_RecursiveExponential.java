package Week2;
import java.util.Scanner;
public class Hw_RecursiveExponential {
    static int exponential(int base, int exponent){

        //If exponent is 0 result will be always 0.
        //Otherwise function will call itself with one less exponent number until exponent number became 1.
        //Example: for base 2 exponent 3
        //base 2 exponent 3 = (base 2 exponent 2) * 2
        //base 2 exponent 2 = (base 2 exponent 1) * 2
        //base 2 exponent 1 = (base 2 exponent 0) * 2
        //base 2 exponent 0 = return 1

        if(exponent == 0){
            return 1;
        }
        else{
            return exponential(base,exponent-1) * base;
        }

    }

    public static void main(String[] args) {
        //Variable declarations
        int base, exponent, result;

        //Take base and exponent number from user
        Scanner input = new Scanner(System.in);
        System.out.print("Enter base number: ");
        base = input.nextInt();
        System.out.print("Enter exponent number: ");
        exponent = input.nextInt();

        //Send base and exponent to the exponential function.
        result = exponential(base, exponent);
        System.out.println("Result: " + result);
    }
}
