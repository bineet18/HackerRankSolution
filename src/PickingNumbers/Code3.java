/*******
 * Correct code 
 *******/

package PickingNumbers;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Code3{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*int n = in.nextInt();
        Map<Integer,Integer> Elements = new HashMap<>();
        for(int i=0; i < n; i++){
            int num = in.nextInt();
            if(Elements.containsKey(num))
            	Elements.put(num, Elements.get(num)+1);
            else
            	Elements.put(num, 1);
            
        }
        
        */

        Map<Integer,Integer> treeMap = new TreeMap<Integer,Integer>();
        int n = 100;
        int[] ar = {4,97,5,97,97,4,97,4,97,97,97,97,4,4,5,5,97,5,97,99,4,97,5,97,97,97,5,5,97,4,5,97,97,5,97,4,97,5,4,4,97,5,5,5,4,97,97,4,97,5,4,4,97,97,97,5,5,97,4,97,97,5,4,97,97,4,97,97,97,5,4,4,97,4,4,97,5,97,97,97,97,4,97,5,97,5,4,97,4,5,97,97,5,97,5,97,5,97,97,97};
        
        
        for(int i=0; i < n; i++){
            if(treeMap.containsKey(ar[i]))
            	treeMap.put(ar[i], treeMap.get(ar[i])+1);
            else
            	treeMap.put(ar[i], 1);
            
        }
        
        //Map<Integer,Integer> treeMap = new TreeMap<Integer,Integer>(Elements);
        
        int max = 0;
        Object[] a = treeMap.keySet().toArray();
        int leftset, rightset;

        System.out.println(treeMap);
        System.out.println(treeMap.keySet());
        
        for(int i=0; i< a.length; i++)
        {
        	leftset = 0;
        	rightset = 0;

        	if(i > 0)
            {
            	if(Math.abs(((int)a[i] - (int)a[i-1])) <= 1)
            	{
            		leftset = treeMap.get((int)a[i]) + treeMap.get((int)a[i-1]);
            	}
            }
            else
            {
            	leftset = treeMap.get((int)a[i]);
            }
            
            if(i < (a.length)-1)
            {
            	if(Math.abs(((int)a[i] - (int)a[i+1])) <= 1)
            	{rightset =  treeMap.get((int)a[i]) + treeMap.get((int)a[i+1]);}
            }
            else
            {
            	rightset = treeMap.get((int)a[i]);
            }
            
            
            if(leftset > max)
            	max = leftset;
            if(rightset > max)
            	max = rightset;
        }
        System.out.println(max);
        
        in.close();
    }
}