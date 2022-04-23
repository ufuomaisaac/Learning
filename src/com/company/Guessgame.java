package com.company;

import java.util.Scanner;

import static java.lang.Math.*;

public class Guessgame {
    //1. Make the single SimpleDotCom Object.
//2. Make a location for it (three consecutive cells on a single row of seven virtual cells).
//3. Ask the user for a guess. 4. Check the guess.
//5. Repeat until the dot com is dead .
//6. Tell the user how many guesses it took
    public static void main(String[] args){
        int numOfGuesses = 0;
        int startingPoint = (int) (Math.random() * 4);
        int[] locationcell = {startingPoint, startingPoint + 1, startingPoint + 2};
        int numOfHits = 0;
    }
}
 class SimpleDotCom{

}
