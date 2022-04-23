package com.company;

import java.util.Scanner;

public class Guessgamelauncher {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number of rows");
        int rows = sc.nextInt();
    }

    public static void printPattern(int num) {
        int spaces = num;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
        }
        spaces = num;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= spaces; j++) {
                System.out.print("* ");
            }
            System.out.println();
            spaces--;
        }
    }

    public static void pattern1(int num) {
        int numOfElements = num;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= numOfElements; j++) {
                System.out.print("* ");
            }
            System.out.println();
            numOfElements--;
        }
    }

    public static void triangleStar(int num) {
        int space = num;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            space--;
            System.out.println();
        }
    }

    public static void pascalPattern(int num) {
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = num - 1; i > 0; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void sanddGlass(int num) {
        int numberOfElements = num;
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= numberOfElements; j++) {
                System.out.print("* ");
            }
            numberOfElements--;
            System.out.print('\n');
        }
        for (int i = 1; i <= num; i++) {
            for (int j = i; j <= num; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void starTriangle1(int num) {
        for (int i = 1; i <= num; i++){
            for (int j = i; j < num; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++){
                if (j == 1 || j == (i * 2)-1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        int num1 = num - 1;
        for (int i = num1; i >= 1; i--){
            for (int j = i; j <= num1; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= (i * 2) - 1; j++){
                if (j == 1 || j == (i * 2) - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

