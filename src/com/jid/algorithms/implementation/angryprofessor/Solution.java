package com.jid.algorithms.implementation.angryprofessor;

/**
 * Created by Jorge on 2015-10-01.
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        int N,K;
        int arrivals;

        for(int i = 0; i < T; i++){
            N = in.nextInt();
            K = in.nextInt();
            arrivals = 0;
            for (int j = 0; j < N; j++){
                if (in.nextInt() <= 0)
                    arrivals++;
            }
            if (arrivals >= K)
                System.out.println("NO");
            else
                System.out.println("YES");
        }
    }
}
