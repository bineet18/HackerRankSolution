package SequenceEquation;

import java.io.*;
import java.util.*;

public class Code1 
{
	private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException 
    {
        
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        TreeMap<Integer, Integer> P = new TreeMap<Integer, Integer>();

        for (int i = 0; i < n; i++) 
        {
            P.put(scanner.nextInt(), i+1);
        }
        
        for (int i = 0; i < n; i++) 
        {
            System.out.println(P.get(P.get(i+1)));
        }

        scanner.close();
    }
}
