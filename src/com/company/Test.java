package com.company;

import java.util.Scanner;

public class Test {
    public static void main(String [] args) {
        String str = "cd";

        System.out.println(romanToInt(str));

    }
    public static int romanToInt(String s) {
        int  result = 0;
        char[] cha = s.toUpperCase().toCharArray();
        for (int i = 0; i < cha.length; i++) {
            if (cha[i] == 'I') {
                if (i + 1 < cha.length && cha[i + 1] == 'V') {
                    result += 4;
                    i++;
                } else if (i + 1 < cha.length && cha[i + 1] == 'X') {
                    result += 9;
                    i++;
                } else {
                    result += 1;
                }
                continue;

            }
            if (cha[i] == 'V'){
                result += 5;

            }
            if (cha[i] == 'X'){
                if (i + 1 < cha.length && cha[i + 1] == 'L'){
                    result += 40;
                    i++;
                } else if ( i + 1 < cha.length && cha[i + 1] == 'C'){
                    result += 90;
                    i++;
                } else
                    result += 10;
                continue;

            }
            if (cha[i] == 'L'){
                result += 50;

            }
            if (cha[i] == 'C'){
                if (i + 1 < cha.length && cha[i + 1] == 'D'){
                    result += 400;
                    i++;
                } else if (i + 1 < cha.length && cha[i + 1] == 'M'){
                    result += 900;
                    i++;
                } else {
                    result += 100;
                }
                continue;
            }

            if (cha[i] == 'D'){
                result += 500;
                continue;
            }
            if (cha[i] == 'M'){
                result += 1000;
            }
        }
        return result;

    }
}
