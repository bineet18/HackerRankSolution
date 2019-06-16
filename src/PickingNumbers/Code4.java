/*******
 * Bug in the code 
 *******/
package PickingNumbers;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Code4 {

    public static void main(String[] args) {
        Map<Integer,Integer> frequencies = new HashMap<Integer,Integer>();
        int n = 101;
        int[] ar = {97,4,97,5,97,97,4,97,4,97,97,97,97,4,4,5,5,97,5,97,99,4,97,5,97,97,97,5,5,97,4,5,97,97,5,97,4,97,5,4,4,97,5,5,5,4,97,97,4,97,5,4,4,97,97,97,5,5,97,4,97,97,5,4,97,97,4,97,97,97,5,4,4,97,4,4,97,5,97,97,97,97,4,97,5,97,5,4,97,4,5,97,97,5,97,5,97,5,97,97,97};
        
        
        for(int i=0; i < n; i++){
            if(frequencies.containsKey(ar[i]))
            	frequencies.put(ar[i], frequencies.get(ar[i])+1);
            else
            	frequencies.put(ar[i], 1);
            
        }
        System.out.println(frequencies);
        
        int maxSet = 0;
        
        for(int i : frequencies.keySet())
        {
            int left = (frequencies.containsKey(i-1)) ? frequencies.get(i) + frequencies.get(i-1) : frequencies.get(i);
            int right = (frequencies.containsKey(i+1)) ? frequencies.get(i) + frequencies.get(i+1) : frequencies.get(i);
            
            if(left > maxSet)
                maxSet = left;
            if(right > maxSet)
                maxSet = right;
        }
        System.out.println(maxSet);
    }
}