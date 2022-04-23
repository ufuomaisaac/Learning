package com.company;

import java.util.*;

public class Myapp {
    public static void main( String[] args){
        String str = "[]{}()";
        System.out.println(isValid(str));
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case '[':
                    stack.push(']');
                    break;
                case '(':
                    stack.push(')');
                    break;
                case '{':
                    stack.push('}');
                    break;
                default:
                    if(stack.isEmpty() || stack.pop() != c)
                        return false;
                    break;
            }
        }
        return stack.isEmpty();
    }
}
//Take a stack and push every open bracket into it.
//Whenever a closing bracket is seen check the element present in the stack top.
//if the current element and stack top are valid parantheses, then pop the element from stack
//Else, return false.