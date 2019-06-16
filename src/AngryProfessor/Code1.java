package AngryProfessor;

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
        for(int i = 0; i < t; i++) 
        {
        	int n = scanner.nextInt();
        	int k = scanner.nextInt();
        	int StudentTimeCounter = 0;
        	
        	for(int j = 0; j < n; j++) 
            {
        		int studentTime = scanner.nextInt();
        		if(studentTime <= 0)
        		{
        			StudentTimeCounter ++;
        		}
            }
        	if(StudentTimeCounter >= k)
        	{System.out.println("NO");}
        	else
        	{System.out.println("YES");}
        }
        scanner.close();
    }
}
