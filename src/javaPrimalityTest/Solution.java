package javaPrimalityTest;

import java.io.*;
import java.math.*;

public class Solution 
{
    public static void main(String[] args) throws IOException 
    {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        
        BigInteger b = new BigInteger(n);
        
        boolean isPrime = b.isProbablePrime(1);
        
        if(isPrime == true)
        	System.out.println("prime");
        else
        	System.out.println("not prime");
        
        bufferedReader.close();
    }
}
