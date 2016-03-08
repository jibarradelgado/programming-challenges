package com.jid.algorithms.warmup.extralongfactorial;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();

        BigInteger result = new BigInteger("1");

        for(int i = 1; i <= N; i++){
            result = result.multiply(BigInteger.valueOf((long)i));
        }

        System.out.println(result);
    }
}
