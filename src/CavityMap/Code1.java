package CavityMap;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        StringBuilder[] sb = new StringBuilder[n];
        for (int i = 0; i < n; i++) 
        {
        	sb[i] = new StringBuilder("");
        	sb[i].append(scanner.nextLine());
        }
        
        for(int i = 1; i< n-1; i++)
        {
        	for(int j=1; j< n-1; j++)
        	{
        		int cell = Character.getNumericValue(sb[i].charAt(j));
        		int adU = Character.getNumericValue(sb[i-1].charAt(j));
        		int adB = Character.getNumericValue(sb[i+1].charAt(j));
        		int adL = Character.getNumericValue(sb[i].charAt(j-1));
        		int adR = Character.getNumericValue(sb[i].charAt(j+1));
        		if(adU < cell  && adB < cell && adL < cell && adR < cell)
        		{
        			sb[i].setCharAt(j, 'X');
        			
        		}
        	}
        }
        
        for (int i = 0; i < n; i++) 
        {
            System.out.print(sb[i]);
            System.out.println("");
        }
        scanner.close();
    }
}
