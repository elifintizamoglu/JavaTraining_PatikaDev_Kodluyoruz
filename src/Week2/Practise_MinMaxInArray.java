package Week2;

public class Practise_MinMaxInArray {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 155, -2, -33};

        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }

        System.out.println("Minimum Değer " + min);
        System.out.println("Maximum Değer " + max);
    }
}
