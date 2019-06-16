package TheBombermanGame;

import java.io.*;
import java.util.*;

public class Code6 
{
	static StringBuilder[] detonation(StringBuilder[] grid, int r, int c, char initialVal, char finalVal, String d)
	{
		
		if(d.equals("DETONATE"))
		{
			for(int i=0; i<r;i++)
	        {
	            for(int j=0;j<c; j++)
	            {
	                if(grid[i].charAt(j) == '1')
	                {
	                    if(j-1 >= 0 && grid[i].charAt(j-1) !='1')
	                    {
	                        grid[i].setCharAt(j-1, '4');
	                    }
	                    if(j+1 < c && grid[i].charAt(j+1) !='1')
	                    {
	                    	grid[i].setCharAt(j+1, '4');
	                    }
	                    if(i-1 >= 0 && grid[i-1].charAt(j) !='1')
	                    {
	                    	grid[i-1].setCharAt(j, '4');
	                    }
	                    if(i+1 < r && grid[i+1].charAt(j) !='1')
	                    {
	                    	grid[i+1].setCharAt(j, '4');
	                    }
	                }
	            }
	            grid[i] = new StringBuilder(grid[i].toString().replace('1', '4'));
	        }
			return grid;
		}
		else
		{
			for(int i=0; i<r;i++)
	        {
	            for(int j=0;j<c; j++)
	            {
	            	if(grid[i].charAt(j) == initialVal)
	            	{grid[i].setCharAt(j, finalVal);}
	            }
	        }
			return grid;	        
		}
	}
	
	
	
	
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int r = scanner.nextInt();
        int c = scanner.nextInt();
        int n = scanner.nextInt();
        int Time = 1;
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        StringBuilder[] grid = new StringBuilder[r];

        for (int i = 0; i < r; i++) // Start of 1st second
        {
            String a = scanner.nextLine();
            grid[i] = new StringBuilder(a.replace('.', '4').replace('O', '3'));
        }        
        //After t=1 second, he doesn't do anything. So Bombs with 3 seconds becomes 2 seconds
        if(Time<=n)grid = detonation(grid, r, c, '3','2', "SET");
        Time++; // Time increases
        
        //After t=2 second, he plant bombs at all places with value 4 seconds
        if(Time<=n)
        {
        	grid = detonation(grid, r, c, '4','3', "SET");
        	grid = detonation(grid, r, c, '2','1', "SET");
        }
        Time++;
        
        //After t=3 second, all bombs with 1 seconds will detonate
        // 3 seconds will become 2
        if(Time<=n)grid = detonation(grid, r, c, '3','2', "SET");
        
        //all bombs with 1 seconds will detonate, hence replacing all 1s and its neighbours with 4s
        if(Time<=n)
        {grid = detonation(grid, r, c, '1','4', "DETONATE");}
        
        Time++;
        
        
        
        
        
        //for(int t=Time;t<=n && (n%2 !=0); t++)
        for(int t=Time;t<=n; t++)
        {
        	//grid = detonation(grid, r, c);
        	grid = detonation(grid, r, c, '2','1', "SET");
        	grid = detonation(grid, r, c, '3','2', "SET");
            if(t%2 ==0)// Planting bombs
            {
            	grid = detonation(grid, r, c, '4','3', "SET");// Planting bombs

            }
            else if(t%2 != 0)
            {
            	grid = detonation(grid, r, c, '1','4', "DETONATE");
            }
            for(int j=0;j<r;j++)
            {System.out.println(grid[j]);}
            System.out.println("");
        }
        /*
        if(n %2 !=0)
        {
	        for(int i=0;i<r;i++)
	        {
	        	grid[i] = new StringBuilder(grid[i].toString().replace('4', '.').replace('3', 'O')
	        			.replace('2', 'O').replace('1', 'O'));
	        	System.out.println(grid[i]);

	        }
        }
        
        if(n %2 ==0)
        {
	        for(int i=0;i<r;i++)
	        {
	        	//System.out.println(arr.get(i));
	        	grid[i] = new StringBuilder(grid[i].toString().replace('4', 'O').replace('3', 'O')
	        			.replace('2', 'O').replace('1', 'O'));
	            System.out.println(grid[i]);
	        }
        }*/
        scanner.close();
    }
}
