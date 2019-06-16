package ViralAdvertising;

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

    public static void main(String[] args) throws IOException
    {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        List<Integer> eachDayData = new ArrayList<Integer>();
        List<List<Integer>> AllData = new ArrayList<List<Integer>>();
        
        eachDayData.add(1);
        eachDayData.add(5);
        eachDayData.add(2);
        eachDayData.add(2);
        AllData.add(eachDayData);

        for(int i = 1; i< n ; i++)
        {
        	eachDayData = new ArrayList<Integer>();
        	eachDayData.add(i+1);
        	int Shared = (int) ((Math.floor(AllData.get(i-1).get(1)/2)) * 3);
        	eachDayData.add(Shared);
        	int liked = (int)(Math.floor(((double)Shared)/2));
        	eachDayData.add(liked);
        	int cumulativeLikes = AllData.get(i-1).get(3) + liked;
        	eachDayData.add(cumulativeLikes);
        	
        	AllData.add(eachDayData);
        }
        System.out.println(AllData.get(n-1).get(3));
        scanner.close();
    }
}
