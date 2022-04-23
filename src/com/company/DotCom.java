package com.company;

import java.util.Scanner;

public class DotCom {
    public static void main(String[] args){
        System.out.println("Enter the numeric numeral");
        Scanner sc = new Scanner(System.in);
        String userInput = sc.nextLine();
        System.out.println(romanToInt(userInput));

    }
    public static int romanToInt(String s){
        char[] array = s.toUpperCase().toCharArray();
        int result = 0;
        int arraySize = array.length;

        for (int i = 0; i < arraySize; i++){
            switch (array[i]) {
                case 'I':
                    if (i + 1 < arraySize && array[i + 1] == 'V') {
                        result += 4;
                        i++;
                    } else if (i + 1 < arraySize && array[i + 1] == 'X') {
                        result += 9;
                        i++;
                    } else {
                        result += 1;
                    }
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    if (i + 1 < arraySize && array[i + 1] == 'L') {
                        result += 40;
                        i++;
                    } else if (i + 1 < arraySize && array[i + 1] == 'C'){
                        result += 90;
                        i++;
                    } else {
                        result += 10;
                    }
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    if (i + 1 < arraySize && array[i + 1] == 'D'){
                        result += 400;
                        i++;
                    } else if(i + 1 < arraySize && array[i + 1] == 'M'){
                        result += 900;
                        i++;
                    } else {
                        result += 100;
                    }
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
        }
        return result;
    }
}

