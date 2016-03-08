package com.jid.algorithms.sorting.quicksort2sorting;

import java.util.*;
public class Solution {

    static void quickSort(int[] ar) {

        partition(ar);

    }



    static int[] partition(int[] ar) {

        if(ar.length <= 1) {
            return ar;
        }
        if(ar.length == 2) {
            if (ar[0] < ar[1]){
                System.out.println(ar[0] + " " + ar[1]);
                return ar;
            } else {
                System.out.println(ar[1] + " " + ar[0]);
                return new int[]{ar[1], ar[0]};
            }
        }

        int pivot = ar[0];
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

        int[] lAr = new int[left.size()];
        int[] rAr = new int[right.size()];

        Iterator<Integer> iterator = left.iterator();
        for(int i = 0; i < lAr.length; i++){
            lAr[i] = iterator.next().intValue();
        }

        iterator = right.iterator();
        for(int i = 0; i < rAr.length; i++){
            rAr[i] = iterator.next().intValue();
        }

        lAr = partition(lAr);
        rAr = partition(rAr);

        int[] result = new int[ar.length];

        System.arraycopy(lAr, 0, result, 0, lAr.length);
        result[lAr.length] = pivot;
        System.arraycopy(rAr, 0, result, lAr.length + 1, rAr.length);

        printArray(result);
        return result;
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
        quickSort(ar);
    }
}