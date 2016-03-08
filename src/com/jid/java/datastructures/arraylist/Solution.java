package com.jid.java.datastructures.arraylist;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<List<Integer>> list = new ArrayList<List<Integer>>(n);

        for (int i = 0; i < n ; i++) {
            int d = in.nextInt();
            List<Integer> positions = new ArrayList<Integer>(d);
            for (int j = 0; j < d ; j++){
                positions.add(in.nextInt());
            }
            list.add(positions);
        }

        int q = in.nextInt();
        for (int i = 0; i < q ; i++) {
            try{
                int x = in.nextInt() - 1;
                int y = in.nextInt() - 1;
                List<Integer> positions = list.get(x);
                System.out.println(positions.get(y));
            }
            catch (IndexOutOfBoundsException ex){
                System.out.println("ERROR!");
            }
        }
    }
}
