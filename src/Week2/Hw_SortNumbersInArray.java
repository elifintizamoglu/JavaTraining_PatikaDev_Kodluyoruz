package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class Hw_SortNumbersInArray {
    public static void main(String[] args) {

        // Program that sorts the elements in an array from smallest to largest.
        // Takes array length and array elements from user.

        int length, temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter length of the array: ");
        length = input.nextInt();

        int[] arr = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Enter " + (i + 1) + ". value: ");
            arr[i] = input.nextInt();
        }

        // Print it to the screen.
        System.out.println(Arrays.toString(arr));

        // It takes two elements of the array.
        // Finds bigger one and, shifts it to rhe right
        // by using a temp value.
        // temp value keep the value temporary and prevent it's  lost.

        for (int i = 0; i < length; i++) {
            for (int j = i + 1; j < length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
