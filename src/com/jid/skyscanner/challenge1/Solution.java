package com.jid.skyscanner.challenge1;

/**
 * Created by Jorge on 2015-10-16.
 */
import java.util.*;

public class Solution {
    static void OutputMostPopularDestination(int count, Scanner in) {
        HashMap<String, Integer> destinations = new HashMap<String, Integer>();
        int best = 0;
        String result = "";

        for(int i = 0; i < count; i++){
            String destination = in.next();
            if(!destinations.containsKey(destination)){
                destinations.put(destination, 1);
                if(best < 1)
                    result = destination;
            } else {
                Integer searches = destinations.get(destination);
                searches = searches + 1;
                destinations.put(destination, searches);
                best = Math.max(best, searches.intValue());
                if(best == searches.intValue()){
                    result = destination;
                }
            }
        }

        System.out.println(result);
    }
}
