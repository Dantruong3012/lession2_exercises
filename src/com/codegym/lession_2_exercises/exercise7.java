package com.codegym.lession_2_exercises;

import java.util.Scanner;

public class exercise7 {
    private static final Scanner sc = new  Scanner(System.in);
    public static void main(String[] args) {
        int n = 2;
        while (n < 100) {
            if (isPrimeNumber(n)) {
                System.out.print(n + " ");
            }
            n ++;
        }
    }
    public static boolean isPrimeNumber(int number){
        if (number < 2) {
           return false; 
        }

        for (int i = 2; i < number; i++){
        if (number % i == 0)
            return false;
    }
    return true;
    }
}
