package com.jid.java.strings.introduction;

import java.util.Scanner;

/**
 * Created by Jorge on 2015-09-17.
 */
public class Solution {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length() + B.length());
        String answer = A.compareTo(B) > 0 ? "Yes" : "No";
        System.out.println(answer);
        A = capitalizeFirstCharacter(A);
        B = capitalizeFirstCharacter(B);
        System.out.println(A + " " + B);


        /* Enter your code here. Print output to STDOUT. */

    }

    public static String capitalizeFirstCharacter(String word) {
        char first = Character.toUpperCase(word.charAt(0));
        return first + word.substring(1);
    }
}
