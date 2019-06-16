package BiggerisGreater;

import java.io.*;
import java.util.*;

public class Code1 {
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
            char nextHigher = 0;
            for(int j= w.length()-1; j>=1; j--)
            {
                arr.put(w.charAt(j), j);
                if(w.charAt(j-1) < w.charAt(j))
                {
                    pivot = w.charAt(j-1);
                    pivotPosition = j-1;
                    arr.put(pivot, j-1);
                    nextHigher = arr.higherKey(pivot);
                    break;
                }
            }

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
            
        }
        scanner.close();
    }
}
