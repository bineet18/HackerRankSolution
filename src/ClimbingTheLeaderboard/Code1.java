package ClimbingTheLeaderboard;

import java.io.*;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
    	TreeMap<Integer,Integer> leaderBoard = new TreeMap<Integer,Integer>();
    	for(int i=0;i<n;i++)
    	{
    		int score = scanner.nextInt();
    		if(!leaderBoard.containsKey(score))
    		{ 
    			try 
    			{
    				if(leaderBoard.higherKey(score) == null)
    				{leaderBoard.put(score, 1);}
    				else
        			{
        				leaderBoard.put(score, leaderBoard.get(leaderBoard.higherKey(score)) + 1);
        			}
    			}
    			catch (NullPointerException e)
    			{}
    		}
    		
    		//System.out.println(leaderBoard);
    	}
    	
    	int m = scanner.nextInt();
    	for(int i=0;i<m;i++)
    	{
    		int alice = scanner.nextInt();
    		if(!leaderBoard.containsKey(alice))
    		{ 
    			try 
    			{
    				if(leaderBoard.higherKey(alice) == null)
    				{leaderBoard.put(alice, 1);}
    				else
        			{
        				leaderBoard.put(alice, leaderBoard.get(leaderBoard.higherKey(alice)) + 1);
        			}
    			}
    			catch (NullPointerException e)
    			{}
    		}
    		
    		System.out.println(leaderBoard.get(alice));
    	}
    	scanner.close();
    }
}
