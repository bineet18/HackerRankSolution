package Candies;

import java.io.*;
import java.util.*;

public class Code3 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] arr = new int[n];
        int[] candies = new int[n];
        long TotalCandies = 0;
        for (int i = 0; i < n; i++) 
        {
        	arr[i]=(scanner.nextInt());
        	candies[i]=1;
        	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        }
        	        	
        	for(int i = 1 ; i < n  ;i++)
        	{
                if(arr[i] > arr[i-1])
                {
                	candies[i] = candies[i] + candies[i-1]; 
                }
            }

            for(int i = n-2 ; i >= 0 ; i--)
            {
                if(arr[i] > arr[i+1] && candies[i] <= candies[i+1])
                {
                	candies[i] = candies[i+1] + 1;
                }
            }

            for(int i = 0 ; i<n ; i++)
            { 
            	TotalCandies+=candies[i];
            }
        System.out.println(TotalCandies);
        scanner.close();
    }
}
