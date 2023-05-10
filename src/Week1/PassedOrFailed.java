package Week1;

import java.util.Scanner;
public class PassedOrFailed {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int math, physic, chemistry, turkish, music,counter = 5;

        System.out.print("Math grade: ");
        math = input.nextInt();
        if(math<=0 || 100<math){
            math=0;
            counter -= 1;
        }

        System.out.print("Physic grade: ");
        physic = input.nextInt();
        if(physic<=0 || 100<physic){
            physic=0;
            counter -= 1;
        }

        System.out.print("Chemistry grade: ");
        chemistry = input.nextInt();
        if(chemistry<=0 || 100<chemistry){
            chemistry=0;
            counter -= 1;
        }

        System.out.print("Turkish grade: ");
        turkish = input.nextInt();
        if(turkish<=0 || 100<turkish){
            turkish=0;
            counter -= 1;
        }

        System.out.print("Music grade: ");
        music = input.nextInt();
        if(music<=0 || 100<music){
            music=0;
            counter -= 1;
        }

        double sum = math + physic + chemistry + turkish + music;
        double average = sum / counter;
        String situation = (average > 55) ? "Passed" : "Failed";

        System.out.println("Average is: " + average + "\n" + situation);
    }
}
