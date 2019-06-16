package MinimumDistances;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Code2 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        
        ArrayList<Integer> d2 = new ArrayList<Integer>();
        for(int i = 0; i < n-1; i++)
        {
        	for(int j= i+1; j< n; j++)
        	{
        		if(a[i] == a[j])
        		{
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
