package javaFactoryPattern;

import java.util.*;
import java.security.*;

interface Food 
{
	public String getType();
}

class Pizza implements Food 
{
	public String getType() 
	{
		return "Someone ordered a Fast Food!";
	}
	
	public void getABCD2()
	{
		System.out.println("Bye");
	}
}

class Cake implements Food 
{
	public String getType() 
	{
		return "Someone ordered a Dessert!";
	}
	
	public void getABCD()
	{
		System.out.println("Hi");
	}
}

class FoodFactory 
{
	public Food getFood(String order) 
	{
		if(order.equalsIgnoreCase("Pizza"))
		{return new Pizza();}
		else
		{return new Cake();}
	}
}

public class Solution {

	public static void main(String args[]) {
		Do_Not_Terminate.forbidExit();

		try {

			Scanner sc = new Scanner(System.in);
			// creating the factory
			FoodFactory foodFactory = new FoodFactory();

			// factory instantiates an object
			Food food = foodFactory.getFood(sc.nextLine());

			System.out.println("The factory returned " + food.getClass());
			System.out.println(food.getType());
			
			sc.close();
		} catch (Do_Not_Terminate.ExitTrappedException e) {
			System.out.println("Unsuccessful Termination!!");
		}
	}

}

class Do_Not_Terminate {

	public static class ExitTrappedException extends SecurityException {

		private static final long serialVersionUID = 1L;
	}

	public static void forbidExit() {
		final SecurityManager securityManager = new SecurityManager() {
			@Override
			public void checkPermission(Permission permission) {
				if (permission.getName().contains("exitVM")) {
					throw new ExitTrappedException();
				}
			}
		};
		System.setSecurityManager(securityManager);
	}
}