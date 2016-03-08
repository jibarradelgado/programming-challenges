package com.jid.implementation.sherlockandsquares;

import java.io.*;
import java.math.BigDecimal;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0; i < T; i++){
            int count = 0;
            int pow = 0;
            int a = in.nextInt();
            int b = in.nextInt();
            for(int j = 0; ; j++){
                pow = (int)Math.pow(j, 2);
                if(pow >= a && pow <= b){
                    count++;
                }
                if(pow > b) break;
            }
//            for (int j = a; j <= b; j++){
//                double sqrt = Math.sqrt(j);
//                int isqrt = (int)sqrt;
//                double pow = Math.pow(isqrt, 2);
//                if (pow == j){
//                    count++;
//                }
//            }
            System.out.println(count);
        }
    }
}
