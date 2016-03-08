package com.jid.java.strings.compare;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Jorge on 2015-09-17.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sample = in.nextLine();
        int length = in.nextInt();

        List<String> samples = new ArrayList<String>();
        int i = length;
        for (; i <= sample.length(); i++){
            samples.add(sample.substring(i - length, i));
        }
        String minimum = samples.get(0);
        String maximum = samples.get(0);
        for(i = 1; i < samples.size(); i++) {
            if (minimum.compareTo(samples.get(i)) > 0) {
                minimum = samples.get(i);
            }
            if (maximum.compareTo(samples.get(i)) < 0) {
                maximum = samples.get(i);
            }
        }

        System.out.println(minimum);
        System.out.println(maximum);
    }
}
