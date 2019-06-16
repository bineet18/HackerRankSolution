package RepeatedString;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int NoOfAinSingleString = 0;
        for(int i=0; i<s.length(); i++)
        {
        	if(s.charAt(i) == 'a')
        	{NoOfAinSingleString++;}
        }
        System.out.println(NoOfAinSingleString);
        long NumOfRepetitions = (n/(long)s.length());
        System.out.println(NumOfRepetitions);
        long NoOfCharsRemaining = (n - (long)(NumOfRepetitions*s.length()));
        System.out.println(NoOfCharsRemaining);
        int NoOfAinSingleStringRemaining = 0;
        for(int i=0; i<NoOfCharsRemaining; i++)
        {
        	if(s.charAt(i) == 'a')
        	{NoOfAinSingleStringRemaining++;}
        }
        System.out.println((NoOfAinSingleString*NumOfRepetitions) + NoOfAinSingleStringRemaining);
        scanner.close();
    }
}
