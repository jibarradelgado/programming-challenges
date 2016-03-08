package com.jid.algorithms.warmup.staircase;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        char [] array = new char[N];

        for (int i = 0; i < N; i++) {
            array[i] = ' ';
        }

        for (int i = N-1; i >= 0; i--) {
            array[i] = '#';
            System.out.println(String.valueOf(array));
        }
    }
}
