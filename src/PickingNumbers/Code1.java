
/**** Not Working ********/
package PickingNumbers;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Code1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] a = new int[n];
        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) 
        {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }
        */
    	int n = 6;
    	int[] a = {4,6,5,3,3,1};
        List<Integer> a1;
        List<List<Integer>> aFinal = new ArrayList<List<Integer>>();
        int[] sizeOfArray = new int[n];
        
        for(int i=0; i<n ; i++)
        {
        	a1 = new ArrayList<Integer>();
        	if(a[i] < 100)
        	{a1.add(a[i]);}
        	
        	for(int j=0;j <n; j++)
        	{
        		if((i == j) || (a[j] > 100))
        		{continue;}
        		if(Math.abs(a[i] - a[j]) <=1)
        		{
        			a1.add(a[j]);
        			a[j] = 101;
        		}
        	}
        	aFinal.add(a1);
        	sizeOfArray[i] = aFinal.get(i).size();
        }
        
        System.out.println(aFinal);
        Arrays.sort(sizeOfArray);
        System.out.println(sizeOfArray[n-1]);

        
        scanner.close();
    }
}
