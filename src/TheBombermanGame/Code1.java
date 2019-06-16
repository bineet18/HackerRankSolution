package TheBombermanGame;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        //String[] grid = new String[r];

        for (int i = 0; i < r; i++) // Start of 1st second
        {
        	String a = scanner.nextLine();
        	for(int j=0;j<a.length();j++)
        	{
        		if(a.charAt(j) == '.')
        		arr.add(4);
        		else
        		arr.add(3);
        	}
        }
        
        System.out.println(arr);
        
        //Start of 2nd second, he doesn't do anything. So Bombs with 3 seconds becomes 2 seconds
        Collections.replaceAll(arr, 3, 2);
        
        //Start of 3rd second, he plant bombs at all places with value 4 seconds
        Collections.replaceAll(arr, 4, 3);
        Collections.replaceAll(arr, 2, 1);
        
        System.out.println(arr);
        
        //Start of 4th second, all bombs will detonate
        Collections.replaceAll(arr, 3, 2);// 3 seconds will become 2
        System.out.println(arr.size());
        
        for(int i=0; i< arr.size(); i++)
        {
        	{System.out.print(arr.get(i));}

        	if((i+1)%c == 0)
        	System.out.println("");
        }
        
        int row = 0;
        int column = 0;
        for(int i=0;i<arr.size();i++)
        {
        	if(arr.get(i) == 1)
        	{
        		arr.set(i, 4);
        		
        		
        	
        	}
        	column++;	
        	if((column+1)%c == 0)
        	{
        		column = 0;
        		row++;
        	}
        }
        
        
        
        

        scanner.close();
    }
}
