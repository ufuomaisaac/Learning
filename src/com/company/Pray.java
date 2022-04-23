package com.company;

import java.util.HashMap;
import java.util.*;

public class Pray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range");
        int userInput = sc.nextInt();
        armstrongNumberWithinARange(userInput);
    }
    public static void armstrongNumberWithinARange(int num){

        for (int i = 1; i < num; i++){
            int result = 0;
            String value = String.valueOf(i);
            for (int j = 0; j < value.length(); j++){
                int value1 = Integer.parseInt(String.valueOf(value.charAt(j)));
                result += Math.pow(value1, value.length());
            }
            if (result == i){
                System.out.println(i);
            }
        }
    }
    public static void primeNumbers(int num1, int num2) {
        int counter = 0;
        if (num1 <= 2) {
            System.out.println(2);
            counter++;
        }
        for (int i = num1; i <= num2; i = i + 2) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    break;
                } else if (j == (i - 1) && i % j != 0) {
                    System.out.println(i);
                    counter++;
                }
            }
        }
        System.out.println("There are " + counter + " prime number from " + num1 + " to " + num2);
    }
    public static int[] highestCommonFactor(int num1, int num2){
        int hcf = 1;
        int lcm = 1;
        int smallerNum = Math.min(num1, num2);
        while (smallerNum > 1){
            if (num1 % smallerNum == 0 && num2 % smallerNum == 0){
                hcf = smallerNum;
                break;
            }
            smallerNum--;
        }
        lcm = (num1 * num2) / hcf;

        int [] nums = new int[2];
        nums[0] = hcf;
        nums[1] = lcm;

        return nums;
    }
    public static void ifPalindrome(int num){
        for (int i = 1; i <= num; i++){
            String num1 = String.valueOf(i);
            String str ="";
            for (int j = 0; j < num1.length(); j++){
                str = num1.charAt(j) + str;
            }
            if (str.equals(num1)){
                System.out.println(i);
            }
        }
    }
    public static boolean isPeterson(int num){
        String str = String.valueOf(num);
        int result = 0;
        for (int i = 0; i < str.length(); i++){
            int numFactorial = 1;
            int strValue =  Integer.parseInt(String.valueOf(str.charAt(i)));
            for (int j = strValue; j > 0; j--){
                numFactorial *= j;
            }
            result += numFactorial;
        }
        if (result == num){
            return true;
        } else
            return false;
    }
    public static void etersonNumberWithinARange(int num){
        for (int i = 1; i <= num; i++){
            String str = String.valueOf(i);
            int result = 0;
            for (int j = 0; j < str.length(); j++ ){
                int numIndex = Integer.parseInt(String.valueOf(str.charAt(j)));
                int factorial = 1;
                for (int k = numIndex; k > 1; k--){
                    factorial *= k;
                }
                result += factorial;
            }
            if (result == i){
                System.out.println(i);
            }
        }
    }
}
