package com.codegym.lession_2_exercises;

import java.util.Scanner;

public class exercise6 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int count = 0;
        int n = 2;
        System.out.print("Enter the number of integers to print: ");
        int numbersOfInteger = sc.nextInt();
        while (count<numbersOfInteger) {
            if (isPrimeNumber(n)) {
                count++;
                System.out.print(n + " ");
            }
            n++;
        }
    };

    public static boolean isPrimeNumber(int number){
        if (number < 2) return false;
      for ( int i = 2; i <= Math.sqrt(number); i++){
        if (number % i == 0) {
            return false;
        }
      }
      return true;
    }
};
   