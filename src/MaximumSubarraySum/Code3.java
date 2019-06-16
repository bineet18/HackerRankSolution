package MaximumSubarraySum;

import java.io.*;
import java.util.*;

public class Code3 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) 
        {
            int n = scanner.nextInt();
            long m = scanner.nextLong();
            long[] a = new long[n];
            
            for (int i = 0; i < n; i++) 
            {
                a[i] = scanner.nextLong();
            }
            long modSum = 0;
            long currentMaxSum = a[0];
            long globalMaxSum = a[0];
            for( int i=1; i<n; i++ )
            {
            	currentMaxSum = currentMaxSum + a[i];
                if (globalMaxSum < currentMaxSum)
                	globalMaxSum = currentMaxSum;
                if (currentMaxSum < 0)
                	currentMaxSum = 0;
                
            	if(modSum < (currentMaxSum % m))
        		{modSum = currentMaxSum % m;}
            }
            System.out.println(modSum);
        }
        scanner.close();
    }
}
