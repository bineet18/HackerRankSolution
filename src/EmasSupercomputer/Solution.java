package EmasSupercomputer;

import java.io.*;
import java.util.*;

public class Solution {
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
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> arr1 = new ArrayList<ArrayList<Integer>>(); 
        ArrayList<ArrayList<ArrayList<Integer>>> arr2 = new ArrayList<ArrayList<ArrayList<Integer>>>();
                
        for(int i=1; i<n-1; i++)
        {

            for(int j=1; j<m-1;j++)
            {
                int plusCounter = 0;
                if(grid[i].charAt(j) == 'G')
                {
                    arr1 = new ArrayList<ArrayList<Integer>>();
                    plusCounter+=1;
                    
                    temp = new ArrayList<Integer>();
                    temp.add(i);
                    temp.add(j);
                    arr1.add(temp);
                    
                    if((grid[i].charAt(j-1) == 'G')&&(grid[i].charAt(j+1) == 'G')&&(grid[i-1].charAt(j) == 'G')
                            &&(grid[i+1].charAt(j) == 'G'))
                    {
                        for(int w=i-1, x=i+1, y=j-1 ,z=j+1; w>=0 && x < n && y >=0 && z<m; w--, x++, y--, z++)
                        {
                            if((grid[i].charAt(y) == 'G')&&(grid[i].charAt(z) == 'G')&&(grid[w].charAt(j) == 'G')
                                    &&(grid[x].charAt(j) == 'G'))
                            {
                                arr1 = new ArrayList<ArrayList<Integer>>(arr1);
                                temp = new ArrayList<Integer>();
                                temp.add(i);
                                temp.add(y);
                                arr1.add(temp);
                                
                                temp = new ArrayList<Integer>();
                                temp.add(i);
                                temp.add(z);
                                arr1.add(temp);
                                
                                temp = new ArrayList<Integer>();
                                temp.add(w);
                                temp.add(j);
                                arr1.add(temp);
                                
                                temp = new ArrayList<Integer>();
                                temp.add(x);
                                temp.add(j);
                                arr1.add(temp);
                                
                                plusCounter+=4;

                                arr.add(plusCounter);
                                arr2.add(arr1);

                            }
                            else {break;}
                            
                        }
                    }
                    arr.add(plusCounter);
                    arr2.add(arr1);
                }
            }
        }
        
        ArrayList<Integer> arr3 = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> arr4 = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> arr5 = new ArrayList<ArrayList<Integer>>();
        
        for(int i=0;i<arr.size();i++)
        {
            for(int j=i+1;j<arr.size();j++)
            {

                arr4 = new ArrayList<ArrayList<Integer>>(arr2.get(i));
                arr5 = new ArrayList<ArrayList<Integer>>(arr2.get(j));

                arr4.retainAll(arr5);
                if(arr4.size() == 0)
                {
                    arr3.add(arr.get(i) * arr.get(j));
                }
            }
        }
        System.out.println(Collections.max(arr3));
        scanner.close();
    }
}
