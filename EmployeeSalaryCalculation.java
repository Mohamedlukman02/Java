package com.java.basic;

import java.util.Scanner;

public class EmployeeSalaryCalculation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");
        double basic = sc.nextDouble();

        double hra = basic * 20 / 100;
        double da = basic * 10 / 100;
        double pf = basic * 5 / 100;

        double gross = basic + hra + da;
        double net = gross - pf;

        System.out.println("Gross Salary = " + gross);
        System.out.println("Net Salary = " + net);
    }
}