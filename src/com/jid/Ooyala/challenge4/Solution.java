package com.jid.Ooyala.challenge4;

/**
 * Created by Jorge on 2016-02-03.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] StringSimilarity(String[] inputs) {
        int[] result = new int[inputs.length];
        int count = 0;

        for(String value : inputs){
            StringBuilder copy = new StringBuilder(value);

            result[count] = copy.length();

            copy.deleteCharAt(0);

            for(int i = 1; i < value.length(); i++){
                for(int j = 0; j < copy.length(); j++){
                    if(value.charAt(j) == copy.charAt(j)){
                        result[count]++;
                    } else {
                        break;
                    }
                }
                copy.deleteCharAt(0);
            }
            count++;
        }
        return result;
    }

    public static void main(String[] args) throws IOException{
        Scanner in = new Scanner(System.in);
        //final String fileName = System.getenv("OUTPUT_PATH");
        //BufferedWriter bw = new BufferedWriter(new FileWriter(fileName));
        int[] res;

        int _inputs_size = 0;
        _inputs_size = Integer.parseInt(in.nextLine());
        String[] _inputs = new String[_inputs_size];
        String _inputs_item;
        for(int _inputs_i = 0; _inputs_i < _inputs_size; _inputs_i++) {
            try {
                _inputs_item = in.nextLine();
            } catch (Exception e) {
                _inputs_item = null;
            }
            _inputs[_inputs_i] = _inputs_item;
        }

        res = StringSimilarity(_inputs);
//        for(int res_i=0; res_i < res.length; res_i++) {
//            bw.write(String.valueOf(res[res_i]));
//            bw.newLine();
//        }
//
//        bw.close();
    }
}
