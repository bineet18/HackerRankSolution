package TheHurdleRace;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Code1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException
    {

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] height = new int[n];

        String[] heightItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int heightItem = Integer.parseInt(heightItems[i]);
            height[i] = heightItem;
        }
        
        Arrays.sort(height);
        
        if((height[n-1] - k) >= 0)
        {
        	System.out.println(height[n-1] - k);
        }
        else
        {System.out.println("0");}


        scanner.close();
    }
}
