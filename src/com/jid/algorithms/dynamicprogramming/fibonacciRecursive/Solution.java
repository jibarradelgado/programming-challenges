package com.jid.algorithms.dynamicprogramming.fibonacciRecursive;

import java.util.Scanner;

/**
 * Created by Jorge on 2015-11-01.
 */
public class Solution {
    public static void main(String[] args){
        Solution solution = new Solution();
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int result = solution.fibonacci(n);

        System.out.println(result);
    }

    public int fibonacci(int n)  {
        if(n == 0)
            return 0;
        else if(n == 1)
            return 1;
        else
            return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
