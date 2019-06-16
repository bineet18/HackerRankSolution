package Candies;

import java.io.*;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        //ArrayList<Integer> arr = new ArrayList<Integer>();
        //ArrayList<Integer> candies = new ArrayList<Integer>();
        int[] arr = new int[n];
        int[] candies = new int[n];
        int TotalCandies = 0;
        for (int i = 0; i < n; i++) 
        {
        	arr[i]=scanner.nextInt();
        	//candies[i] = 1;
        	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        	        	
        	if(i==0)
        	{candies[i] = 1;}
        	if(i !=0)
            {
        		//candies[i] = candies[i-1];
            	if(arr[i] > arr[i-1])
            	{
            		candies[i] = candies[i-1]+1;
            	}
            	else if(arr[i] <= arr[i-1])
            	{
            		candies[i] = 1;
            		candies[i-1] = candies[i]+1;
            	}
            }
            System.out.print(arr[i]+"--->");
            System.out.print(candies[i]);
            System.out.println("");
            TotalCandies += candies[i];
        }

        for(int i=0; i< n; i++)
        {
        	System.out.print(arr[i]+" ");
        }
        System.out.println("");
        
        for(int i=0; i< n; i++)
        {
        	System.out.print(candies[i]+" ");
        }
        scanner.close();
    }
}
