package Week2;

public class Hw_HarmonicAverage {
    public static void main(String[] args) {

        // Program to calculate harmonic mean of numbers in array

        int[] arr = {1, 2, 3, 4, 5};
        double result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += (1.0 / arr[i]);
        }
        System.out.println(result);
    }
}
