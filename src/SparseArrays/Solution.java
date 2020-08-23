package SparseArrays;

import java.util.HashMap;
import java.util.Scanner;

public class Solution 
{
	public static void main(String[] args)
	{
		
		Scanner s = new Scanner(System.in);
		
		int m = s.nextInt();
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		for(int i=0;i<m;i++)
		{
			String temp = s.next();

			if(!map.containsKey(temp))
			{map.put(temp, 1);}
			else
			{map.put(temp, map.get(temp)+1);}
		}
		
		int n = s.nextInt();
		for(int i=0;i<n;i++)
		{
			String temp = s.next();
			Integer x = map.get(temp);
			
			if(x == null)
			{
				System.out.println(0);
			}
			else
			System.out.println(map.get(temp));
		}
		s.close();
		
	}
}
