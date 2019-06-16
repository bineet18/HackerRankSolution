package ArrayD;

import java.io.*;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = (n-1); i >=0 ; i--) 
        {             
             arr[i] = scanner.nextInt();
        }
        
        for(int i =0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
        scanner.close();
    }
}
