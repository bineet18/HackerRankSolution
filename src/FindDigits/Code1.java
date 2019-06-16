package FindDigits;

import java.io.*;
import java.util.*;

public class Code1 
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        int t = scanner.nextInt();        
        String IntegerInStringFormat = "";

        for (int i = 0; i < t; i++) 
        {
            int n = scanner.nextInt();
            IntegerInStringFormat = Integer.toString(n);
            int NoOfDivisor = 0;
            for(int j=0; j<IntegerInStringFormat.length(); j++)
            {
            	int eachDigit = Integer.parseInt(Character.toString(IntegerInStringFormat.charAt(j)));
            	if(eachDigit != 0 && ((n % eachDigit) == 0))
            	{NoOfDivisor++;}
            }
            System.out.println(NoOfDivisor);
        }
        scanner.close();
    }
}
