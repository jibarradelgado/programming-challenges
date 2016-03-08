package com.jid.java.strings.reverse;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        Stack<String> stack = new Stack<String>();

        if (A.length() == 1){
            System.out.println("Yes");
            return;
        }

        int limit = A.length() / 2;

        for(int i=0; i < limit; i++){
            stack.push(A.substring(i, i + 1));
        }

        if (A.length() % 2 == 1) limit = limit + 1;

        for(int i=limit; i < A.length(); i++){
            String letter = stack.pop();
            if(letter.compareTo(A.substring(i,i+1)) != 0){
                System.out.println("No");
                return;
            }
            System.out.println("Yes");
            return;
        }
    }
}

