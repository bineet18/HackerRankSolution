package javaArraylist;

import java.util.*;

public class Solution 
{

	public static void main(String[] args) 
	{
		ArrayList<ArrayList<Integer>> arr1 = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> arr2;// = new ArrayList<Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for(int i=0; i<n; i++)
		{
			int n1 = sc.nextInt();
			arr2 = new ArrayList<Integer>();
			for(int j=0;j<n1;j++)
			{
				arr2.add(sc.nextInt());
			}
			arr1.add(arr2);
		}
		
		//System.out.println(arr1);
		int q = sc.nextInt();
		for(int i=0;i<q;i++)
		{
			int row = sc.nextInt()-1;
			int col = sc.nextInt()-1;
			
			  try 
			  {
				  System.out.println(arr1.get(row).get(col));
			  } 
			  catch(IndexOutOfBoundsException e) 
			  {System.out.println("ERROR!");}
			 
		}
	}

}
