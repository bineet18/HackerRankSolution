package MinimumDistances;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Code1 {


    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        ArrayList<Integer> d;
        ArrayList<ArrayList<Integer>> d1 = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> d2 = new ArrayList<Integer>();
        for(int i = 0; i < n-1; i++)
        {
        	for(int j= i+1; j< n; j++)
        	{
        		d = new ArrayList<Integer>();
        		if(a[i] == a[j])
        		{
        			d.add(a[i]);
        			d.add(a[j]);
        			d.add(j-i);
        			d1.add(d);
        			d2.add(j-i);
        			break;
        		}
        	}
        }
        if(d2.size() == 0)
        {System.out.println("-1");}
        else
        {System.out.println(Collections.min(d2));}
        scanner.close();
    }
}
