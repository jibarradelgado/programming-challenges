package com.jid.java.datastructures.hashset;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        HashSet<String> set = new HashSet<String>();
        in.nextLine();

        for (int i = 0; i < T ; i++) {
            set.add(in.nextLine());
            System.out.println(set.size());
        }
    }
}
