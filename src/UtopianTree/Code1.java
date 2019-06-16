package UtopianTree;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Code1 {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] cycles = new int[t];
        int[] cycles1 = new int[t];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

        for (int i = 0; i < t; i++) 
        {
            int temp = scanner.nextInt();
            cycles[i] = temp;        
            cycles1[i] = temp;
        }
        Arrays.sort(cycles);
        
        int[] heights = new int[cycles[t-1] + 1];
        
        heights[0] = 1;
        
        map.put(0,1);
        for(int i = 1; i < heights.length; i++)
        {
            if(i%2 != 0)
            {heights[i] = 2*(heights[i-1]);}
            else
            {heights[i] = heights[i-1] + 1;}
            map.put(i,heights[i]);
            
        }
       
        for(int i = 0; i< cycles1.length;i++)
        {
            System.out.println(map.get(cycles1[i]));
        }

        scanner.close();
    }
}
