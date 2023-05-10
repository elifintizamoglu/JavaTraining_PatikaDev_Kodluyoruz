package Week1;

import java.util.Scanner;
public class AreaOfCircleSector {
    public static void main(String[] args) {
        int r,a;
        double pi = 3.14, area, circumference;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        r = input.nextInt();

        System.out.print("Enter angle: ");
        a = input.nextInt();

        area = (pi*(r*r)*a)/360;
        System.out.print("Area of the circle's sector: " + area);
    }
}
