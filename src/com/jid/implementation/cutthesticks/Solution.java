package com.jid.implementation.cutthesticks;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int[] sticks = new int[N];

        for(int i=0; i<N; i++){
            sticks[i] = in.nextInt();
        }

        int zeroes = 0;
        int sticksLeft = N;
        while(zeroes < N){
            System.out.println(sticksLeft - zeroes);
            int minimum = calculateMinimum(sticks);
            for(int i = 0; i < N; i++){
                if(sticks[i] > 0){
                    sticks[i] -= minimum;
                    if(sticks[i] <= 0) zeroes++;
                }
            }
        }
    }

    static int calculateMinimum(int[] ar){
        int minimum = Integer.MAX_VALUE;
        for(int i=0; i < ar.length; i++){
            if(ar[i] > 0)
                minimum = Integer.min(minimum, ar[i]);
        }
        return minimum;
    }
}
