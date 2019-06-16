package Quicksort1_Partition;

import java.io.*;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        int pivot = 0;
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }
        
        pivot = arr[0];
        
        for(int i=1;i<n;i++)
        {
        	if(arr[i] < pivot)
        	{
        		System.out.print(arr[i]+" ");
        	}
        }
        
        for(int i=0;i<n;i++)
        {
        	if(arr[i] == pivot)
        	{
        		System.out.print(arr[i]+" ");
        	}
        }
        
        for(int i=1;i<n;i++)
        {
        	if(arr[i] > pivot)
        	{
        		System.out.print(arr[i]+" ");
        	}
        }
        
        

        scanner.close();
    }
}
