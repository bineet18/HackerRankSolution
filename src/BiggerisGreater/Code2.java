package BiggerisGreater;

import java.io.*;
import java.util.*;

public class Code2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) 
        {
            StringBuilder w = new StringBuilder(scanner.nextLine());
            
            TreeMap<Character, Integer> arr = new TreeMap<Character, Integer>();
            char pivot = 0;
            int pivotPosition = 0;
            char nextHigher = '*';
            
            System.out.println(w);
            
            if(w.length() == 1)
            {System.out.println("no answer"); continue;}
            
            for(int j= w.length()-1; j>=1; j--)
            {
            	
            	
            	if(!arr.containsKey(w.charAt(j)))
                {arr.put(w.charAt(j), 1);}
            	else
            	{arr.put(w.charAt(j), arr.get(w.charAt(j))+1);}
            	//System.out.println(arr);
                if(w.charAt(j-1) < w.charAt(j))
                {
                    pivot = w.charAt(j-1);
                    pivotPosition = j-1;

                    if(!arr.containsKey(pivot))
                    {arr.put(pivot, 1);}
                	else
                	{arr.put(pivot, arr.get(pivot)+1);}
                    
                    nextHigher = arr.higherKey(pivot);
                    
                    break;
                }
            }
            
            System.out.println(arr);
            System.out.println("Pivot Element -->"+ pivot);
            System.out.println("Pivot Position -->"+ pivotPosition);
            System.out.println("Next Higher -->"+ nextHigher);

            StringBuilder w1;
            //System.out.println("Remaining String -->"+ w1);

            if(nextHigher == '*')
            {System.out.println("no answer"); continue;}
            
            Object[] a = arr.keySet().toArray();
            
            if(pivotPosition !=0)
	        {
            	w1 = new StringBuilder(w.substring(0, pivotPosition));
            	System.out.println("Remaining String -->"+ w1);
            	for(int i= a.length-1; i >=0; i--)
	            {
	            	for(int j=0; j < arr.get(a[i]); j++)
	            	{
	            		w1.append(a[i]);
	            	}
	            }
        	}
            else
            {
            	w1 = new StringBuilder(Character.toString(nextHigher));
            	System.out.println("NextHigher Length -->"+ Character.toString(nextHigher).length());
            	if(nextHigher != '*')
            	{arr.put(nextHigher, arr.get(nextHigher)-1);}
            	System.out.println("Remaining String -->"+ w1);
            	for(int i= 0; i < a.length; i++)
	            {
	            	for(int j=0; j < arr.get(a[i]); j++)
	            	{
	            		w1.append(a[i]);
	            	}
	            }
            }
            
            //if(w.length() != w1.length())
            //{System.out.println("no answer"); continue;}
            
            System.out.println("Final String -->"+ w1);
            
            System.out.println("");
            
            
            /*
            
            
            
            if(pivotPosition !=0)
            {
                StringBuilder w1 = new StringBuilder(w.substring(0, pivotPosition));
                w1.append(nextHigher);
                Object[] a = arr.keySet().toArray();
                for(int k=0;k<a.length;k++)
                {
                    if((char)a[k] != nextHigher)
                    {w1.append(a[k]);}
                }
                System.out.println(w1);
            }
            else if(w.charAt(pivotPosition) < w.charAt(pivotPosition+1) && pivotPosition ==0)
            {
                StringBuilder w1 = new StringBuilder(Character.toString(nextHigher));
                Object[] a = arr.keySet().toArray();
                for(int k=0;k<a.length;k++)
                {
                    if((char)a[k] != nextHigher)
                    {w1.append(a[k]);}
                }
                System.out.println(w1);
            }
            else
            {System.out.println("no answer");}
            */
        }
        scanner.close();
    }
}
