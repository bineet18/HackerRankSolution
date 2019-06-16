package SherlockandArray;

import java.io.*;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner in = new Scanner(System.in);
    	
    	int T = in.nextInt();
    	
    	for(int i=0;i<T;i++)
    	{
    		int n = in.nextInt();
    		ArrayList<Integer> arr = new ArrayList<Integer>();
    		for(int j=0;j<n;j++)
    		{
    			arr.add(in.nextInt());
    		}
    		//System.out.println(arr.size());
    		int result = 0;
    		if(n == 1)
    		{System.out.println("YES"); continue;}
    		
    		for(int j=0; j<n-1;j++)
    		{
    			int leftSum = 0;
    			int rightSum =0;
    			if(n == 1)
    			{result = 1; break;}
    			
    			for(int  k = 0; k< j; k++)
    			{leftSum += arr.get(k);}
    			
    			for(int k= j+1; k<n; k++)
    			{
    				rightSum += arr.get(k);
    				if(leftSum == rightSum)
        			{
    					result = 1; break;
    				}
    			}
    			
    			if(rightSum ==0)
    			{result = 1; break;}
    			if(leftSum == rightSum)
    			{result = 1; break;}
    		}
    		
    		if(result == 1)
    		{System.out.println("YES");}
    		else if(result == 0)
    		{System.out.println("NO");}
    	}
    in.close();
    }
}
