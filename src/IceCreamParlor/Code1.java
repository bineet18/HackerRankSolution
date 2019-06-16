package IceCreamParlor;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++)
        {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) 
            {
                arr[i] = scanner.nextInt();
            }
            ArrayList<ArrayList<Integer>> combo = new ArrayList<ArrayList<Integer>>();
            ArrayList<Integer> temp;
            
            for(int j=0; j< n; j++)
            {
            	for(int k=j+1;k<n;k++)
            	{
            		if(arr[j]+arr[k] == m)
            		{
	            		temp = new ArrayList<Integer>();
	            		temp.add(arr[j]);
	            		temp.add(arr[k]);
	            		temp.add(arr[j]+arr[k]);
	            		combo.add(temp);
	            		System.out.print((j+1) +" "+ (k+1));
	            		break;
            		}
            	}
            }
            System.out.println("");
        }
        scanner.close();
    }
}
