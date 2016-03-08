package com.jid.java.strings.token;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        s = s.trim();
        if (s.equals("")) {
            System.out.println("0");
            return;
        }
        String[] result = s.split("[\\s!,?.\\_'@]+");
        System.out.println(result.length);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }


    }

    public static String[] Braces(String[] values) {
        String[] result = new String[values.length];
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < values.length; i++){
            stack.empty();

            for(char c : values[i].toCharArray()){

                if(isOpen(c)){
                    stack.push(c);
                }
                else if (c == '}' && stack.peek() == '{'){
                    stack.pop();
                }
                else if (c == ']' && stack.peek() == '['){
                    stack.pop();
                }
                else if (c == ')' && stack.peek() == '('){
                    stack.pop();
                }
            }

            if(stack.isEmpty()){
                result[i] = "YES";
            } else {
                result[i] = "NO";
            }
        }
        return result;
    }

    public static boolean isOpen(char value){
        if(value == '{' || value == '[' || value == '('){
            return true;
        }
        return false;
    }

//    static int maxDifference(int[] a) {
//        int max = -1;
//
//        for(int i = 0; i < a.length; i++){
//            for(int j = i+1; j < a.length; j++){
//                if(a[j] > a[i]){
//                    max = Math.max(max, a[j] - a[i]);
//                }
//            }
//        }
//
//        return max;
//    }

    static int maxDifference(int[] a) {
        int max = -1;

        for(int i = 0; i < a.length; i++){

            for(int j = i+1; j < a.length; j++){
                if(a[j] > a[i]){
                    max = Math.max(max, a[j] - a[i]);
                }
            }
        }

        return max;
    }

    static String[] makeItLarge(String[] inp) {
        String[] result = new String[inp.length];
        int count = 0;
        int max;

        for(String value : inp){
            boolean equals = true;
            for(int i = 0; i < value.length() - 1; i++){
                if(value.charAt(i) != value.charAt(i + 1)) {
                    equals = false;
                }
            }

            if(equals){
                result[count] = "no answer";
                count++;
                continue;
            }
        }

        return result;
    }

    static int[] StringSimilarity(String[] inputs) {
        int[] result = new int[inputs.length];
        int count = 0;

        for(String value : inputs){
            StringBuilder copy = new StringBuilder(value);

            result[count] = copy.length();

            copy.substring(1);

            for(int i = 1; i < value.length(); i++){
                for(int j = 0; j < copy.length(); j++){
                    if(value.charAt(j) == copy.charAt(j)){
                        result[count]++;
                    } else {
                        break;
                    }
                }
                copy.substring(1);
            }
            count++;
        }
        return result;
    }


}