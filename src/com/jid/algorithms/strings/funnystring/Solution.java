package com.jid.algorithms.strings.funnystring;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        char[] array_s;
        char[] array_r;
        int result_s;
        int result_r;
        boolean funny;
        String[] cases = new String[T];
        String r;

        for (String s : cases){
            s = in.next();
            r = getReverse(s);
            array_s = s.toCharArray();
            array_r = r.toCharArray();
            funny = true;
            for (int i = 1; i < array_s.length; i++){
                result_s = Math.abs(array_s[i] - array_s[i - 1]);
                result_r = Math.abs(array_r[i] - array_r[i - 1]);
                if (result_s != result_r){
                    funny = false;
                    break;
                }
            }
            if (funny) {
                System.out.println("Funny");
            }
            else {
                System.out.println("Not Funny");
            }
        }
    }

    public static String getReverse(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}