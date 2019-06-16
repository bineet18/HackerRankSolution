package CountingSort2;

import java.io.*;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        int[] counterArr = new int[100];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
            counterArr[arr[i]]++;
        }
        
        for(int i = 0; i< counterArr.length; i++)
        {
       		if(counterArr[i] != 0)
       		{
       			//
       			for(int j = 0 ; j < counterArr[i] ;j++)
       			{
       				System.out.print(i+" ");
       			}
       		}
        }
        scanner.close();
    }
}
