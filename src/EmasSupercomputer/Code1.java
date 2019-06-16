package EmasSupercomputer;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        StringBuilder[] grid = new StringBuilder[n];

        for (int i = 0; i < n; i++) 
        {
            grid[i] = new StringBuilder(scanner.nextLine());
        }

        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=1; i<n-1; i++)
        {

        	for(int j=1; j<m-1;j++)
            {
                int plusCounter = 0;
        		if(grid[i].charAt(j) == 'G')
                {
        			plusCounter+=1;
                    if((grid[i].charAt(j-1) == 'G')&&(grid[i].charAt(j+1) == 'G')&&(grid[i-1].charAt(j) == 'G')
                            &&(grid[i+1].charAt(j) == 'G'))
                    {
                        
                        //System.out.println(plusCounter + " at: "+ i+" "+j);
                        
                        //grid[i].setCharAt(j, 'X');
                        for(int w=i-1, x=i+1, y=j-1 ,z=j+1; w>=0 && x < n && y >=0 && z<m; w--, x++, y--, z++)
                        {
                        	if((grid[i].charAt(y) == 'G')&&(grid[i].charAt(z) == 'G')&&(grid[w].charAt(j) == 'G')
                                    &&(grid[x].charAt(j) == 'G'))
                        	{
                        		//grid[i].setCharAt(y, 'X');
                                //grid[i].setCharAt(z, 'X');
                                //grid[w].setCharAt(j, 'X');
                                //grid[x].setCharAt(j, 'X');
                                plusCounter+=4;
                        	}
                        	else {break;}
                        	
                        }
                    }
                }
        		System.out.println(i+" "+j+" for "+plusCounter);
                arr.add(plusCounter);
            }
        	
        	//for(int j=0;j<n;j++)
        	//{System.out.println(grid[j]);}
        	//System.out.println("");
        }
        Collections.sort(arr);
        System.out.println(arr);
        System.out.println(arr.get(arr.size()-1) * arr.get(arr.size()-2));
        
        scanner.close();
    }
}
