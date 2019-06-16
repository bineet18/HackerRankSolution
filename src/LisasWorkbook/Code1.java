package LisasWorkbook;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        int pageNum = 0;
        ArrayList<Integer> temp;
        ArrayList<ArrayList<Integer>> combination = new ArrayList<ArrayList<Integer>>();
        for (int i = 0; i < n; i++) 
        {
            pageNum++;
            arr[i] = scanner.nextInt();
            for(int j=1; j <= arr[i]; j++)
            {
        		if(j == pageNum)
        		{
	            	temp = new ArrayList<Integer>();
	        		temp.add(pageNum);
	        		temp.add(j);
	        		combination.add(temp);
        		}
        		
        		if(((j % k) == 0) && (j !=arr[i]))
            	{
                	pageNum++;
            	}
            }
        }
        
        System.out.println(combination);
        


        scanner.close();
    }
}
