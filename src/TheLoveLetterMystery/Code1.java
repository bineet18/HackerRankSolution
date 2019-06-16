package TheLoveLetterMystery;

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
            int len = s.length();
            int changes = 0;
            
            for(int i=0,j=len-1;i<(len/2) && j>=(len/2);i++,j--)
            {
            	if(s.charAt(i)==s.charAt(j))
            	{continue;}
            	else
            	{
            		changes += Math.abs(s.charAt(i)-s.charAt(j));
            	}
            }
            System.out.println(changes);
        }

        scanner.close();
    }
}
