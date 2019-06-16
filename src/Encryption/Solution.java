package Encryption;

import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);
    	StringBuilder s = new StringBuilder(scanner.nextLine());
    	StringBuilder s1 = new StringBuilder(s.toString().replaceAll(" ", ""));
    	StringBuilder s2;
    	int rows = (int) Math.floor((Math.sqrt(s.length())));
    	int column = (int) Math.ceil((Math.sqrt(s.length())));
    	
    	while(rows*column < s1.length())
    	{
    		rows+=1;
    	}
    	
    	for(int i=0;i< column;i++)
    	{
    		s2 = new StringBuilder();
    		for(int j=i;j<s1.length();j+=column)
    		{
    			if(j >= s1.length())
    			{break;}
    			s2.append(s1.charAt(j));
    		}
    		System.out.print(s2+ " ");
    	}
        scanner.close();
    }
}
