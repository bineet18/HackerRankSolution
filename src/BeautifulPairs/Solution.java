package BeautifulPairs;

import java.io.*;
import java.util.*;

public class Solution
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        Set<Integer> arr1 = new HashSet<Integer>();
        Set<Integer> arr2 = new HashSet<Integer>();
        Set<Integer> arr3 = new HashSet<Integer>();
        int[] A = new int[n];
        int[] B = new int[n];

        for (int i = 0; i < n; i++) 
        {
            A[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) 
        {
        	int a = scanner.nextInt();
        	B[i] = a;
        	for(int j=0;j<n;j++)
        	{
        		//System.out.println("Object: "+obj[j]);
        		if(a == A[j])
        		{

        			int val = (j*n) + i;
        			if(!arr1.contains(i) && !arr2.contains(j))
        			{
        				arr1.add(i);
        				arr2.add(j);
        				arr3.add(val);
        			}
        		}
        	}
        }

        for(int i=0;i<n;i++)
        {
        	//arr3.add(arr1.get(i)*n + arr2.get(i));
        }
        
        System.out.println(arr1.size());
        System.out.println(arr2.size());
        System.out.println(arr3.size());
        if (arr3.size() == n) 
        {
        	System.out.println(arr3.size()-1);
        } 
        else 
        {
        	System.out.println(arr3.size()+1);
        }
        
        System.out.println(Math.min(arr1.size(), arr2.size()));
        scanner.close();
    }
}
