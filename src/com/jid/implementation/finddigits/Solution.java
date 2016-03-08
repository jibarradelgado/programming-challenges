package com.jid.implementation.finddigits;

/**
 * Created by Jorge on 2015-10-12.
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            int count = 0;
            String n = in.next();
            int N = Integer.parseInt(n);
            char[] array = n.toCharArray();
            for(char charDigit : array){
                int digit = Integer.parseInt(String.valueOf(charDigit));
                if (digit != 0) {
                    if (N % digit == 0) count++;
                }
            }
            System.out.println(count);
        }
    }
}
