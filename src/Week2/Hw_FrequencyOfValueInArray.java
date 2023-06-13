package Week2;

import java.util.Arrays;

public class Hw_FrequencyOfValueInArray {

    // Program that finds how many times the elements in the array are repeated (their frequencies).

    // Check if repeated value is already find and added in array2
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 35, 20, 20, 35, 40, 50, 50};
        int[] arr2 = new int[arr.length];
        System.out.println("Array: " + Arrays.toString(arr));
        int counter = 1;
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            if (!isFind(arr2, arr[i])) {  // If value does not exist in arr2, goes into the if block
                for (int j = 0; j < arr.length; j++) {

                    // If indexes are different and, values are same, counter is increased.
                    // That means number is repeated.

                    if ((i != j) && (arr[i] == arr[j])){
                        counter++;
                    }
                }

                // Value is added to arr2 and counter is printed.
                // Then counter set to 1 again for next comparison.

                arr2[startIndex++]=arr[i];
                System.out.println(arr[i] + " repeated " + counter + " times.");
                counter=1;
            }
        }
    }
}
