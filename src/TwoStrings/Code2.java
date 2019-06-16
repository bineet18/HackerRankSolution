package TwoStrings;

import java.io.*;
import java.util.*;

public class Code2 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for(int i=0;i<n;i++)
        {
        	String s1 = scanner.nextLine();
        	String s2 = scanner.nextLine();
        	HashSet<Character> ss1 = new HashSet<Character>();
        	HashSet<Character> ss2 = new HashSet<Character>();
        	HashSet<Character> ssCommon = new HashSet<Character>();
        	
        	for(int j=0;j<s1.length();j++)
            {
        		if(!ss1.contains(s1.charAt(j)))
        		{ss1.add(s1.charAt(j));}  
            }
        	
        	for(int j=0;j<s2.length();j++)
            {
        		if(!ss2.contains(s2.charAt(j)))
        		{ss2.add(s2.charAt(j));}  
            }
        	
        	Object[] ss1o = ss1.toArray();
        	Object[] ss2o = ss2.toArray();
        	
        	for(int j=0;j< ss1.size(); j++)
        	{
        		for(int k=0;k< ss2.size(); k++)
        		{
        			if(ss1o[j] == ss2o[k])
        			{
        				if(!ssCommon.contains(ss1o[j]))
                		{ssCommon.add((Character) ss1o[j]);}  
        			}
        		}
        	}
        	
        	
        	System.out.println(ss1);
        	System.out.println(ss2);
        	System.out.println(ssCommon);
        	if(ssCommon.size() !=0)
        	{System.out.println("YES");}
        	else
        	{System.out.println("NO");}
        	
        }        
        scanner.close();
    }
}
