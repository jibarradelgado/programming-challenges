package com.jid.algorithms.warmup.libraryfine;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int actualDay = in.nextInt();
        int actualMonth = in.nextInt();
        int actualYear = in.nextInt();
        int expectedDay = in.nextInt();
        int expectedMonth = in.nextInt();
        int expectedYear = in.nextInt();
        int fine = 0;

        Calendar actualDate = Calendar.getInstance();
        Calendar expectedDate = Calendar.getInstance();

        actualDate.set(actualYear, actualMonth, actualDay);
        expectedDate.set(expectedYear, expectedMonth, expectedDay);

        if (actualDate.compareTo(expectedDate) > 0) {
            if (actualMonth == expectedMonth && actualYear == expectedYear) {
                fine = (actualDay - expectedDay) * 15;
            } else if (actualYear == expectedYear) {
                fine = (actualMonth - expectedMonth) * 500;
            } else {
                fine = (actualYear - expectedYear) * 10000;
            }
        }
        System.out.println(fine);
    }
}