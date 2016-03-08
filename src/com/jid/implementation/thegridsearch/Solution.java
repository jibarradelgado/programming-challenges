package com.jid.implementation.thegridsearch;

/**
 * Created by Jorge on 2015-10-19.
 */
import java.awt.*;
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++) {
            testCase(in);
        }
    }

    static void testCase(Scanner in){

        int R = in.nextInt();
        int C = in.nextInt();
        int[][] G = new int[R][C];

        fillGrid(in, R, C, G);

        int r = in.nextInt();
        int c = in.nextInt();
        int[][] P = new int[r][c];

        fillGrid(in, r, c, P);

        boolean found = false;

        outloop:
        for(int i = 0; i < R; i++){
            if(R - i < r) break;
            for(int j = 0; j < C; j++){
                if(C - j < c) break;
                if(G[i][j] == P[0][0]){
                    if(isPattern(G, P, i, j, r, c)){
                        found = true;
                        break outloop;
                    }
                }
            }
        }

        String result = (found==true)?"YES":"NO";
        System.out.println(result);
    }

    private static boolean isPattern(int[][] m1, int[][] m2, int i, int j, int r, int c){
        for(int a = 0; a < r; a++){
            for(int b = 0; b < c; b++){
                if(m2[a][b]!=m1[i+a][j+b]){
                    return false;
                }
            }
        }
        return true;
    }

    private static void fillGrid(Scanner in, int r, int c, int[][] g) {
        for(int i =0; i < r; i++){
            String value = in.next();
            for(int j = 0; j < c; j++){
                String intValue = value.substring(j, j+1);
                g[i][j] = Integer.parseInt(intValue);
            }
        }
    }
}
