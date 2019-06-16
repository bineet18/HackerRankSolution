package SeparatetheNumbers;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Code1 {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < q; i++) 
        {
            StringBuilder s = new StringBuilder(scanner.nextLine());
            
            int result = 1;
            ArrayList<Integer> num = new ArrayList<Integer>();

            if(s.charAt(0) == '0')
            {result = 0;}
            

        }

        scanner.close();
    }
}
