package BigSorting;

import java.io.*;
import java.math.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

       // int[] unsorted = new int[n];
        
        List<BigInteger> ar = new ArrayList<BigInteger>();
        for (int i = 0; i < n; i++) {
        	String unsortedItem = scanner.nextLine();
            ar.add(new BigInteger(unsortedItem));
        }
        Collections.sort(ar);
        
        for(int i=0;i < ar.size();i++)
        {System.out.println(ar.get(i));}
        scanner.close();
    }
}
