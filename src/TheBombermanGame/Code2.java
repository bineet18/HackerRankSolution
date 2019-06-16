package TheBombermanGame;

import java.io.*;
import java.util.*;

public class Code2 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        ArrayList<ArrayList<Integer>> arr = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        //String[] grid = new String[r];

        for (int i = 0; i < r; i++) // Start of 1st second
        {
        	String a = scanner.nextLine();
        	temp = new ArrayList<Integer>();
        	for(int j=0;j<a.length();j++)
        	{
        		if(a.charAt(j) == '.')
        		temp.add(4);
        		else
        		temp.add(3);
        	}
        	arr.add(temp);
        }
        
        //System.out.println(arr);
        
        //After t=1 second, he doesn't do anything. So Bombs with 3 seconds becomes 2 seconds
        for(int i=0; i< arr.size(); i++)
        {
        	Collections.replaceAll(arr.get(i), 3, 2);
        }
        
        //After t=2 second, he plant bombs at all places with value 4 seconds
        for(int i=0; i< arr.size(); i++)
        {
        	Collections.replaceAll(arr.get(i), 4, 3);
        }
        for(int i=0; i< arr.size(); i++)
        {
        	Collections.replaceAll(arr.get(i), 2, 1);
        }
        
        //System.out.println(arr);
        //for(int i=0;i<arr.size();i++)
        //{System.out.println(arr.get(i));}
        
        //After t=3 second, all bombs with 1 seconds will detonate
        for(int i=0; i< arr.size(); i++)// 3 seconds will become 2
        {
        	Collections.replaceAll(arr.get(i), 3, 2);
        }
        //all bombs with 1 seconds will detonate, hence replacing all 1s with 4s
        for(int i=0; i<arr.size();i++)
        {
        	for(int j=0;j<arr.get(i).size(); j++)
        	{
        		if(arr.get(i).get(j) == 1)
        		{
	        		if(j-1 >= 0 && arr.get(i).get(j-1) !=1)
	        		{
	        			arr.get(i).set(j-1, 4);
	        		}
	        		if(j+1 < c && arr.get(i).get(j+1) !=1)
	        		{
	        			arr.get(i).set(j+1, 4);
	        		}
	        		if(i-1 >= 0 && arr.get(i-1).get(j) !=1)
	        		{
	        			arr.get(i-1).set(j, 4);
	        		}
	        		if(i+1 < r && arr.get(i+1).get(j) !=1)
	        		{
	        			arr.get(i+1).set(j, 4);
	        		}
        		}
        	}
        	Collections.replaceAll(arr.get(i), 1, 4);
        }
        
        
        
        
        //System.out.println("");
        
        
        
        //for(int i=0;i<arr.size();i++)
        //{System.out.println(arr.get(i));}
        
        
        
        
        
        int x=1;
        for(int t=4;t<n; t++)
        {
        	if(x%2 !=0)// Planting bombs
        	{
                for(int i=0; i< arr.size(); i++)
                {
                	Collections.replaceAll(arr.get(i), 2, 1);
                	Collections.replaceAll(arr.get(i), 3, 2);
                	Collections.replaceAll(arr.get(i), 4, 1);
                }
        	}
        	else
        	{
        		for(int i=0; i<arr.size();i++)
                {
                	for(int j=0;j<arr.get(i).size(); j++)
                	{
                		if(arr.get(i).get(j) == 1)
                		{
        	        		if(j-1 >= 0 && arr.get(i).get(j-1) !=1)
        	        		{
        	        			arr.get(i).set(j-1, 4);
        	        		}
        	        		if(j+1 < c && arr.get(i).get(j+1) !=1)
        	        		{
        	        			arr.get(i).set(j+1, 4);
        	        		}
        	        		if(i-1 >= 0 && arr.get(i-1).get(j) !=1)
        	        		{
        	        			arr.get(i-1).set(j, 4);
        	        		}
        	        		if(i+1 < r && arr.get(i+1).get(j) !=1)
        	        		{
        	        			arr.get(i+1).set(j, 4);
        	        		}
                		}
                	}
                	Collections.replaceAll(arr.get(i), 1, 4);
                }
        	}
        }
        
        for(int i=0;i<arr.size();i++)
        {
        	for(int j=0;j<arr.get(i).size();j++)
        	{
        		if(arr.get(i).get(j) != 4)
        			System.out.print("O");
        		else
        			System.out.print(".");
        	}
        	System.out.println("");
        }

        

        scanner.close();
    }
}
