package com.bridgeLabz.lineComparison;

import java.util.Scanner;
import java.lang.Math;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Enter the Co-ordinates of first line....");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value of x1 : ");
        int x1 = sc.nextInt();

        System.out.println("Enter value of y1 : ");
        int y1 = sc.nextInt();

        System.out.println("Enter value of x2 : ");
        int x2 = sc.nextInt();

        System.out.println("Enter value of y2 : ");
        int y2 = sc.nextInt();

        System.out.println("Enter the Co-ordinates of Second line....");

        System.out.println("Enter value of x3 : ");
        int x3 = sc.nextInt();

        System.out.println("Enter value of y3 : ");
        int y3 = sc.nextInt();

        System.out.println("Enter value of x4 : ");
        int x4 = sc.nextInt();

        System.out.println("Enter value of y4 : ");
        int y4 = sc.nextInt();

        double l1 = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
        double l2 = Math.sqrt((x4 - x3)*(x4 - x3) + (y4 - y3)*(y4 - y3));

        System.out.println("Length of line is : " + l1);
        System.out.println("Length of line is : " + l2);

        equal(l1,l2); // Checking lines for equal length
    }

    static void equal(double l1, double l2) {
        if (l1 == l2) {
            System.out.println("Line 1 is equal to line 2");
        } else {
            System.out.println("Line 1 is not equal to line 2");
        }
    }
}
