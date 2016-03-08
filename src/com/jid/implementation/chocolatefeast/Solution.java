package com.jid.implementation.chocolatefeast;

import java.io.*;
import java.util.*;

public class Solution {

//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int T = in.nextInt();
//        for(int i = 0; i < T; i++){
//            int N = in.nextInt();
//            int C = in.nextInt();
//            int M = in.nextInt();
//
//            int wrappers = N / C;
//            int promoWrappers = wrappers / M;
//            int extraWrappers = wrappers % M;
//            int result = wrappers + promoWrappers;
//            if(extraWrappers > 0){
//                while((promoWrappers + extraWrappers) / M > 0) {
//                    wrappers = (promoWrappers + extraWrappers) / M;
//                    promoWrappers = (wrappers + extraWrappers) / M;
//                    extraWrappers = (wrappers + extraWrappers) % M;
//                    result += wrappers;
//                }
//            }
//
//            System.out.println(result);
//        }
//    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int T = in.nextInt();
        for(int i = 0; i < T; i++){
            int N = in.nextInt();
            int C = in.nextInt();
            int M = in.nextInt();

            int chocos;
            int newChocos;
            int remWrappers;
            int temp;

            chocos = N/C;
            if(M > chocos){
                System.out.println(chocos);
            }
            else {
                newChocos = chocos / M;
                remWrappers = chocos % M;
                chocos += newChocos;
                while((newChocos + remWrappers) >= M){
                    chocos += (newChocos + remWrappers) / M;
                    temp = (newChocos + remWrappers) % M;
                    newChocos = (newChocos + remWrappers) / M;
                    remWrappers = temp;
                }
                System.out.println(chocos);
            }

            //System.out.println(result);
        }
    }
}
