package BeautifulTriplets;

import java.io.*;
import java.util.*;
/***
 * Its more optimized than Code1
 * */
public class Code2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int d = scanner.nextInt();
    	ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) 
        {
			arr.add(scanner.nextInt());
        }
        
        int TripletCounter = 0;
        for(int i=0; i < (arr.size()-1); i++)
        {
        	for(int j=i+1; j<arr.size(); j++)
        	{
        		if(arr.get(j) - arr.get(i) == d)
        		{
        			for(int k=j+1; ((k < arr.size())); k++)
        			{
        				if((arr.get(k) - arr.get(j) == d))
        				{
        					TripletCounter++;
        					break;
        				}
        			}
        			break;
        		}
        	}
        }
        System.out.println(TripletCounter);

        scanner.close();
    }
}
