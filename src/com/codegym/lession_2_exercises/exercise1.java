package com.codegym.lession_2_exercises;

import java.util.Scanner;

public class exercise1 {
    private static final Scanner sc = new   Scanner(System.in);
    public static void main(String[] args) {
      int n = inputNumber();
      System.out.println();
    boolean checking = isPrimeNumber(n);
    if (checking) {
        System.out.println(n + " is a prime number");
    }else {
       System.out.println(n + " is not a prime number"); 
    }
    sc.close();
    }


      
public static int inputNumber(){
      while (true) {
        System.out.print("Please enter number: ");
      int  number = sc.nextInt();
        if (number<2) {
            System.out.print("this number is invaild, enter another!: ");
            continue;
       }return number;
    }
}

    

    public static boolean isPrimeNumber (int number){
      for (int i = 1; i < Math.sqrt(number); i++){
       if (number % i == 0) return false;
      }
      return true;
    }
}





