package SherlockandTheBeast;

import java.io.*;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) throws IOException 
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        
        for(int i=0; i< t; i++)
        {
        	int n = in.nextInt();
        	int NoOf5 = n - n%3;
        	int NoOf3 = (n - NoOf5);
        	
        	while(!(NoOf5%3 == 0 && NoOf3%5 ==0))
        	{
        		NoOf5--;
        		NoOf3++;
        		if(NoOf5 < 0 || NoOf3 > n)
        		{break;}
        	}
        	StringBuilder s = new StringBuilder();
        	if(NoOf5 < 0 || NoOf3 > n)
        	{System.out.println("-1");}
        	else
        	{
        		for(int j=0;j<NoOf5; j++)
        		{s.append("5");}
        		for(int j=0;j<NoOf3; j++)
        		{s.append("3");}
        		
        		System.out.println(s);
        	}
        }
        in.close();
    }
}
