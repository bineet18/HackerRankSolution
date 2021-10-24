package javaStringCompare;

import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "zzzz";
        String largest = "a";
        
        if(k!=s.length())
        {
            for(int i = 0; (i+k) <= s.length(); i++)
            {
            	String temp = s.substring(i, i+k);
            	if(temp.compareTo(smallest) < 0)
            	{smallest = temp;}
            }
            
            for(int i = 0; (i+k) <= s.length(); i++)
            {
            	String temp = s.substring(i, i+k);
            	if(temp.compareTo(largest) > 0)
            	{largest = temp;}
            }
        }
        else
        {
        	smallest = s;
        	largest = s;
        }

        
        return smallest + "\n" + largest;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();
      
        System.out.println(getSmallestAndLargest(s, k));
    }
}