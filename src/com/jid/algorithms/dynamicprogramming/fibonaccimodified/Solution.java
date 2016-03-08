package com.jid.algorithms.dynamicprogramming.fibonaccimodified;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        BigInteger first = new BigInteger(String.valueOf(in.nextInt()));
        BigInteger second = new BigInteger(String.valueOf(in.nextInt()));
        BigInteger next = new BigInteger("0");
        int n = in.nextInt();
        BigInteger result = new BigInteger("0");

        for(int i = 2; i < n ; i++){
            next = first.add(second.pow(2));  //(long)Math.pow(second,2) + (long)first;
            first = second;
            second = next;
        }



        System.out.println(next.toString());
    }
}
