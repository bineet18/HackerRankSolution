package OrganizingContainersofBalls;

import java.io.*;
import java.util.*;

public class Code2 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int qItr = 0; qItr < q; qItr++) 
        {
            int n = scanner.nextInt();
            long[][] container = new long[n][n];
        	long[] SUM1 = new long[n];
        	long[] SUM2 = new long[n];
            for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    container[i][j] = scanner.nextLong();
                }
            }
            for(int i=0;i<n;i++)
            {
            	int counter = 0;
            	while(counter < n)
            	{
            		//if(counter != i)
            		{
            			SUM1[i] += container[counter][i];
            			SUM2[i] += container[i][counter];
            			
            		}
            		counter++;
            	}
            }
            Arrays.sort(SUM1);
            Arrays.sort(SUM2);
            
            for(int i=0;i<n;i++)
            {
            	System.out.print(SUM1[i]+" ");
            }
            System.out.println("");
            for(int i=0;i<n;i++)
            {
            	System.out.print(SUM2[i]+" ");
            }
            
            if(!Arrays.equals(SUM1, SUM2))
            {System.out.println("Impossible");}
            else
            {System.out.println("Possible");}
            
        }
        scanner.close();
    }
}
