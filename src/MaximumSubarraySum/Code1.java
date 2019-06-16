package MaximumSubarraySum;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) 
        {
            int n = scanner.nextInt();
            long m = scanner.nextLong();
            ArrayList<Long> a = new ArrayList<Long>();
            long max = 0;
            
            for (int i = 0; i < n; i++) 
            {
                a.add(scanner.nextLong());
            }
            long modSum = 0;
            for( int i=0; i<n; i++ )
            {
                for( int j=i; j<n; j++ )
                {
                	long sum = 0;
                    for( int k=i; k<=j; k++ )
                    {
                    	sum+=a.get(k);
                    }
                    if(modSum < (sum % m))
            		{modSum = sum % m;}
                }
            }
            System.out.println(modSum);
        }
        scanner.close();
    }
}
