package com.jid.java.datastructures.java1darray;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int [] array = new int[N];
        int sum = 0;
        int count = 0;
        for(int i = 0; i < N; i++){
            array[i] = in.nextInt();
        }
        for(int i = 0; i < N; i++) {
            sum = 0;
            for (int j = i; j < N ; j++){
                sum += array[j];
                if (sum < 0) count++;
            }
        }
        System.out.println(count);
    }
}