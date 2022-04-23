package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Maths {
    public static void main(String[] args){
        String[] stringArray =  {"ufuoma", "isaac", "bode", "philip"};
        List<String> list = Arrays.asList(stringArray);
        ArrayList<String> s = new ArrayList<>(list);
        s.add("aba");
        int counter = 0;
        for (String a : s){
            counter++;
            System.out.println(a);
        }
    }
}
