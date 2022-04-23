package com.company;

import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String args[]) {
        floydTriangle(7);
    }
    public static void floydTriangle(int num){
        int counter = 1;
        int row = 0;
        int column = 0;
        isaac:
        for (int i = 1; i < 50; i++){
            for (int j = 1; j <= i; j++){
                if (counter == num){
                    System.out.print(counter+ " ");
                    row = i;
                    column = j;
                    break isaac;
                } else if( counter < num)
                System.out.print(counter+ " ");
                counter++;
            }
            System.out.println();
        }
        System.out.println();

        System.out.print(num + "is found in row " + row );
        System.out.println(" colomn " + column);
    }
}



