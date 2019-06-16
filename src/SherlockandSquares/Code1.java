package SherlockandSquares;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Code1 {

    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < q; i++) 
        {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            int aSqrt = (int) Math.sqrt((double)a);
            int bSqrt = (int) Math.sqrt((double)b);
            int squareCounter = 0;
            
            for(int j = aSqrt; j<= (bSqrt +1); j++)
            {
            	if(((j*j) >= a) && ((j*j) <= b))
            	{
            		squareCounter++;
            	}
            	
            }
            System.out.println(squareCounter);
        }
        scanner.close();
    }
}
