package com.jid.misc.strings;

import com.sun.javafx.css.CalculatedValue;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by Jorge on 2015-11-02.
 * Given a string, determinate the first non-repeated letter.
 */
public class Solution {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        String s = in.nextLine();

        s = calculateFirstNonRepeatedLetter(s);

        System.out.println(s);
    }

    static String calculateFirstNonRepeatedLetter(String s){
        String result="";
        final char[] letters = s.toCharArray();

        for(char letter : letters){
            if(s.indexOf(letter) == s.lastIndexOf(letter)){
                return String.valueOf(letter);
            }
        }

        return result;
    }

}