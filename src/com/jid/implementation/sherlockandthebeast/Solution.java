package com.jid.implementation.sherlockandthebeast;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            System.out.println(calculate(in.nextInt()));
        }
    }

    public static StringBuilder calculate(int N){
        int pivot = getPivot(N);
        StringBuilder result = new StringBuilder();
        if (pivot < 0){
            return result.append("-1");
        }
        else {
            int repeat = pivot/3;
            while (repeat > 0){
                result.append("555");
                repeat--;
            }
            repeat = (N - pivot)/5;
            while (repeat > 0){
                result.append("33333");
                repeat--;
            }
            return result;
        }
    }

    public static int getPivot(int N){
        while (N > 0){
            if(N % 3 == 0){
                break;
            }
            else N -= 5;
        }
        return N;
    }

//    public static String calculate(int N) {
//        String result = "";
//        result = calculate(N, result);
//        return  result;
//    }
//
//    public static String calculate(int N, String value){
//        if (N % 3 == 0){
//            value = addDigits(N, 3, value);
//        } else if (N % 5 == 0){
//            value = addDigits(N, 5, value);
//        } else if (N > 5){
//            value = "555" + calculate(N - 3, value);
//        }
//        return value;
//    }
//
//    public static String addDigits(int N, int digit, String value){
//        int times = N / digit;
//        String result = value;
//        for (int i = 0; i < times; i++){
//            if (digit == 5){
//                result = result + "33333";
//            }
//            else {
//                result = result + "555";
//            }
//        }
//        return result;
//    }
//
//    public static boolean canCalculate(int N){
//        boolean result = false;
//        if (N % 3 == 0) {
//            result = true;
//        } else if (N % 5 == 0){
//            result = true;
//        } else if (N > 5){
//            result = canCalculate(N - 3);
//        }
//        return result;
//    }
}
