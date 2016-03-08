package com.jid.algorithms.warmup.plusminus;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        double positive = 0;
        double negative = 0;
        double zero = 0;
        int numberToEvaluate;

        for (int i = 0; i < N ; i++) {
            numberToEvaluate = in.nextInt();
            if (numberToEvaluate > 0) positive++;
            else if(numberToEvaluate == 0) zero++;
            else negative++;
        }

        System.out.printf("%.5f\n", positive / N );
        System.out.printf("%.5f\n", negative / N );
        System.out.printf("%.5f", zero / N );
    }
}
