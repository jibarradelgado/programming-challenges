package com.jid.algorithms.sorting.quicksort1partition;

import java.util.*;
public class Solution {

    static void partition(int[] ar) {
        int pivot = ar[0];
        int [] newAr = new int[ar.length];
        List<Integer> left = new ArrayList<Integer>();
        List<Integer> right = new ArrayList<Integer>();
        for (int i = 1; i < ar.length; i++){
            if(ar[i] < pivot){
                left.add(ar[i]);
            }
            if(ar[i] > pivot){
                right.add(ar[i]);
            }
        }
        left.add(pivot);
        left.addAll(right);
        Iterator<Integer> iterator = left.iterator();
        for(int i = 0; i < ar.length; i++){
            newAr[i] = iterator.next().intValue();
        }
        printArray(newAr);
    }

    static void swap(int[] ar, int a, int b){
        int temp = ar[a];
        ar[a] = ar[b];
        ar[b] = temp;
    }

    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        partition(ar);
    }
}