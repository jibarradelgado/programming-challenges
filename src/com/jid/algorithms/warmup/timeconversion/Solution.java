package com.jid.algorithms.warmup.timeconversion;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time = in.next();
        String timeOfDay = time.substring(8);
        time = time.substring(0,8);
        String hour = time.substring(0,2);
        if(timeOfDay.contains("AM")){
            if(hour.equals("12"))
                hour = "00";
        }
        else {
            if(!hour.equals("12")) {
                int hourInt = Integer.parseInt(hour) + 12;
                hour = String.valueOf(hourInt);
                if(hour.length() == 1){
                    hour = "0" + hour;
                }
            }
        }
        time = hour + time.substring(2,8);
        System.out.println(time);
    }
}