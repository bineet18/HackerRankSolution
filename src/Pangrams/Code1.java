package Pangrams;

import java.io.*;
import java.util.*;

public class Code1 {


    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	String s = scanner.nextLine();
    	
    	int counter = 0;
    	
    	for(int i=97 ;i<=122; i++)
    	{
    		Character c = (char)i;
    		Character cUpperCase = Character.toUpperCase(c);
    		
    		if(s.contains(c.toString()) || s.contains(cUpperCase.toString()))
    		{
    			counter++;
    		}
    		else
    		{
    			counter = 0;
    			break;
    		}
    	}
		
		if(counter != 0)
		{System.out.println("pangram");}
		else
		{System.out.println("not pangram");}

        scanner.close();
    }
}
