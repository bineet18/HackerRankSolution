package ElectronicsShop;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Code1 {


    public static void main(String[] args) throws IOException 
    {
        Scanner in = new Scanner(System.in);
        
        int b = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboard = new int[n];
        int[] drive = new int[m];
        
        for(int i=0;i<n;i++)
        {keyboard[i] = in.nextInt();}
        for(int i=0;i<m;i++)
        {drive[i] = in.nextInt();}
        
        List<Integer> priceSUM = new ArrayList<Integer>();
                
        for(int i=0; i<n ;i++)
        {
        	for(int j=0; j<m ;j++)
        	{
        		priceSUM.add(keyboard[i] + drive[j]);
        	}
        }
        
        System.out.println(priceSUM);
        Collections.sort(priceSUM);
        System.out.println(priceSUM);
        
        int maxPrice = 0;
        
        for(int i =0; i<priceSUM.size();i++)
        {
        	if((i == 0) && (b < priceSUM.get(i)))
        	{
        		maxPrice = -1;
        		break;
        	}
        	else if(b >= priceSUM.get(i))
        	{
        		maxPrice = priceSUM.get(i);
        	}

        }
        
        System.out.println(maxPrice);
        
        in.close();
    }
}
