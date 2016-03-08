package com.jid;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

import java.io.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        // You a list of strings and you need to get in groups all the words that contain the same type and number of letters
        // The order of the list of groups must be alphabetically ordered
        // The number of listed elements is unknown

        //Find out the groups by sorting the order of strings and compare each other
        //
        List<String> strings = new ArrayList<String>();
        List<List<String>> results = new ArrayList<List<String>>();
        Scanner sc = new Scanner(System.in);
        boolean found = false;

        while(sc.hasNextLine()){
            strings.add(sc.nextLine().replaceAll("\\s", ""));
        }

        for (int i=0; i < strings.size()-1; i++){
            for (int j=i+1; j<strings.size();j++){
                String string1 = strings.get(i);
                String string2 = strings.get(j);
                char[] c1 = string1.toCharArray();
                char[] c2 = string2.toCharArray();
                Arrays.sort(c1);
                Arrays.sort(c2);
                string1 = new String(c1);
                string2 = new String(c2);
                if (string1.equals(string2)){
                    found = true;
                    results.add(new ArrayList<String>());
                }
            }
        }
    }
}

//public class Solution {
//    public static void main(String args[] ) throws Exception {
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        int M = sc.nextInt();
//        int [] numbers = new int[M];
//        for (int i=0; i<M; i++) {
//            numbers[i] = sc.nextInt();
//        }
//
//        for (int i=0; i<M-1; i++) {
//            for (int j=i+1; j<M; j++){
//                if(numbers[i] + numbers[j] == N){
//                    System.out.println(1);
//                    return;
//                }
//            }
//        }
//
//        System.out.println(0);
//    }
//}

//public class Solution {
//    public static void main(String args[] ) throws Exception {
//    /* Enter your code here. Read input from STDIN. Print output to STDOUT */
//        Scanner sc = new Scanner(System.in);
//        int tests = sc.nextInt();
//        int a,b,c,d;
//        List<int[]> listPolygons = new ArrayList();
//        int[] results = new int[]{0,0,0};
//        sc.nextLine();
//        for(int i=0; i<tests; i++){
//            a = sc.nextInt();
//            b = sc.nextInt();
//            c = sc.nextInt();
//            d = sc.nextInt();
//            if (a == b && b == c && c == d && a >= 0) {
//                results[0]++;
//            }
//            else if (a == c && b == d && a != b && a >= 0 &&  d >= 0) {
//                results[1]++;
//            }
//            else {
//                results[2]++;
//            }
//        }
//        for(int i=0; i<3 ; i++){
//            System.out.print(results[i] + " ");
//        }
//    }
//}

//public class Solution {
///*
// * Complete the function below.
// */
//    public static void service(int [] lane, TestCase [] tests) {
//        for(TestCase test : tests) {
//            int min = 4;
//            for (int i = test.first; i <= test.last; i++)
//            {
//                min = Math.min(min, lane[i]);
//            }
//            System.out.println(min);
//        }
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int N = in.nextInt();
//        int T = in.nextInt();
//
//        int [] lane = new int[N];
//        TestCase [] tests = new TestCase[T];
//
//        for (int i = 0; i < N; i++) {
//            lane[i] = in.nextInt();
//        }
//        for (int i = 0; i < T; i++) {
//            int first = in.nextInt();
//            int last = in.nextInt();
//            tests[i] = new TestCase(first, last);
//        }
//
//        service(lane, tests);
//    }
//
//    public static class TestCase {
//        public int first;
//        public int last;
//
//        public TestCase(int first, int last) {
//            this.first = first;
//            this.last = last;
//        }
//    }
//}
