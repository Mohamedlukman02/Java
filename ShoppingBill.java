package com.java.basic;

import java.util.Scanner;

public class ShoppingBill {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Price 1: ");
        double p1 = sc.nextDouble();

        System.out.print("Enter Price 2: ");
        double p2 = sc.nextDouble();

        System.out.print("Enter Price 3: ");
        double p3 = sc.nextDouble();

        double total = p1 + p2 + p3;
        double discount = total * 10 / 100;
        double gst = (total - discount) * 18 / 100;
        double amount = (total - discount) + gst;

        System.out.println("Final Amount = " + amount);
    }
}
