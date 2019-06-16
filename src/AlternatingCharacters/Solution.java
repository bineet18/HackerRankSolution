package AlternatingCharacters;

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
            
            int num = 0;
            
            for(int i=0;i< s.length()-1;i++)
            {
            	if(s.charAt(i) == s.charAt(i+1))
            	{num++;}
            }
            System.out.println(num);
        }
        scanner.close();
    }
}
