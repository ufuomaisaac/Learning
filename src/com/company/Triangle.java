package com.company;

import java.util.Scanner;

public class Triangle {
    public static void main(String args[]){
        System.out.println("Input the first binary number");
        Scanner sc = new Scanner(System.in);
        String b1 = sc.nextLine();

        System.out.println("Input the second binary number");
        String b2 = sc.nextLine();
        System.out.println(addBinary(b1, b2));

    }
    public static StringBuilder addBinary(String b1, String b2){
        StringBuilder sb = new StringBuilder("");

        int i = b1.length() - 1;
        int j = b2.length() - 1;

        int carry = 0;
        while (i >= 0 || j >= 0){
            int sum = carry;
            if (i >= 0) sum += b1.charAt(i) - '0';
            if (j >= 0) sum += b2.charAt(j) - '0';
            sb.append(sum % 2);
            carry = sum / 2;

            i--;
            j--;

        }
        if (carry != 0 ){
            sb.append(carry);
        }
        return sb.reverse();
    }
}
