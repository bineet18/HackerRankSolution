package EqualizetheArray;

import java.io.*;
import java.util.*;

public class Code1 
{ 
    public static void main(String[] args) throws IOException 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        TreeMap<Integer,Integer> ArrayCount = new TreeMap<>();

        for (int i = 0; i < n; i++) 
        {
        	int temp = scanner.nextInt();
        	if(ArrayCount.containsKey(temp))
        		ArrayCount.put(temp, ArrayCount.get(temp)+1);
            else
            	ArrayCount.put(temp, 1);
        	
        }

        int maxValue = Collections.max(ArrayCount.values());

        System.out.println(n - maxValue);

        scanner.close();
    }
}
