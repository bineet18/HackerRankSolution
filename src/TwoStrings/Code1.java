package TwoStrings;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i=0;i<n;i++)
        {
        	String s1 = scanner.nextLine();
        	String s2 = scanner.nextLine();
        	HashSet<Character> ss = new HashSet<Character>();
        	
            for(int j=0;j<s1.length();j++)
            {
            	int counter = 0;
            	for(int k=0;k<s2.length();k++)
            	{
            		if(s2.contains(Character.toString(s1.charAt(j))))
            		{counter++;}
            		else
            		{counter = 0; break;}
            	}
            	if(counter != 0)
            	{
            		if(!ss.contains(s1.charAt(j)))
            		{ss.add(s1.charAt(j));}       		
            	}
            }        	
        	if(ss.size() !=0)
        	{System.out.println("YES");}
        	else
        	{System.out.println("NO");}
        }        
        scanner.close();
    }
}
