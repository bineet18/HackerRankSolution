package LargestPermutation;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
        int k = scanner.nextInt();
        
        ArrayList<Integer> arr1 = new ArrayList<Integer>();
        ArrayList<Integer> farray = new ArrayList<Integer>();

        for (int i = 0; i < n; i++) 
        {
        	arr1.add(scanner.nextInt());
        }
        
        int max = Collections.max(arr1);
        
        for(int i=0; i<k;i++)
        {
        	if(max != arr1.get(0))
        	{
        		//System.out.println(arr1+" and max is: "+ max);
        		int maxIndex = arr1.indexOf(max);
        		int temp = arr1.get(0);
        		arr1.set(0, max);
        		arr1.set(maxIndex, temp);
        		farray.add(max);
        		arr1.remove(0);
        		max = Collections.max(arr1);
        		//System.out.println(arr1+" and max is: "+ max+" and Size  is: "+arr1.size()+" and Final array is: "+farray);
        		
        	}
        	if(max == arr1.get(0))
        	{
        		if(arr1.size() !=1)
            	{
        			max = Collections.max(arr1);
        			farray.add(max);
        			arr1.remove(0);
            		max = Collections.max(arr1);
            		i--;
            	}
        		
        		
        	}//System.out.println("Hi");}

        	
        	
        }
        farray.addAll(arr1);
        
        for(int i=0; i<farray.size();i++)
        System.out.print(farray.get(i)+" ");

        scanner.close();
    }
}
