package ArrayManipulation;

import java.io.*;
import java.util.*;

public class Code1 
{
	public static void main(String[] args) throws IOException 
	{
		Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int m = in.nextInt();
        
        long[] arr = new long[n];
        
        for (int i = 0; i < m; i++) 
        {
        	int startingInd = in.nextInt();
        	int endInd = in.nextInt();
        	int k = in.nextInt();
        	
        	//System.out.println(startingInd);
        	//System.out.println(endInd);
        	
        	for(int j = (startingInd-1); j < endInd; j++)
        	{
        		arr[j] = arr[j]+k;
        	}
       	
        }
        //for(int k=0;k<n;k++)
        //{System.out.print(arr[k]+" ");}
        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
        in.close();
    }
}
