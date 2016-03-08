package com.jid.java.strings.anagrams;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Jorge on 2015-09-21.
 */
public class Solution {
    static boolean isAnagram(String A, String B) {
        A = A.toLowerCase();
        B = B.toLowerCase();
        char [] charsA = A.toCharArray();
        char [] charsB = B.toCharArray();
        Arrays.sort(charsA);
        Arrays.sort(charsB);
        A = String.valueOf(charsA);
        B = String.valueOf(charsB);
        return A.equals(B);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        boolean ret=isAnagram(A,B);
        if(ret)System.out.println("Anagrams");
        else System.out.println("Not Anagrams");
    }
}
