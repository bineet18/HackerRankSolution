package Anagram;

import java.io.*;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);
    	int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) 
        {
            StringBuilder s = new StringBuilder(scanner.nextLine());
            
            if(s.length() % 2 != 0)
            {System.out.println("-1"); continue;}
            
            StringBuilder s1 = new StringBuilder(s.substring(0, (s.length()/2)));
            StringBuilder s2 = new StringBuilder(s.substring((s.length()/2), s.length()));
            
            System.out.println(s1);
            System.out.println(s2);
            //System.out.println("");
            
            TreeMap<Character,Integer> arr1 = new TreeMap<Character, Integer>();
            TreeMap<Character,Integer> arr2 = new TreeMap<Character, Integer>();
            
            for(int i=0;i<s1.length();i++)
            {
            	if(!arr1.containsKey(s1.charAt(i)))
            	{arr1.put(s1.charAt(i), 1);}
            	else
            	{arr1.put(s1.charAt(i), arr1.get(s1.charAt(i))+1);}
            	
            	if(!arr2.containsKey(s2.charAt(i)))
            	{arr2.put(s2.charAt(i), 1);}
            	else
            	{arr2.put(s2.charAt(i), arr2.get(s2.charAt(i))+1);}
            	
            }
            
            System.out.println(arr1);
            System.out.println(arr2);
            
            
            Object[] obj = arr1.keySet().toArray();
            
            for(int i=0;i<arr1.size();i++)
            {
            	if(arr2.containsKey(obj[i]))
            	{
            		if(arr1.get(obj[i]) - arr2.get(obj[i]) == 0)
            		{arr2.remove(obj[i]);}
            		else
            		{
            			arr2.put((Character) obj[i], arr2.get(obj[i])-arr1.get(obj[i]));
            		}
            	}
            }
            
            System.out.println(arr2);
            
            int Changes = 0;
            if(arr2.size() == 0)
            {System.out.println("0"); continue;}
            else
            {
            	Object[] obj1 = arr2.values().toArray();
            	
            	
            	for(int i=0;i<obj1.length;i++)
            	{
            		Changes += (int)obj1[i];
            	}
            }
            System.out.println(Changes);
            System.out.println("");
            
            
            
            
            
            
        }
        scanner.close();
    }
}
