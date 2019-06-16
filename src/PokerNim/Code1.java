package PokerNim;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        for (int tItr = 0; tItr < t; tItr++) 
        {
            int n = scanner.nextInt();
            int k = scanner.nextInt();

            int[] c = new int[n];
            int sum = 0;
            for (int i = 0; i < n; i++) 
            {  
                c[i] = scanner.nextInt();
                sum+= c[i];
            }
            
            if(sum % 2 ==0)
            {System.out.println("First");}
            else
            {System.out.println("Second");}
        }
        scanner.close();
    }
}
