/**
 * Some error in the code below**/

package InsertionSort_Part2;

import java.util.*;

public class Code2 
{
    public static void main(String[] args) 
    {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) 
        {
            arr[i] = scanner.nextInt();
        }
        
        for(int i = 1; i < arr.length; i++)
        {
            int value = arr[i];
            int j = i - 1;
            while(j >= 0 && arr[j] > value)
            {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = value;
            
        	for(int k=0;k<n;k++)
        	{
        		System.out.print(arr[k] + " ");
        	}
        	System.out.println("");
        }        



        scanner.close();
    }
}
