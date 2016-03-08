package com.jid.java.datastructures.map;

/**
 * Created by Jorge on 2015-09-24.
 */
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<String, Integer>();
        int n=in.nextInt();
        String name;
        Integer number;
        in.nextLine();

        for(int i=0;i<n;i++)
        {
            name = in.nextLine();
            number = Integer.parseInt(in.nextLine());
            map.put(name, number);
        }

        String s;
        while(in.hasNext())
        {
            s=in.nextLine();
            if (map.containsKey(s)){
                System.out.println(s + "=" + map.get(s));
            }
            else {
                System.out.println("Not found");
            }
        }
    }
}
