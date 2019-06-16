package OrganizingContainersofBalls;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int q = scanner.nextInt();
        for (int qItr = 0; qItr < q; qItr++) 
        {
            int n = scanner.nextInt();
            long[][] container = new long[n][n];
            long [] colorCount = new long[n];

            for (int i = 0; i < n; i++) 
            {
                for (int j = 0; j < n; j++) 
                {
                    container[i][j] = scanner.nextLong();
                    colorCount[j]+= container[i][j];
                }
                
            }
            for(int j=0;j<n;j++)
            {
            	System.out.print(colorCount[j]+" ");
            }
            System.out.println("");
            int decision = 0;
            for(int j=0;j<n-1;j++)
            {
            	if(colorCount[j] == colorCount[j+1])
            	{decision++;}
            	else
            	{decision = 0; break;}
            }
            
            if(decision == 0)
            {System.out.println("Impossible");}
            else
            {System.out.println("Possible");}
            
        }
        scanner.close();
    }
}
