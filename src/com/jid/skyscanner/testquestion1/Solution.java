package com.jid.skyscanner.testquestion1;

/**
 * Created by Jorge on 2015-10-16.
 */
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        char[] stairCase = new char[N];

        for(int i = 0; i < N; i++){
            stairCase[i] = ' ';
        }

        for(int i = N - 1; i >= 0 ; i--){
            stairCase[i] = '#';
            System.out.println(String.valueOf(stairCase));
        }
    }
}
