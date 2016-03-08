package com.jid.java.introduction.loops;

import java.util.Scanner;

/**
 * Created by jid on 08/09/15.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        Input[] variables = new Input[T];
        for(int i = 0; i < T; i++) {
            variables[i] = new Input(in.nextInt(), in.nextInt(), in.nextInt());
            int result = variables[i].A;
            for(int j = 0; j < variables[i].N; j++){
                result += Math.pow(2,j) * variables[i].B;
                System.out.print(result + " ");
            }
            System.out.println("");
        }
    }
}

class Input{
    public int A,B,N;
    public Input(int A, int B, int N){
        this.A = A;
        this.B = B;
        this.N = N;
    }
}
