package com.jid.oracle;

import java.awt.*;

import static org.junit.Assert.*;

/**
 * Created by Jorge on 2016-02-12.
 */
public class challenge1Test {

    public boolean isOverlapping(Rectangle rectangle1, Rectangle rectangle2){

        Point pointUpperLeft1 = new Point();
        Point pointLowerRight1 = new Point();

        Point pointUpperLeft2 = new Point();
        Point pointLowerRight2 = new Point();

        for(int x = pointUpperLeft1.x ; x < pointLowerRight1.x; x++){
            for(int y = pointUpperLeft1.y ; y < pointLowerRight1.y ; y++){
                if(x == pointUpperLeft2.x && y == pointLowerRight2.y) {
                    return true;
                }
            }
        }

        return false;
    }

    //do a cycle until the nth primer number we want
    public static long getNthPrimeNumber(int n){
        long result = 0;
        int count = 0;

        for(long i = 1; i < Long.MAX_VALUE; i++){
            if(isPrime(i)){
                count++;
                if(count == n){
                    result = i;
                    break;
                }
            }
        }
        return result;
    }

    public static boolean isPrime(long n){

        if(n == 2) {
            return true;
        }
        if(n == 5) {
            return true;
        }

        for(int i = 2; i < n; i++){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}