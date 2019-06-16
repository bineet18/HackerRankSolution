package GemStones;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] arr = new String[n];
        int minLength = 101;
        int indexOfMinLength = 101;
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextLine();
            if(arr[i].length() < minLength)
            {
            	minLength = arr[i].length();
            	indexOfMinLength = i;
            }
        }
        String s = arr[indexOfMinLength];
        HashSet<Character> ss = new HashSet<Character>();
        for(int i=0;i<minLength;i++)
        {
        	int counter = 0;
        	for(int j=0;j<n;j++)
        	{
        		if(j == indexOfMinLength)
        		{continue;}
        		else if(arr[j].contains(Character.toString(s.charAt(i))))
        		{counter++;}
        		else
        		{counter = 0; break;}
        		//System.out.println(s.charAt(i));
        	}
        	if(counter != 0)
        	{
        		if(!ss.contains(s.charAt(i)))
        		{ss.add(s.charAt(i));}       		
        	}
        }
        System.out.println(ss.size());
        
        scanner.close();
    }
}
