package ServiceLane;

import java.io.*;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
        int t = scanner.nextInt();

        int[] width = new int[n];

        for (int i = 0; i < n; i++) 
        {
            width[i] = scanner.nextInt();
        }
        
        ArrayList<Integer> ServiceLane;
        for (int i = 0; i < t; i++) 
        {
        	int entry = scanner.nextInt();
        	int exit = scanner.nextInt();
        	ServiceLane = new ArrayList<Integer>();        	
        	for(int j= entry ; j<=exit; j++)
        	{
        		ServiceLane.add(width[j]);
        	}
        	System.out.println(Collections.min(ServiceLane));
        }

        scanner.close();
    }
}
