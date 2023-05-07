import java.util.Scanner;

public class CalculateGradeAverage {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, physic, chemistry, turkish, history, music;

        System.out.print("Math grade: ");
        math= input.nextInt();

        System.out.print("Physic grade: ");
        physic = input.nextInt();

        System.out.print("Chemistry grade: ");
        chemistry = input.nextInt();

        System.out.print("Turkish grade: ");
        turkish = input.nextInt();

        System.out.print("History grade: ");
        history = input.nextInt();

        System.out.print("Music grade: ");
        music = input.nextInt();

        double sum = math + physic + chemistry + turkish + history + music;
        double average = sum / 6;
        String durum = (average > 60) ? "Passed" : "Failed";

        System.out.println("Average is: " + average + "\n" + durum);

    }
}
