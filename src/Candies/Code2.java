package Candies;

import java.io.*;
import java.util.*;

public class Code2 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> candies = new ArrayList<Integer>();
        //int[] arr = new int[n];
        //int[] candies = new int[n];
        long TotalCandies = 0;
        for (int i = 0; i < n; i++) 
        {
        	arr.add(scanner.nextInt());
        	candies.add(1);
        	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        	        	
        	if(i !=0)
            {
            	if(arr.get(i) > arr.get(i-1))
            	{
            		candies.set(i, candies.get(i-1)+candies.get(i));
            	}
            	else if(arr.get(i) <= arr.get(i-1))
            	{
            		if(candies.get(i) == candies.get(i-1))
            		{candies.set(i-1,candies.get(i)+candies.get(i-1));}
            		else
            		{
            			candies.set(i,1);
            		}
            	}
            }
        	//System.out.println(arr);
            //System.out.println(candies);
            //System.out.println("");
        }
        for(int i=0; i<n; i++)
        {TotalCandies += candies.get(i);}
        System.out.println(TotalCandies);
        System.out.println(TotalCandies);
        System.out.println(TotalCandies);
        System.out.println(TotalCandies);
        System.out.println(TotalCandies);
        scanner.close();
    }
}
