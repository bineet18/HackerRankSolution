package MinimumAbsoluteDifferenceinanArray;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int min = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        for(int j=1; j< n;j++)
        {
        	min = Math.min(min, Math.abs(arr[j] - arr[j-1]));
        }
        
        System.out.println(min);
        scanner.close();
    }
}
