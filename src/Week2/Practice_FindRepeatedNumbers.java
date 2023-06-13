package Week2;


public class Practice_FindRepeatedNumbers {

    // A program that finds repeating even numbers in an array of numbers

    // Check if repeated value is already find and add in copy array
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2, 6, 9, 8, 4, 5, 4, 4, 9, 1, 1, 6};
        int[] copyArr = new int[arr.length];
        int startIndex = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                // If indexes are different, values are same and, it is a multiple of two isFind function is called
                // If copyArr does not contain the value, value is added to copyArr

                if ((i != j) && (arr[i] == arr[j]) && (arr[i] % 2 == 0)) {
                    if (!isFind(copyArr, arr[i])) {
                        copyArr[startIndex++] = arr[i];
                    }
                    break;
                }
            }
        }
        for (int copy : copyArr) {
            if (copy != 0) {
                System.out.print(copy + " ");
            }
        }
    }
}
