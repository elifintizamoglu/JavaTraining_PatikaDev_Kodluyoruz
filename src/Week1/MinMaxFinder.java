package Week1;
import java.util.Scanner;
public class MinMaxFinder {
    public static void main(String[] args) {
        int count, number, biggest=0,smallest=0;
        boolean firstNumber = true;

        Scanner input = new Scanner(System.in);
        System.out.print("How many numbers will you enter?");
        count = input.nextInt();

        for(int i=1;i<=count;i++){
            System.out.print(i+". number: ");
            number = input.nextInt();
            if(firstNumber){
                biggest = number;
                smallest = number;
                firstNumber = false;
            }
            else{
                if(number>=biggest){
                    biggest = number;
                }
                else if(number<=smallest){
                    smallest = number;
                }
            }
        }
        System.out.println("Biggest number: " + biggest);
        System.out.println("Smallest number: " + smallest);

    }
}
