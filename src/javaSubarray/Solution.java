package javaSubarray;

import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
    	Scanner sc = new Scanner(System.in);
    	
    	int n = sc.nextInt();
    	int[] arr = new int[n];
    	
    	for(int i=0;i<n;i++)
    	{arr[i] = sc.nextInt();}
    	
    	int counter = 0;
    	for(int i = 0; i<n ;i++)
    	{
    		int sum1 = 0;
    		for(int j=i;j>=0;j--)
        	{
    			sum1 += arr[j];
    			
    			if(sum1 < 0)
    			{counter++;}
    			
    			
        	}
    		
    		int sum2 = 0;
    		for(int j=i;j<n;j++)
        	{
    			sum2 += arr[j];
    			
    			if(sum2 < 0)
    			{counter++;}
    			
    			
        	}
    	}
    	
    	System.out.println(counter/2);
    	sc.close();
    }
}