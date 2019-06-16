package MaximumSubarraySum;

import java.io.*;
import java.util.*;

public class Code2 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) 
        {
            int n = scanner.nextInt();
            long m = scanner.nextLong();
            //ArrayList<Long> a = new ArrayList<Long>();\
            long[] a = new long[n];
            
            for (int i = 0; i < n; i++) 
            {
                a[i] = scanner.nextLong();
            }
            long modSum = 0;
            //Arrays.sort(a);
            for( int i=0; i<n; i++ )
            {
            	long nextSum = 0;
                for( int j=i; j<n; j++ )
                {
                	nextSum += a[j];
                	if(modSum < (nextSum % m))
            		{modSum = nextSum % m;}
                }
            }
            System.out.println(modSum);
        }
        scanner.close();
    }
}
