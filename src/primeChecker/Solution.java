package primeChecker;

import java.io.*;
import java.util.*;
import java.lang.reflect.*;
import static java.lang.System.in;

class Prime
{
	public void checkPrime(int... n)
	{
		
		for(int i=0; i<n.length; i++)
		{
			boolean isPrime = true;
			if(n[i]<=1)
				isPrime = false;
			else if(n[i] == 2)
				isPrime = true;
			else if(n[i]%2 == 0)
				isPrime = false;
			else
			{
				for(int j=3; j <= n[i]/2 ; j++)
				{
					if(n[i]%j == 0)
					{isPrime = false; break;}
				}
			}

			if(isPrime == true)
			{System.out.print(n[i]+" ");}
		}
		System.out.println("");
	}
}



public class Solution {

	public static void main(String[] args) {
		try{
		
		BufferedReader br=new BufferedReader(new InputStreamReader(in));
		int n1=Integer.parseInt(br.readLine());
		int n2=Integer.parseInt(br.readLine());
		int n3=Integer.parseInt(br.readLine());
		int n4=Integer.parseInt(br.readLine());
		int n5=Integer.parseInt(br.readLine());
		Prime ob=new Prime();
		ob.checkPrime(n1);
		ob.checkPrime(n1,n2);
		ob.checkPrime(n1,n2,n3);
		ob.checkPrime(n1,n2,n3,n4,n5);	
		Method[] methods=Prime.class.getDeclaredMethods();
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
			System.out.println(e);
		}
	}
	
}

