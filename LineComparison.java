package com.bridgeLabz.lineComparison;

import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;
import java.lang.Math;

public class LineComparison {
    public static void main(String[] args) {
        System.out.println("Enter value of x1 : ");
        Scanner a = new Scanner(System.in);
        int x1 = a.nextInt();

        System.out.println("Enter value of x2 : ");
        Scanner b = new Scanner(System.in);
        int x2 = b.nextInt();

        System.out.println("Enter value of y1 : ");
        Scanner c = new Scanner(System.in);
        int y1 = c.nextInt();

        System.out.println("Enter value of y2 : ");
        Scanner d = new Scanner(System.in);
        int y2 = d.nextInt();

        double li = Math.sqrt((x2 - x1)^2 + (y2 - y1)^2);

        System.out.println("Length of line is : " + li);
    }
}
