package com.jid.algorithms.dynamicprogramming.fibonacci;

import java.util.Scanner;

/**
 * Created by Jorge on 2015-11-01.
 */
public class Solution {
    public static void main(String[] args)
    {
        Solution fs = new Solution();
        fs.fibonacci();
    }
    public void fibonacci()
    {
        int numb1 = 1;
        int numb2 = 1;
        int temp = 0;


        Scanner input=new Scanner(System.in);
        System.out.println("How Many Terms? (Up To 45)");
        int x=input.nextInt();
        x=x-2;

        System.out.println(numb1);
        System.out.println(numb2);

        for (int i = 0; i < x; i++)
        {
            System.out.println(numb1 + numb2 + " ");
            temp = numb1;
            numb1 = numb2;
            numb2 = temp + numb2;
        }
    }
}
