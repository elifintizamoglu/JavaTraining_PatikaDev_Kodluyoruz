package Week2;
import java.util.Scanner;

public class Hw_MakeSequence {
    static int sequence(int number, int tempNumber, int stop){

        // tempNumber will be the changing value
        // number variable will be used while decreasing the number
        // stop variable will be used while increasing the number

        // Example: if user enters 5, number=5, tempNumber=5, stop=5
        // It will go into first if condition and write 5 to screen.
        // new values will be number=0, tempNumber=0, stop=5
        // then it will go into second if condition and write 0 to screen.
        // new values will be number=0, tempNumber=5, stop=5
        // again goes into second if condition and write 5 to the screen.

        if(number>0){
            System.out.print(number + " ");
            return sequence(number-5,tempNumber-5,stop);
        }
        if(tempNumber<=stop){
            System.out.print(tempNumber + " ");
            return sequence(number,tempNumber+5,stop);
        }
        return stop;
    }
    public static void main(String[] args) {
        int number;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = input.nextInt();
        sequence(number,number,number);  //Takes a number from user and send it to function.
    }


}
