package TheBombermanGame;

import java.io.*;
import java.util.*;

public class Code5 
{
	static StringBuilder[] detonation(StringBuilder[] grid, int r, int c)
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
        for(int i=0; i< r && Time<=n; i++)
        {
            grid[i] = new StringBuilder(grid[i].toString().replace('3', '2'));
        }
        
        Time++; // Time increases
        
        //After t=2 second, he plant bombs at all places with value 4 seconds
        for(int i=0; i< r && Time <=n ; i++)
        {
        	grid[i] = new StringBuilder(grid[i].toString().replace('4', '3'));
        }
        for(int i=0; i< r  && Time <=n; i++)
        {
        	grid[i] = new StringBuilder(grid[i].toString().replace('2', '1'));
        }
        Time++;
        
        //After t=3 second, all bombs with 1 seconds will detonate
        for(int i=0; i< r && Time <=n; i++)// 3 seconds will become 2
        {
        	grid[i] = new StringBuilder(grid[i].toString().replace('3', '2'));
        }
        //all bombs with 1 seconds will detonate, hence replacing all 1s and its neighbours with 4s
        if(Time<=n)
        {grid = detonation(grid, r, c);}
        
        Time++;
        
        
        
        
        
        for(int t=Time;t<=n && (n%2 !=0); t++)
        {
        	//grid = detonation(grid, r, c);
            if(t%2 ==0)// Planting bombs
            {
            	//System.out.println(arr);
                for(int i=0; i< r; i++)
                {
                    //arr = new ArrayList<ArrayList<Integer>>(detonation(arr, r, c));
                	grid[i] = new StringBuilder(grid[i].toString().replace('2', '1'));
                	grid[i] = new StringBuilder(grid[i].toString().replace('3', '2'));
                	grid[i] = new StringBuilder(grid[i].toString().replace('4', '3'));// Planting bombs
                    //arr = new ArrayList<ArrayList<Integer>>(detonation(arr, r, c));
                 }
            }
            else if(t%2 != 0)
            {
            	grid = detonation(grid, r, c);
            	for(int i=0; i< r; i++)
                {
                    //arr = new ArrayList<ArrayList<Integer>>(detonation(arr, r, c));
            		grid[i] = new StringBuilder(grid[i].toString().replace('2', '1'));
            		grid[i] = new StringBuilder(grid[i].toString().replace('3', '2'));
                    //arr = new ArrayList<ArrayList<Integer>>(detonation(arr, r, c));
                 }

            }
        }
        
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
        }
        scanner.close();
    }
}
