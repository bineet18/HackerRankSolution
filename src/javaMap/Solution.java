package javaMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Solution {

	public static void main(String[] args) {
		
		Map<String, Integer> phonebook = new HashMap<String, Integer>();
		
		Scanner sc = new Scanner(System.in);
		
		int n =  sc.nextInt();
		sc.nextLine();
		
		for(int i=0;i<n;i++)
		{
			String name = sc.nextLine();
			int number = sc.nextInt(); 
			sc.nextLine();
			
			phonebook.put(name, number);
		}

		Set<String> s = phonebook.keySet();
		
		while(sc.hasNext())
		{
			String query = sc.nextLine();
			if(s.contains(query))
			{
				System.out.println(query+"="+phonebook.get(query));
			}
			else
				System.out.println("Not found");
		}
		sc.close();
	}

}
