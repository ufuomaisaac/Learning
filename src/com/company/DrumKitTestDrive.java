package com.company;

import java.util.ArrayList;
import java.util.Stack;

public class DrumKitTestDrive {
    public static boolean isValid(String s) {
        if (s.length() % 2 != 0){
            return false;
        }
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' && !stack.empty() && stack.peek() == '(') {
                stack.pop();
            } else if (c == '}' && !stack.empty() && stack.peek() == '{') {
                stack.pop();
            } else if (c == ']' && !stack.empty() && stack.peek() == '[') {
                stack.pop();
            }

        }
        return stack.empty();
    }
}



