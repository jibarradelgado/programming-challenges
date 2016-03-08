package com.jid.java.datastructures.java2darray;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [][] array = new int[6][6];
        for (int i=0; i<6; i++) {
            for (int j=0; j<6; j++){
                array[i][j] = in.nextInt();
            }
        }

        List<HourGlass> hourGlasses = new ArrayList<HourGlass>();

        for (int i=0; i<4; i++) {
            for (int j=0; j<4 ; j++) {
                hourGlasses.add(new HourGlass(i,j,array));
            }
        }

        int sum = Integer.MIN_VALUE;

        for (HourGlass hourGlass : hourGlasses) {
            sum = Integer.max(sum, hourGlass.sumPositions());
        }

        System.out.println(sum);

    }
}

class HourGlass {
    int [] position = new int[7];

    public HourGlass(int x, int y, int[][] array){
        position[0] = array[x][y];
        position[1] = array[x][y + 1];
        position[2] = array[x][y + 2];
        position[3] = array[x + 1][y + 1];
        position[4] = array[x + 2][y];
        position[5] = array[x + 2][y + 1];
        position[6] = array[x + 2][y + 2];
    }

    public int sumPositions(){
        int sum = 0;
        for(int value : position) {
            sum += value;
        }
        return sum;
    }
}