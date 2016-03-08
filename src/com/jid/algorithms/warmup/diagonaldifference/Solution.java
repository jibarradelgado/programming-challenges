package com.jid.algorithms.warmup.diagonaldifference;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[][] matrix = new int[N][N];

        for(int i = 0; i < N; i++){
            for(int j=0; j < N; j++) {
                matrix[i][j] = in.nextInt();
            }
        }

        int firstSum = 0;
        for (int i = 0; i < N ; i++) {
            firstSum += matrix[i][i];
        }

        int secondSum = 0;
        for (int i = 0; i < N ; i++) {
            secondSum += matrix[i][(N - 1) - i];
        }

        System.out.println(Math.abs(firstSum - secondSum));
    }
}
