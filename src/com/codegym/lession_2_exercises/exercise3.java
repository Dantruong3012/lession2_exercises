package com.codegym.lession_2_exercises;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;;
public class exercise3 {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numbera;
        int numberb;
        while (true) {
             System.out.print("please enter number a: ");
            numbera = sc.nextInt();
            System.out.print("please enter number b: ");
            numberb = sc.nextInt();
            if (numbera<0 || numberb < 0) {
                System.out.println("The number is invaild");
                continue;
            }break;
        }
        int [] commonDivisor = findCommonDivisor(numbera, numberb);
        int greatestCommonDivisor = greatestCommonDivisor(commonDivisor);
    System.out.println("GCD is: " + greatestCommonDivisor);
    }
    public static int greatestCommonDivisor(int[] array){
       int max = array[0];
       for (int i = 1; i < array.length; i++){
        if (max < array[i]) {
            max = array[i];
            
        }
       } return max;
    };

    public static int[] findCommonDivisor (int a, int b){
       int limit = Math.min(a, b);
       List<Integer> divisor = new ArrayList<>();
       for (int i = 1; i <= limit; i ++){
        if  (a % i == 0 && b % i == 0){
            divisor.add(i);
        }
       }

       int[] result = new int[divisor.size()];
       for (int i = 0; i < divisor.size(); i++){
            result[i] = divisor.get(i);
       }
       return result;
    };
}
