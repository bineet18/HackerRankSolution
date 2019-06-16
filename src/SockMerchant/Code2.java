package SockMerchant;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;

public class Code2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        //int[] ar = new  int[n];
        
        
        int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        //int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int n = ar.length;
        
        
        
        Map<Integer, Integer> inventory = new HashMap<Integer,Integer>();
        
        for(int i=0; i < n; i++)
        {
        	//ar[i]= in.nextInt();
        	
        	if(inventory.containsKey(ar[i]))
        	{
        		inventory.put(ar[i], inventory.get(ar[i]) + 1);
        	}
        	else
        	{inventory.put(ar[i],1);}
        }
        System.out.println(inventory);
        System.out.println(inventory.size());
        
        //System.out.println(socs);
        int matchingPairs = 0;
        for (Integer key : inventory.keySet()) 
        {
            Integer value = inventory.get(key);
            matchingPairs += (value/2);
            
        }

        System.out.println(matchingPairs);
        

    }
}