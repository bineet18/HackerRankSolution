package TheGridSearch;

import java.io.*;
import java.util.*;

public class Code2 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
        	int R = scanner.nextInt();
        	scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int C = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            //String[] G = new String[R];
            StringBuilder[] G = new StringBuilder[R];

            for (int i = 0; i < R; i++) 
            {
            	G[i] = new StringBuilder(scanner.nextLine());
            }
            int r = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            int c = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            StringBuilder[] P = new StringBuilder[r];
            ArrayList<Integer> FirstOccurance = new ArrayList<Integer>();
            ArrayList<ArrayList<Integer>> Index = new ArrayList<ArrayList<Integer>>();
            for (int i = 0; i < r; i++) 
            {
            	P[i] = new StringBuilder(scanner.nextLine());
            
            	for(int j=0; (j< R  && i ==0); j++)
            	{
            		if(G[j].toString().contains(P[i]))// If 1st column of P is in the G 
            		{
            			if(j == r-1)
            			{
            				//break;
            			}
            			
            			int index = G[j].toString().indexOf(P[i].toString());
            			while(index >= 0) {
            			    index = G[j].toString().indexOf(P[i].toString(), index+1);
                			if(index >=0)
                			{
	            			    FirstOccurance = new ArrayList<Integer>();
	                			FirstOccurance.add(j);
	                			FirstOccurance.add(G[j].toString().indexOf(P[i].toString()));
	                			Index.add(FirstOccurance);
                			}

            			}
            		}
            	}
            }
            System.out.println(Index);
            for(int i = 1; i< r; i++)
            {
            	for(int k = 0; k< Index.size(); k++)
            	{
        			int row = Index.get(k).get(0) + i;
            		int column = Index.get(k).get(1);
            		System.out.println(row+ "th row--> "+k+ " ----> "+ Index);
            		//if(!(G[row].toString().contains(P[i]))  && !((G[row].toString().indexOf(P[i].toString()) == column)))
            		if(!((G[row].toString().indexOf(P[i].toString()) == column)))
            		{
            			Index.remove(k);
            			k--;

            		}
            	}
            }
            System.out.println(Index);
           	if(Index.size() == 0)
            {System.out.println("NO");}
           	else
           	{System.out.println("YES");}
        }
        scanner.close();
    }
}
