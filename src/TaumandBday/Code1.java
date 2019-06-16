package TaumandBday;

import java.io.*;
import java.util.*;

public class Code1 
{
	public static void main(String[] args) throws IOException 
	{
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < t; i++)
        {
            long b = scanner.nextInt();
            long w = scanner.nextInt();
            long bc = scanner.nextInt();
            long wc = scanner.nextInt();
            long z = scanner.nextInt();
            
            long TotalCost = 0;
            
            if(bc > (wc + z))
            {
            	TotalCost = (wc*(b + w)) + (z*b); 
            }
            else if(wc > (bc + z))
            {
            	TotalCost = (bc*(b + w)) + (z*w);
            }
            else
            {
            	long cost1, cost2, cost3;
            	cost1 = ((b*(wc + z)) + (w*wc));
            	cost2 = ((w*(bc + z)) + (b*bc));
            	cost3 = (b * bc) + (w * wc);
            	TotalCost = Math.min(cost1, Math.min(cost2, cost3));
            }
            
            System.out.println(TotalCost);
        }
        scanner.close();
    }
}