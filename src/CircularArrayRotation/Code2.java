package CircularArrayRotation;

import java.io.*;
import java.util.*;

public class Code2 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<Integer> arr = new ArrayList<Integer>();
        
        //int[] aNew = new int[n];
        for (int i = 0; i < n; i++) {
            //aNew[i] = scanner.nextInt();
        	arr.add(scanner.nextInt());
        }
        
        Collections.rotate(arr, k);
        //System.out.println(arr);
        for (int i = 0; i < q; i++) 
        {
        	int queries = scanner.nextInt();
        	System.out.println(arr.get(queries));
        }

        scanner.close();
    }
}
