package UtopianTree;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Code2 
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
    	int t = scanner.nextInt();
        for (int i = 0; i < t; i++) 
        {
        	int temp = scanner.nextInt();
            
        	if((temp % 2) == 0)
        	{
        		System.out.println((int)((2 * Math.pow(2,temp/2)) - 1));
        	}
        	else
        	{
        		System.out.println((int)(2* ((2 * Math.pow(2,(int)temp/2)) - 1)));
        	}
        }

        scanner.close();
    }
}
