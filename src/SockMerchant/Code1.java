package SockMerchant;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.HashMap;

public class Code1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //int n = in.nextInt();
        //int[] ar = new  int[n];
        
        
        //int[] ar = {10, 20, 20, 10, 10, 30, 50, 10, 20};
        int[] ar = {1, 1, 3, 1, 2, 1, 3, 3, 3, 3};
        int n = ar.length;
        
        
        List<List<Integer>> socsColor = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        for(int i=0; i < n; i++)
        {
        	//ar[i]= in.nextInt();
        	if(i==0)
        	{
        		temp = new ArrayList<Integer>();
        		temp.add(ar[i]);
        		temp.add(1);
        		socsColor.add(temp);
        	}
        	else
        	{
        		int UniqueNumber = 0;
        		for(int j = 0; j<socsColor.size(); j++)
        		{
        			if(ar[i]!=socsColor.get(j).get(0))
        			{
        				UniqueNumber++;
        			}
        			else if(ar[i]==socsColor.get(j).get(0))
        			{
        				//temp.add(socsColor.get(j).get(1) + 1);
        				//socsColor.set(j,temp);
        				socsColor.get(j).set(1, socsColor.get(j).get(1) + 1);
        				UniqueNumber = 0;
        				break;
        			}
        		}
        		
        		if(UniqueNumber != 0)
        		{
        			temp = new ArrayList<Integer>();
            		temp.add(ar[i]);
            		temp.add(1);
            		socsColor.add(temp);
            	}
        	}
        	
        	
        }
        System.out.println(socsColor);
        int matchingPairs = 0;
        
        for(int i = 0; i< socsColor.size(); i++)
        {
        	matchingPairs += (socsColor.get(i).get(1)/2);
        }
        
        System.out.println(matchingPairs);
        
        
        
        
        
       /* 
        
        
        
        
        HashMap inventory = new HashMap<Integer,Integer>();
        
        int matchingPairs = 0;
        
        for(int i=0; i < n; i++)
        {
            int color = in.nextInt();
            
            //This checks if we already have 1 sock of that color and if we do then we increment matchingPairs and set unmatched               //socks of that color back to 0
            if(inventory.containsKey(color) && inventory.get(color).equals(new Integer(1)))
            {
                inventory.put(color,0);
                matchingPairs++;
                continue;
            }
            inventory.put(color,1);
        }
        System.out.println(matchingPairs);
        */
    }
}