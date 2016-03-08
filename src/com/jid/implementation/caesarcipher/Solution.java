package com.jid.implementation.caesarcipher;

/**
 * Created by Jorge on 2015-10-16.
 */
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        String S = in.next();
        int K = in.nextInt();

        char[] s = S.toCharArray();

        for(int i = 0; i < N; i++) {
            if (s[i] >= 65 && s[i] <= 90) {
                s[i] = (char) rotate(s[i], K, 65, 90);
            } else if (s[i] >= 97 && s[i] <= 122) {
                s[i] = (char) rotate(s[i], K, 97, 122);
            }
            System.out.print(s[i]);
        }
    }

    static int rotate(int value, int augment, int min, int max){
        augment = augment % 25 - 2;

        value += augment;

        if(value > max){
            int extra = value - max - 1;
            value = min + extra;
        }

        return value;
    }
}
