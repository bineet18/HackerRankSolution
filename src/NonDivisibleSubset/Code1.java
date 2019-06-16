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

import java.io.*;
import java.util.*;

public class Code1 {

    // Complete the nonDivisibleSubset function below.
    static int nonDivisibleSubset(int k, int[] S) {
        
        List<Integer> sDash = new ArrayList<Integer>();
        List<List<Integer>> sumCollection = new ArrayList<List<Integer>>();
        List<List<Integer>> sumCollection1 = new ArrayList<List<Integer>>();
        List<List<Integer>> sumCount = new ArrayList<List<Integer>>();
        List<Integer> temp = new ArrayList<Integer>();
        
        int counter1 = 1;
        for(int i=0;i< S.length ;i++)
        {
            for(int j = i+1 ; j < S.length ; j++)
            {
                temp = new ArrayList<Integer>();
                temp.add(counter1);
                temp.add(S[i]);
                temp.add(S[j]);
                sumCollection.add(temp);
                counter1++;
            }
        }
        
                        
        for(int i=0;i<sumCollection.size();i++)
        {
            int x = sumCollection.get(i).get(1) + sumCollection.get(i).get(2);
            
            if(((x)%k) != 0)
            {
                sumCollection1.add(sumCollection.get(i));
                sDash.add(sumCollection.get(i).get(1));
                sDash.add(sumCollection.get(i).get(2));
            }
            
        }
    
        Integer[] tem = new Integer[S.length];
        
        for(int i=0;i<S.length;i++)
        {
            tem[i] = Collections.frequency(sDash, S[i]);
        }
        
        int max = Collections.max(Arrays.asList(tem));
        
        for(int i=0;i<S.length;i++)
        {
            temp = new ArrayList<Integer>();
            
            if((Collections.frequency(sDash, S[i]) == max)||(Collections.frequency(sDash, S[i]) == (max-1)))
            {
                temp.add(S[i]);
                temp.add(Collections.frequency(sDash, S[i]));
            
                sumCount.add(temp);
            }
            
        }
        return sumCount.size();


    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] S = new int[n];
        for (int i = 0; i < n; i++) 
        {
            S[i] = scanner.nextInt();
        }

        int result = nonDivisibleSubset(k, S);

        System.out.println(result);
        scanner.close();
    }
}
