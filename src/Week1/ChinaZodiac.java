package Week1;
import java.util.Scanner;
public class ChinaZodiac {
    public static void main(String[] args) {
        int birthYear, zodiacIndex;
        String zodiac;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your birth year: ");
        birthYear = input.nextInt();

        zodiacIndex = birthYear % 12;

        zodiac = switch (zodiacIndex) {
            case 0 -> "Maymun";
            case 1 -> "Horoz";
            case 2 -> "Köpek";
            case 3 -> "Domuz";
            case 4 -> "Fare";
            case 5 -> "Öküz";
            case 6 -> "Kaplan";
            case 7 -> "Tavşan";
            case 8 -> "Ejderha";
            case 9 -> "Yılan";
            case 10 -> "At";
            case 11 -> "Koyun";
            default -> "Geçersiz";
        };
        System.out.println("Chine Zodiac: " + zodiac);
    }
}
