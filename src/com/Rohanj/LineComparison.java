package com.Rohanj;
import java.util.Scanner;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Welcome to The Line Comparison Computation Program");
        // scanner class to take the input from user

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x1 of First Point: ");
        int x1 = sc.nextInt();
        System.out.print("Enter y1 of First Point: ");
        int y1 = sc.nextInt();
        System.out.print("Enter x2 of Second Point: ");
        int x2 = sc.nextInt();
        System.out.print("Enter y2 of Second Point: ");
        int y2 = sc.nextInt();
        sc.close();

        // calculate the length of line
        double lengthOfLine = Math.sqrt(Math.pow(x2-x1, 2) + Math.pow(y2-y1,2));

        // %.2f %n to print only two digit after point
        System.out.printf("Length of Line is : %.2f %n", lengthOfLine);
    }
}
