package com.java.basic;

import java.util.Scanner;

public class StudentAverageandPercentage {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Mark 1: ");
        double m1 = sc.nextDouble();

        System.out.print("Enter Mark 2: ");
        double m2 = sc.nextDouble();

        System.out.print("Enter Mark 3: ");
        double m3 = sc.nextDouble();

        System.out.print("Enter Mark 4: ");
        double m4 = sc.nextDouble();

        System.out.print("Enter Mark 5: ");
        double m5 = sc.nextDouble();

        double total = m1 + m2 + m3 + m4 + m5;
        double average = total / 5;
        double percentage = total / 5;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Percentage = " + percentage);
    }
}