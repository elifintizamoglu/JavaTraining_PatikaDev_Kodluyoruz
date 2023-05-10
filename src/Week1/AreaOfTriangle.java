package Week1;

import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args) {
        double a, b, c, u, area;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter first edge:");
        a= input.nextDouble();

        System.out.print("Enter second edge:");
        b= input.nextDouble();

        System.out.print("Enter third edge:");
        c= input.nextDouble();

        u = (a + b + c)/2;
        area = Math.sqrt(u * (u-a) * (u-b) * (u-c));
        System.out.print("Area of the triangle: " + area);
    }
}
