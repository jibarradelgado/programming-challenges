package com.jid.java.introduction.end_of_file;

import java.util.Scanner;

/**
 * Created by Jorge on 2015-09-17.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        while(in.hasNext()){
            i++;
            System.out.println(i + " " + in.nextLine());
        }
    }
}
