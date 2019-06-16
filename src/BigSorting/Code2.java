package BigSorting;

import java.io.*;
import java.math.*;
import java.util.*;

public class Code2 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        
        TreeMap<BigInteger, Integer> arr = new TreeMap<BigInteger, Integer>();
        for (int i = 0; i < n; i++) {
        	
        	BigInteger unsortedItem = scanner.nextBigInteger();
            if(!arr.containsKey(unsortedItem))
            {arr.put(unsortedItem, 1);}
            else
            {arr.put(unsortedItem, arr.get(unsortedItem)+1);}

        }
        Object[] arObj = arr.keySet().toArray();
        
        for(int i=0;i<arr.size();i++)
        {
        	if(arr.get(arObj[i]) > 1)
        	{
        		for(int j=0;j< arr.get(arObj[i]);j++)
        		{
        			System.out.println(arObj[i]);
        		}
        	}
        	else
        	{System.out.println(arObj[i]);}
        }
        scanner.close();
    }
}
