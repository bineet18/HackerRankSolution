package ClosestNumbers;

import java.io.*;
import java.util.*;

public class Code1 {

	

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
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
        }

        Map<Integer, List<List<Integer>>> temp = new HashMap<Integer, List<List<Integer>>>();
        List<Integer> val = new ArrayList<Integer>();
        List<List<Integer>> val1 = new ArrayList<List<Integer>>();
        
        for(int i=0;i<n-1;i++)
        {
        	int diff = Math.abs(arr[i] - arr[i+1]);
        	val = new ArrayList<Integer>();
        	val.add(arr[i]);
        	val.add(arr[i+1]);
        	val1 = new ArrayList<List<Integer>>();
        	val1.add(val);
        	if(!temp.containsKey(diff))
        	{
        		temp.put(diff, val1);
        	}
        	else
        	{
        		val1 = new ArrayList<List<Integer>>();
        		val1 = temp.get(diff);
        		val1.add(val);
        		temp.put(diff, val1);
        	}
        }
        Object[] a = temp.keySet().toArray();
        Arrays.sort(a);
        
        for(int i=0;i<temp.get(a[0]).size();i++)
        {
        	for(int j=0;j<temp.get(a[0]).get(i).size();j++)
        		System.out.print(temp.get(a[0]).get(i).get(j)+" ");
        }
        
        scanner.close();
    }
}
