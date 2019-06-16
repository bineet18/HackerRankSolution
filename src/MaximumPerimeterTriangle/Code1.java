package MaximumPerimeterTriangle;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        ArrayList<Integer> sticks = new ArrayList<Integer>();
        
        for (int i = 0; i < n; i++) 
        {
            sticks.add(scanner.nextInt());
        }
        Collections.sort(sticks);
        
        ArrayList<Integer> temp;
        ArrayList<Integer> perimeter = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> sides = new ArrayList<ArrayList<Integer>>(); 
        
        for(int i=0;i <n; i++)
        {
        	for(int j=i+1; j<n; j++)
        	{
        		for(int k= j+1; k< n; k++)
        		{
        			if((sticks.get(i)+sticks.get(j) > sticks.get(k)) &&(sticks.get(k)+sticks.get(i) > sticks.get(j)) 
        					&& (sticks.get(j)+sticks.get(k) > sticks.get(i)))
        			{
        				temp = new ArrayList<Integer>();
	        			temp.add(sticks.get(i));
	        			temp.add(sticks.get(j));
	        			temp.add(sticks.get(k));
	        			sides.add(temp);
	        			perimeter.add(sticks.get(i)+sticks.get(j)+sticks.get(k));
        			}
        		}
        	}
        }
        if(perimeter.size() != 0)
	    {
	        int index = perimeter.indexOf(Collections.max(perimeter));
	        System.out.println(perimeter);
	        System.out.println(sides);
	        System.out.println(index);
	     	for(int i=0;i<3; i++)
        	{System.out.print(sides.get(index).get(i)+" ");}
	    }
        else
        {
        	System.out.print("-1");
        }
        scanner.close();
    }
}
