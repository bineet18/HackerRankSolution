package BeautifulDaysattheMovies;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Code1 
{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int i = scanner.nextInt();
        int j = scanner.nextInt();
        int k = scanner.nextInt();
        int BeautifulDay = 0;
        for(int s=0; s < (j-i+1); s++)
        {
        	int OrigInt = i+s;
        	int reverseInt;
        	String orig = Integer.toString(OrigInt);
        	String rev = "";
        	for(int t=0; t< orig.length();t++)
        	{
        		rev += Character.toString(orig.charAt(orig.length() - t - 1));
        	}
        	reverseInt = Integer.parseInt(rev);
        	if((Math.abs(OrigInt - reverseInt))%k == 0)
        	{BeautifulDay++;}
        }
        System.out.println(BeautifulDay);
        scanner.close();
    }
}
