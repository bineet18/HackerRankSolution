package TheMaximumSubarray;

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
            ArrayList<Integer> a = new ArrayList<Integer>();
            int SubSeq = 0;
            
            for (int i = 0; i < n; i++) 
            {
            	int ele = scanner.nextInt();
                a.add(ele);
                if(ele > 0)
                {
                	SubSeq += ele;
                }
            }
            if(SubSeq == 0)
            {
            	SubSeq = Collections.max(a);
            }
            
            int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
            
            for (int i = 0; i < n; i++)
            {
                max_ending_here = max_ending_here + a.get(i);
                if (max_so_far < max_ending_here)
                    max_so_far = max_ending_here;
                if (max_ending_here < 0)
                    max_ending_here = 0;
            }
            System.out.println(max_so_far+" "+SubSeq);
        }
        scanner.close();
    }
}
