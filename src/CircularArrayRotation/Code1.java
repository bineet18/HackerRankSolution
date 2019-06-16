package CircularArrayRotation;

import java.io.*;
import java.util.*;

public class Code1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] aNew = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            aNew[i] = aItem;
        }
        
        for(int i=0; i < k; i++)
        {
        	for(int j=n-1; j >0; j--)
        	{
        		int temp = aNew[j];
        		aNew[j] = aNew[j - 1];
        		aNew[j - 1] = temp;
        	}
        }
        for (int i = 0; i < q; i++) 
        {
        	int queries = scanner.nextInt();
        	System.out.println(aNew[queries]);
        }

        scanner.close();
    }
}
