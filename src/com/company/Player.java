package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

import static java.lang.Math.*;

public class Player {
    public static void main (String[] args){
        String str = "{}[]()";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String s){
        if (s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack<Character>();
        char[] arr = s.toCharArray();
        for (char ch : arr){
            if (ch == '{' || ch == '[' || ch == '('){
                stack.push(ch);
            } else if (ch == '}' && !stack.empty() && stack.peek() == '{'){
                stack.pop();
            } else if (ch == ']' && !stack.empty() && stack.peek() == '['){
                stack.pop();
            } else if (ch == ')' && !stack.empty() && stack.peek() == '('){
                stack.pop();
            }
        }
        return stack.empty();
    }


}


