package com.codegym.lession_2_exercises;

import java.util.Scanner;

public class exercise5 {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("-----Menu-----");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.print("Please select the function: ");
            int choice = sc.nextInt();

            if (choice < 1) {
                System.out.println("the function does not exist");
                continue;
            }

            switch (choice) {
                case 1:
                    while (true) {
                        System.out.print("Please enter the height of the rectangle: ");
                        int height = sc.nextInt();
                        System.out.print("Please enter the width of the rectangle: ");
                        int width = sc.nextInt();

                        if (height < 1 || width < 1) {
                            System.out.println("Please enter dimensions greater than 0");
                            continue;
                        }

                        String[] rectangle = buildRectangle(height, width);
                        // In từng dòng (KHÔNG dùng System.out.println(rectangle))
                        for (String line : rectangle) {
                            System.out.println(line);
                        }
                        break;
                    }
                    break;

                case 2:
                   while (true) {
                    System.out.print("Please enter the size of the square triangle: ");
                     int n = sc.nextInt();
                      if (n < 1) {
                            System.out.println("Please enter dimensions greater than 0");
                            continue;
                        }
                        String[] triangle = buildTriangle(n);
                        for (String line: triangle) {
                            System.out.println(line);
                            
                        }
                        break;
                   }
                    break;

                case 3:
                while (true) {
                    System.out.print("Please enter the size of the  isosceles triangle: ");
                     int n = sc.nextInt();
                      if (n < 1) {
                            System.out.println("Please enter dimensions greater than 0");
                            continue;
                        }
                        String []  isoscelesTriangle = buildIsoscelesTriangle(n);
                        for (String line : isoscelesTriangle) {
                            System.out.println(line);
                        }
                        break;
                    }
                    break;

                case 4:
                    System.exit(0); // exit code 0 => normal exit
                    break;

                default:
                    System.out.println("This feature does not exist.");
            }
        }
    }

    // Trả về mảng các dòng của rectangle
    public static String[] buildRectangle(int rows, int cols) {
        String[] rectangle = new String[rows];

        // Tạo một dòng chứa 'cols' dấu '*' cách nhau bởi một khoảng trắng
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < cols; j++) {
            if (j > 0) sb.append(" ");
            sb.append("*");
        }
        String line = sb.toString();

        // Gán cùng một dòng cho mỗi hàng
        for (int i = 0; i < rows; i++) {
            rectangle[i] = line;
        }
        return rectangle;
    }

    public static String[] buildTriangle(int size){
        String[] triangle = new String[size];
      for (int i = 0; i < size; i ++){
        triangle[i] = "* ".repeat(i + 1).trim();

      }
      return triangle;
    }

    public static String[] buildIsoscelesTriangle (int size){
        String[] isoscelesTriangle = new String[size];
        for(int i = 0; i < size; i++){
            isoscelesTriangle[i] = "* ".repeat(size-i).trim();
        }
        return isoscelesTriangle;
    }
}
