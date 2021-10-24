package javaAnagrams;

import java.util.Scanner;

public class Solution 
{
    static boolean isAnagram(String a, String b) 
    {
        
    	char[] sortedA = a.toLowerCase().toCharArray();
    	java.util.Arrays.sort(sortedA);
    	char[] sortedB = b.toLowerCase().toCharArray();
    	java.util.Arrays.sort(sortedB);
   	
    	return String.valueOf(sortedA).equals(String.valueOf(sortedB))?true:false;
    }

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

