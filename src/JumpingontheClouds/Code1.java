package JumpingontheClouds;

import java.io.*;
import java.util.*;

public class Code1 {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] c = new int[n];
        for (int i = 0; i < n; i++)
        {
            c[i] = scanner.nextInt();
        }
        int Steps = 0;
        
        for(int i=0; i<n-1; )
        {
        	if(i == n-2)
        	{
        		Steps++;
        		break; //Times out, if break is not used
        	}
        	else
        	{
        		if((c[i+1]) == 1)
        		{
        			Steps++;
        			i += 2;
        		}
        		else if(((c[i+1]) == 0) && ((c[i+2]) == 1))
        		{
        			Steps++;
        			i += 1;
        		}
        		else
        		{
        			Steps++;
        			i += 2;
        		}
        	}
        }
        
        System.out.println(Steps);


        scanner.close();
    }
}
