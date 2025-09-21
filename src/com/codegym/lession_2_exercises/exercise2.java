package com.codegym.lession_2_exercises;

import java.util.Scanner;

public class exercise2 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the amount of money: ");
        double money = sc.nextDouble();
        System.out.print("Enter the number of months of deposit: ");
        int months = sc.nextInt();
        System.out.print("Enter bank interest: ");
        double interest = sc.nextDouble();
        double result = 0;
        for (int i = 0; i < months; i++){
            result += money * (interest/100) / 12 * months;
        }
       System.out.printf("Total amount available at the end of %d months is %.1f%n",
                  months, result);
       
        sc.close();
    }

}
