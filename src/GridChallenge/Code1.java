package GridChallenge;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        StringBuilder sb = new StringBuilder();
        for (int tItr = 0; tItr < t; tItr++) 
        {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            ArrayList<String> grid = new ArrayList<String>();

            for (int i = 0; i < n; i++) 
            {
                sb = new StringBuilder(scanner.nextLine());
                for(int k = 1; k < sb.length(); k++)
                {
                    int value = sb.charAt(k);
                    int j = k - 1;
                    while(j >= 0 && sb.charAt(j) > value)
                    {
                    	sb.setCharAt(j+1, sb.charAt(j));
                        j = j - 1;
                    }
                    sb.setCharAt(j+1, (char)value);
                }   
            	grid.add(sb.toString());
            }
            System.out.println(grid);
            boolean des = true;
            for(int j=0; j< n; j++)
            {
            	for(int k=0; k< n-1; k++)
	            {
            		String a = grid.get(k);
                	String b = grid.get(k+1);
                	
            		if((int)a.charAt(j) > (int)b.charAt(j))
	            	{des = false; break;}
	            	else if((int)a.charAt(j) == (int)b.charAt(j))
	            	{continue;}
            		else if((int)a.charAt(j) < (int)b.charAt(j))
	            	{des = true;}
	            }
            	if(des == false)
            	{break;}
            }
            if(des == true)
            {System.out.println("YES");}
            else
            {System.out.println("NO");}
        }
        scanner.close();
    }
}