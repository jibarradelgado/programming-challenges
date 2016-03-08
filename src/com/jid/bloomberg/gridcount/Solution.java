package com.jid.bloomberg.gridcount;

import java.io.*;
import java.util.*;
import java.util.regex.Pattern;

/**
 * Created by Jorge on 2015-12-17.
 */
public class Solution {

    static int solution = 0;
    static int x = 0;
    static int y = 0;

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        x = in.nextInt();
        y = in.nextInt();

        walk(0, 0);

        System.out.println(solution);
    }

    private static void walk(int a, int b){

        if(a == x - 1 && b == y - 1) {
            ++solution;
            return;
        }

        if(canWalkRight(a)) {
            walk(a + 1, b);
        }
        if(canWalkDown(b)) {
            walk(a,b + 1);
        }

    }

    private static boolean canWalkRight(int a){
        if(a + 1 != x) return true;
        return false;
    }

    private static boolean canWalkDown(int b){
        if(b + 1 != y) return true;
        return false;
    }
}
