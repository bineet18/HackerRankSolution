package TwoDArrayDS;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class TwoDArray 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);
        int[][] arr = new int[6][6];

        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> sum = new ArrayList<Integer>();
        
        for (int i = 0; i < 6; i++) 
        {
            for (int j = 0; j < 6; j++) 
            {
            	int a = scanner.nextInt();
            	arr[i][j] = a;
            	temp.add(a);
            }
            arr1.add(temp);
            temp = new ArrayList<Integer>();
        }
        
        //System.out.println(arr1);
        
        for(int i = 1; i < 5; i++)
        {
        	for(int j = 1; j < 5; j++)
        	{
        		sum.add(arr1.get(i).get(j) + arr1.get(i+1).get(j) + arr1.get(i-1).get(j) + arr1.get(i-1).get(j-1)
        				+ arr1.get(i+1).get(j+1) + arr1.get(i+1).get(j-1) + arr1.get(i-1).get(j+1));
        	}
        }
        
        System.out.println(Collections.max(sum));
        
        scanner.close();
    }
}
