
package NonDivisibleSubset;

import java.io.*;
import java.util.*;

public class Code3 {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] S = new int[n];
        for (int i = 0; i < n; i++) 
        {
            S[i] = scanner.nextInt();
        }
        
        Map<Integer,Integer> NonDivisibleSet = new HashMap<>();
        Map<Integer,Integer> DivisibleSet = new HashMap<>();

        int maxFrequency = 0;
        for(int i=0;i<n;i++)
        {
        	for(int j=i+1;j <n; j++)
        	{
        		//System.out.println(S[i] + " + " + S[j]+ " = "+(S[i]+S[j]));
        		if((S[i]+S[j])%k !=0)
        		{
        			//System.out.println(S[i] + " + " + S[j]+ " = "+(S[i]+S[j]));
        			
        			/*if(NonDivisibleSet.containsKey(S[i]))
                    	NonDivisibleSet.put(S[i], NonDivisibleSet.get(S[i])+1);
                    else
                    	NonDivisibleSet.put(S[i], 1);
        			*/
                    if(NonDivisibleSet.containsKey(S[j]))
                    	NonDivisibleSet.put(S[j], NonDivisibleSet.get(S[j])+1);
                    else
                    	NonDivisibleSet.put(S[j], 1);
               	}
        		if((NonDivisibleSet.get(S[j]) != null) && (maxFrequency < NonDivisibleSet.get(S[j])))
                {maxFrequency = NonDivisibleSet.get(S[j]);}
        	}
        }
        
        int counter = 0;
        for(int i=0; i< n; i++)
        {
        	if((NonDivisibleSet.get(S[i]) != null) && (NonDivisibleSet.get(S[i]) == maxFrequency))
        	{counter++;}
        }

        System.out.println(counter);
        
        scanner.close();
    }
}
