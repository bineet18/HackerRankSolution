package FraudulentActivityNotifications;

import java.io.*;
import java.util.*;

public class Code3 
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
            	
            	ArrayList<Integer> medianArr1 = new ArrayList<Integer>();
            	TreeMap<Integer, Integer> medianArr = new  TreeMap<Integer, Integer>();
            	int count = 0;
            	
            	for(int j=d-1; j>=0 ;j--)
            	{
            		if(!medianArr.containsKey(expenditure[i-j-1]))
            		{medianArr.put(expenditure[i-j-1], 1);}
            		else
            		{medianArr.put(expenditure[i-j-1] , medianArr.get(expenditure[i-j-1])+1);}
            	}
            	System.out.println(medianArr);
            	Object[] obj = medianArr.keySet().toArray();
            	
            	for(int j=0;j < obj.length;j++)
            	{
            		for(int k=0 ; k < medianArr.get(obj[j]) ; k++,count+=1)
	            	{
            			System.out.println("Adding value: "+(int)(obj[j]));
            			medianArr1.add((int)(obj[j]));
            			System.out.println("Count: "+count);
            			if(count == d/2)
            			{
            				System.out.println("Found");
            				if(d%2 !=0)
                			{medianVal = medianArr1.get(medianArr1.size()-1);}
                			else
                			{
                				medianVal = (int) Math.ceil(((medianArr1.get(medianArr1.size()-1)
                						+ medianArr1.get(medianArr1.size()-1))/2));
                			}
                			break;
            			}
            		}
            		if(medianVal != 0)
            		{break;}
            			
            	}
            	
            	//for(int k=0; k<=d;k++)
            	//{System.out.print(medianArr1.get(k)+ " ");}
            	System.out.println(medianArr1);
            	if(expenditure[i] >= (2*medianVal))
            	{counter++;}
            }
        }
        System.out.println(counter);
        scanner.close();
    }
}
