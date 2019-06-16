package TheFullCountingSort;

import java.io.*;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int[] counterArr = new int[100];
        int[] Intarr = new int[n];
        String[] Stringarr = new String[n];
        
        for (int i = 0; i < n; i++) {
            String[] xs = scanner.nextLine().split(" ");

            int x = Integer.parseInt(xs[0]);
            String s = xs[1];
            counterArr[x]++;
            Intarr[i] = x;
            if(i < (n/2))
            {Stringarr[i] = "-";}
            else
            {Stringarr[i] = s;}
            
        }
       
        
        for(int i = 0; (i < counterArr.length) && counterArr[i] != 0; i++)
        {
       		//if(counterArr[i] != 0)
       		{
       			int counter=0;
   				if(counter == counterArr[i])
   				{
   					continue;
   				}
       			for(int j = 0 ; j < n ;j++)
       			{

       				if(i != Intarr[j])
       				{continue;}
       				else if((i == Intarr[j]))
       				{
       					System.out.print(Stringarr[j]+" ");
       					counter++;
       				}
       				
       			}
       		}
        }
        scanner.close();
    }
}
