package HackerRankinaString;

import java.io.*;
import java.util.*;

public class Code1 {
	public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        //int Counter = 0;
        String hackerRank = "hackerrank";

        for (int i = 0; i < q; i++) 
        {
        	String s = scanner.nextLine();
        	StringBuilder sb = new StringBuilder(s);
        	for(int j=0; (j< hackerRank.length() && sb.length() >= hackerRank.length()); j++)
        	{
        		int k=j;
        		while(hackerRank.charAt(j) != sb.charAt(k))
        		{
        			System.out.println(sb);
        			sb.deleteCharAt(k);
            		if(sb.length() < hackerRank.length())
            		{break;}
        		}
        		if(hackerRank.charAt(j) == sb.charAt(k))
        		{continue;}
        	}
        	System.out.println(sb);
        	if(sb.toString().equals(hackerRank) || sb.toString().contains(hackerRank))
        	{System.out.println("YES");}
        	else
        	{System.out.println("NO");}
        }
        

        scanner.close();
    }
}
