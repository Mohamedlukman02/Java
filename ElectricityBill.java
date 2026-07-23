package com.java.basic;

import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Units: ");
        double units = sc.nextDouble();

        double bill = units * 8.5;
        double subtotal = bill + 150;
        double tax = subtotal * 5 / 100;
        double total = subtotal + tax;

        System.out.println("Electricity Bill = " + total);
    }
}
