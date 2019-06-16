package LisasWorkbook;

import java.io.*;
import java.util.*;

public class Code2 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        int pageNum = 0;
        int specialProblems = 0;
        for (int i = 0; i < n; i++) 
        {
            pageNum++;
            arr[i] = scanner.nextInt();
            for(int j=1; j <= arr[i]; j++)
            {
        		if(j == pageNum)
        		{
	        		specialProblems++;
        		}
        		
        		if(((j % k) == 0) && (j !=arr[i]))
            	{
                	pageNum++;
            	}
            }
        }
        
        System.out.println(specialProblems);
        scanner.close();
    }
}
