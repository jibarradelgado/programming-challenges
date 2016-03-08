package com.jid.algorithms.bitmanipulation.flippingbits;

/**
 * Created by Jorge on 2015-10-01.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for (int i = 0 ; i < T ; i++){
            int value = Integer.parseUnsignedInt(in.next());
            String result = Integer.toUnsignedString(~value);
            System.out.println(result);
        }
    }
}
