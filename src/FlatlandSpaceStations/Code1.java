package FlatlandSpaceStations;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] c = new int[m];
        int[] cityWithStation = new int[n];
        for (int i = 0; i < m; i++) 
        {
            c[i] = scanner.nextInt();
            cityWithStation[c[i]] = 1;
        }

        ArrayList<Integer> a = new ArrayList<Integer>();
        for(int i=0;i<n ;i++)
        {
        	int forwardDistance = n;
        	int backwardDistance = n;
        	int j=i;
        	int k=i;
        	for(;j>=0; j--)
        	{
        		if(cityWithStation[j]==1)
        		{
        			backwardDistance = (i-j);
        			break;
        		}
        	}
        	
        	for(;k<n;k++)
        	{
        		if(cityWithStation[k]==1)
        		{
        			forwardDistance = (k-i);
        			break;
        		}
        	}
    		a.add(Math.min(forwardDistance, backwardDistance));
        }
        System.out.println(Collections.max(a));

        scanner.close();
    }
}
