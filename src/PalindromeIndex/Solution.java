package PalindromeIndex;

import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);
    	int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) 
        {
            StringBuilder s = new StringBuilder(scanner.nextLine());
            
            StringBuilder s1;
            StringBuilder s2;
            
            int len = s.length(); 
            int i,j;
            for(i=0, j=len-1; i<(len/2) && j>=(len/2);i++, j--)
            {
            	if(s.charAt(i)==s.charAt(j))
            	{continue;}
            	else
            	{break;}
            }
            
            if(s.charAt(i) == s.charAt(j))
            {
            	System.out.println("-1");
            	continue;
            }
            
            int palind1 = 1;
            int palind2 = 1;

            s1 = new StringBuilder(s.toString());
            s2 = new StringBuilder(s.toString());
            s1.deleteCharAt(i);
            s2.deleteCharAt(j);
            int len1 = s1.length();
            int len2 = s2.length();
            
            //System.out.println(s1);
            //System.out.println(s2);

            for(int k=0, l=len1-1; k<(len1/2) && l>=(len1/2);k++, l--)
            {
            	if(s1.charAt(k)==s1.charAt(l))
            	{continue;}
            	else
            	{palind1=0;break;}
            }
            
            for(int k=0, l=len2-1; k<(len2/2) && l>=(len2/2);k++, l--)
            {
            	if(s2.charAt(k)==s2.charAt(l))
            	{continue;}
            	else
            	{palind2=0;break;}
            }
            
            if(palind1==0 && palind2 ==0)
            {
            	System.out.println("-1");
            	continue;
            }
            else if(palind1 == 1)
            {System.out.println(i);}
            else if(palind2 == 1)
            {System.out.println(j);}
            //System.out.println(i+" --> "+j);
            //System.out.println(palind1+" --> "+palind2);
            //System.out.println("");
            //System.out.println("");
        }
        scanner.close();
    }
}
