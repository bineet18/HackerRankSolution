package PickingNumbers;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Code2{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer,Integer> frequencies = new HashMap<>();
        for(int i=0; i < n; i++){
            int num = in.nextInt();
            if(frequencies.containsKey(num))
                frequencies.put(num, frequencies.get(num)+1);
            else
                frequencies.put(num, 1);
            
        }
        int maxSet = 0;
        System.out.println(frequencies.keySet());
        
        // 1 3 3 4 5 6
        Object[] a = frequencies.keySet().toArray();
        int left, right;
        
        for(int i : frequencies.keySet())
        {
        	
        	System.out.println(a[i]);
        	System.out.println(i);
        	left = 0;
        	right = 0;
            
            if(frequencies.containsKey(i-1))
            {
            	if(Math.abs(((int)a[i] - (int)a[i-1])) <= 1)
            	{
            		left = frequencies.get(i) + frequencies.get(i-1);
            	}
            }
            else
            {
            	left = frequencies.get(i);
            }
            
            if(frequencies.containsKey(i+1))
            {
            	if(Math.abs(((int)a[i] - (int)a[i+1])) <= 1)
            	{right = frequencies.get(i) + frequencies.get(i+1);}
            }
            else
            {
            	right = frequencies.get(i);
            }
            
            
            //System.out.print(left+" ");
            //System.out.print("");
            //System.out.println(right+" ");
            
            if(left > maxSet)
                maxSet = left;
            if(right > maxSet)
                maxSet = right;
        }
        System.out.println(maxSet);
        
        in.close();
    }
}