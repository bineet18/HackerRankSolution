package AbsolutePermutation;

import java.io.*;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) 
        {
            int n = scanner.nextInt();
            int k = scanner.nextInt();
            
            int[] arr = new int[n];
            int ni1 = 0;
            int ni2 = 0;
            int flag = 1;
            
            for(int i=1; i<=n ; i++)
            {
            	
            	ni1 = i - k;
            	ni2 = i + k;
            	if(ni1 >=i)
            	{ni1 = Integer.MIN_VALUE;}
            	if(ni1 <=0)
            	{ni1 = Integer.MIN_VALUE;}
            	if(ni1 > n)
            	{ni1 = Integer.MIN_VALUE;}
            	
            	
            	if(ni2 <i)
            	{ni2 = Integer.MIN_VALUE;}
            	if(ni2 <=0)
            	{ni2 = Integer.MIN_VALUE;}
            	if(ni2 > n)
            	{ni2 = Integer.MIN_VALUE;}            	
            	if(Math.max(ni1, ni2) <=0)
            	{flag= 0; break;}
            	else
            	{
            		arr[i-1] = Math.max(ni1, ni2);
            	}
            }
            
            if(flag ==0)
            {System.out.println("-1"); continue;}
            else
            {
            	for(int i=0; i< n; i++)
            	{
            		System.out.print(arr[i]+" ");
            	}
            }
            System.out.println("");
        }
        scanner.close();
    }
}
