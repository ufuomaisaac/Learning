package com.company;

import java.util.Scanner;

public class DrumKit {
    public static void main(String[] args) {
        System.out.println("enter number to check");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int result = checkArmstrong1(num);
        if( result == num){
            System.out.println(num + " is an armstrong number ");
        } else{
            System.out.println(num + " is not an armstrong number ");
        }
    }
    public static int checkArmstrong(int num){
        int n = 0;
        int num1 = num;
        int remainder;
        int powern = 1;
        int result = 0;
        while(num > 0){
            num = num / 10;
            n++;
        }
        while(num1 > 0) {
            remainder = num1 % 10;
            num1 = num1 / 10;
            int i;
            for (i = 1; i <= n ; i++) {
                powern = powern * remainder;
            }
            result = result + powern;
            powern = 1;
            i = 1;
        }
        return result;
    }

    private static int checkArmstrong1(int num) {
        String number = String.valueOf(num);
        int toReturn = 0;

        for (int i = 0; i < number.length(); i++) {
            int currentDigit = Integer.parseInt(String.valueOf(number.charAt(i)));
            toReturn += Math.pow(currentDigit, number.length());
        }

        return toReturn;
    }
}
