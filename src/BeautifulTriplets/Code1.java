package BeautifulTriplets;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
    	ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) 
        {
			arr.add(scanner.nextInt());
        }
        
        ArrayList<Integer> arr1;
        ArrayList<ArrayList<Integer>> Triplets = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0; i < (arr.size()-1); i++)
        {
        	for(int j=i+1; j<arr.size(); j++)
        	{
        		if(arr.get(j) - arr.get(i) == d)
        		{
                	arr1 = new ArrayList<Integer>();
            		arr1.add(arr.get(i));
            		arr1.add(arr.get(j));
        			for(int k=j+1; ((k < arr.size())); k++)
        			{
        				if((arr.get(k) - arr.get(j) == d))
        				{
        					arr1.add(arr.get(k));
        					Triplets.add(arr1);
        					break;
        				}
        			}
        			
        			break;
        		}

        	}

        }
        System.out.println(Triplets.size());

        scanner.close();
    }
}
