package com.jid.implementation.cavitymap;

/**
 * Created by Jorge on 2015-10-19.
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] matrix = new int[n][n];

        for(int i =0; i < n; i++){
            String value = in.next();
            for(int j = 0; j < n; j++){
                String intValue = value.substring(j, j+1);
                matrix[i][j] = Integer.parseInt(intValue);
            }
        }

        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(i == 0 || j == 0 || i == n - 1 || j == n - 1){
                    System.out.print(matrix[i][j]);
                    continue;
                } else {
                    int curValue = matrix[i][j];

                    if(curValue > matrix[i][j-1] && curValue > matrix[i][j + 1] && curValue > matrix[i - 1][j] && curValue > matrix[i + 1][j]){
                        System.out.print("X");
                    }
                    else{
                        System.out.print(matrix[i][j]);
                    }
                }
            }
            System.out.println();
        }
    }
}
