package InsertionSort_Part2;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Code1 
{
    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }
        
        for(int i=0;i<n;i++)
        {
        	int Temp = arr[i];
        	int j=i-1;
        	for(;j>=0;j--)
        	{
        		if(arr[j] == Temp)
        		{break;}
        		else if(Temp < arr[j])
        		{
        			arr[j+1] = arr[j];
        		}
        		else if(Temp > arr[j])
	        	{
	        		break;
	        	}
        	}
        	arr[j+1] = Temp;
        	if(i !=0)
        	{
	        	for(int k=0;k<n;k++)
	        	{
	        		System.out.print(arr[k] + " ");
	        	}
	        	System.out.println("");
        	}
        }
        
    	for(int k=0;k<n;k++)
    	{
    		System.out.print(arr[k] + " ");
    	}
    	System.out.println("");


        scanner.close();
    }
}
