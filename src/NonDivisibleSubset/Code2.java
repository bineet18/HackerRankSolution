/*
 * 
Given a set of distinct integers, print the size of a maximal subset of  where the sum of any  numbers in  is not evenly divisible by .

Input Format

The first line contains  space-separated integers,  and , the number of values in  and the non factor. 
The second line contains  space-separated integers describing , the unique values of the set.

Constraints

All of the given numbers are distinct.
Output Format

Print the size of the largest possible subset ().

Sample Input

4 3
1 7 2 4
Sample Output

3
Explanation

The sums of all permutations of two elements from  are:

1 + 7 = 8
1 + 2 = 3
1 + 4 = 5
7 + 2 = 9
7 + 4 = 11
2 + 4 = 6
We see that only  will not ever sum to a multiple of .
 * 
 */




package NonDivisibleSubset;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Code2 {

    // Complete the nonDivisibleSubset function below.
    static int nonDivisibleSubset(int k, int[] S) {
    	int counter = 0;
    	
    	List<Integer> sDash = new ArrayList<Integer>();
    	List<List<Integer>> sumCollection = new ArrayList<List<Integer>>();
    	List<Integer> temp = new ArrayList<Integer>();
    	
    	int counter1 = 1;
    	for(int i=0;i< S.length ;i++)
    	{
    		for(int j = i+1 ; j < S.length ; j++)
    		{
    			//temp = new ArrayList<Integer>();

    			//counter1++;
    			if(((S[i]+S[j])%k) != 0)
    			{
    				temp = new ArrayList<Integer>();
    				temp.add(S[i]);
    				temp.add(S[j]);
    				
    				sumCollection.add(temp);
    				
    			}
    		}
    	}
    	
    	System.out.println(sumCollection);

    	
    	Object[] SD = sDash.stream().distinct().toArray();
    	
    	for(int i=0;i<SD.length;i++)
    	{
    		System.out.println(SD[i]);
    	}
    	
    	System.out.println(SD.length);
    	
		return SD.length;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        /*BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] S = new int[n];

        String[] SItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int SItem = Integer.parseInt(SItems[i]);
            S[i] = SItem;
        }
        
        
*/
    	//int[] S = {1,7,2,4};
    	int[] S = {422346306, 940894801, 696810740, 862741861, 85835055, 313720373};
        //int result = nonDivisibleSubset(3, S);
        int result = nonDivisibleSubset(9, S);
        
        System.out.println(result);
/*
        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
        */	
    }
}
