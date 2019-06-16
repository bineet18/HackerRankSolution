package FraudulentActivityNotifications;

import java.io.*;
import java.util.*;

public class Code2 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int d = scanner.nextInt();

        int[] expenditure = new int[n];

        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int counter  = 0;
        
        for (int i = 0; i < n; i++) 
        {
            expenditure[i] = scanner.nextInt();
            int medianVal = 0;
            
            if(i >= d)
            {
            	int midIndex = d/2;
            	System.out.println("i, Mid Value --> "+ i+" , "+ midIndex);
            	
            	//int[] medianArr = new int[d];
            	ArrayList<Integer> medianArr = new ArrayList<Integer>();

            	for(int j=d-1; j>=0 ;j--)
            	{
            		medianArr.add(expenditure[i-j-1]);
            	}
            	
            	Collections.sort(medianArr);
            	for(int k=0; k<d;k++)
            	{System.out.print(medianArr.get(k)+ " ");}
            	
            	if(d%2 !=0)
            	{	         	
            		medianVal = medianArr.get(midIndex);
            		System.out.println("Median value --> "+medianVal);   
            	}
            	else
            	{
            		medianVal = ((medianArr.get(midIndex) + medianArr.get(midIndex-1))/2)+1;
            		System.out.println("Median value --> "+medianVal);   
            	}
            	
            	if(expenditure[i] >= (2*medianVal))
            	{counter++;}
            }
            
        }
        
        
        System.out.println(counter);
        
        

        scanner.close();
    }
}
