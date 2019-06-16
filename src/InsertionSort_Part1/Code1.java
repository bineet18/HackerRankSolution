package InsertionSort_Part1;

import java.util.*;

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
	        int Temp = arr[n-1];
	        
	        int i = n-2;
	        for(;i >= 0;i--)
	        {
	        	if(Temp < arr[i])
	        	{
	        		arr[i+1] = arr[i];
	        	}
	        	else if(Temp > arr[i])
	        	{
	        		break;
	        	}
	        	for(int j=0;j<n;j++)
	        	{
	        		System.out.print(arr[j] + " ");
	        	}
	        	System.out.println("");
	        }
	        
	        arr[i+1] = Temp;
	        for(int j=0;j<n;j++)
        	{
        		System.out.print(arr[j] + " ");
        	}
	        scanner.close();
	    }
}
