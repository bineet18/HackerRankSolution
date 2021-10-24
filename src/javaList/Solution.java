package javaList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution 
{

	public static void main(String[] args) 
	{
		List<Integer> list = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for(int i=0;i<n;i++)
		{
			list.add(sc.nextInt());
		}
		
		int q = sc.nextInt();
		for(int i=0;i<q;i++)
		{
			String query = sc.next();
			
			if(query.equals("Insert"))
			{
				int index = sc.nextInt();
				int element = sc.nextInt();
				
				list.add(index, element);			}
			else
			{
				int index = sc.nextInt();
				list.remove(index);
			}
		}
		
		for(int i=0; i<list.size(); i++)
		{System.out.print(list.get(i)+" ");}

	}

}
