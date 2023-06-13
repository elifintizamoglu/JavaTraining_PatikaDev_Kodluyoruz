package Week2;

import java.util.Arrays;
import java.util.Scanner;

public class Hw_FindNearestMinMaxInArray {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 155, -2, -33};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        int closestMin = 0;
        int closestMax = 0;

        for (int i : list) {
            if (i < number && closestMin < i) {
                closestMin = i;
            }
        }
        for (int i : list) {
            if (i > number) {
                closestMax = i;
                break;
            }
        }

        System.out.println("Closest min value: " + closestMin);
        System.out.println("Closest max value: " + closestMax);
    }
}
