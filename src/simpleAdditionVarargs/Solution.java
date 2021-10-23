package simpleAdditionVarargs;

import java.io.*;
import java.lang.reflect.*;
import java.util.*;

class Add
{
	public void add(int... n)
	{
		StringBuilder s = new StringBuilder();
		int sum = 0;
		
		for(int i:n)
		{
			sum +=i;
			s.append(String.valueOf(i));
			s.append("+");
		}
		
		s.replace(s.length()-1, s.length(), "=");
		s.append(sum);
		System.out.println(s);
	}
}


public class Solution {

    public static void main(String[] args) throws ClassNotFoundException {
       try{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
			int n1=Integer.parseInt(br.readLine());
			int n2=Integer.parseInt(br.readLine());
			int n3=Integer.parseInt(br.readLine());
			int n4=Integer.parseInt(br.readLine());
			int n5=Integer.parseInt(br.readLine());
			int n6=Integer.parseInt(br.readLine());
			Add ob=new Add();
			ob.add(n1,n2);
			ob.add(n1,n2,n3);
			ob.add(n1,n2,n3,n4,n5);	
			ob.add(n1,n2,n3,n4,n5,n6);
			Method[] methods=Add.class.getDeclaredMethods();
			Set<String> set=new HashSet<>();
			boolean overload=false;
			for(int i=0;i<methods.length;i++)
			{
				if(set.contains(methods[i].getName()))
				{
					overload=true;
					break;
				}
				set.add(methods[i].getName());
				
			}
			if(overload)
			{
				throw new Exception("Overloading not allowed");
			}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		
	
	

}

