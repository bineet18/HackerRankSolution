package BiggerisGreater;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) 
        {
            StringBuilder w = new StringBuilder(scanner.nextLine());
            StringBuilder w1;
            
            TreeMap<Character, Integer> arr = new TreeMap<Character, Integer>();
            char pivot = 0;
            char nextHigher = '*';
            int pivotPosition = 0;
            if(w.length() == 1)
            {System.out.println("no answer"); continue;}
            
            for(int j= w.length()-1; j>=1; j--)
            {
                if(!arr.containsKey(w.charAt(j)))
                {arr.put(w.charAt(j), 1);}
                else
                {arr.put(w.charAt(j), arr.get(w.charAt(j))+1);}
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
            if(nextHigher == '*')
            {System.out.println("no answer"); continue;}
            
            
            w1 = new StringBuilder(w.substring(0, pivotPosition));
            Object[] a = arr.keySet().toArray();
               w1.append(nextHigher);
                if(nextHigher != '*')
                {arr.put(nextHigher, arr.get(nextHigher)-1);}
                for(int i= 0; i < a.length; i++)
                {
                    for(int j=0; j < arr.get(a[i]); j++)
                    {
                        w1.append(a[i]);
                    }
                }
            System.out.println(w1);
        }
        scanner.close();
    }
}
