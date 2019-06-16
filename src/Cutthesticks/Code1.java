package Cutthesticks;

import java.io.*;
import java.util.*;

public class Code1 {

	static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        
        List<Integer> Ar = new ArrayList<Integer>();
        List<Integer> ArTemp;

        for (int i = 0; i < n; i++)
        {
            Ar.add(scanner.nextInt());
        }

        for(int i=0;i<n; i++)
        {
        	System.out.println(Ar.size());
        	int min = Collections.min(Ar);
        	ArTemp = new ArrayList<Integer>();
        	for(int j=0;j<Ar.size();j++)
        	{
        		int temp = Ar.get(j);
        		Ar.set(j, temp - min);
        		
        		if(Ar.get(j) != 0)
        		{ArTemp.add(Ar.get(j));}
        	}
        	
        	Ar = new ArrayList<Integer>(ArTemp);
        	if(Ar.size() <= 1)
        	{
        		if(Ar.size() !=0)
        		{System.out.println(Ar.size());}
        		break;
        	}        	
        }
        
        scanner.close();
    }
}
