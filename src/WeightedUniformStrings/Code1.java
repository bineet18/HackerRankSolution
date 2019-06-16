package WeightedUniformStrings;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        int queriesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        HashMap<Integer, String> UString = new HashMap<Integer, String>(); 
        int[] queries = new int[queriesCount];
    	StringBuilder sb = new StringBuilder();        

    	
	    	sb.append(Character.toString(s.charAt(0)));
	    	UString.put(s.charAt(0) - 'a' + 1,  Character.toString(s.charAt(0)));
	    	
	    	for(int i=1;i<s.length();i++)
	        {
	           	if(s.charAt(i) == s.charAt(i-1))
	            	{
	            		sb.append(s.charAt(i));
	            		int weight = (sb.charAt(0) - 'a' + 1) * sb.length();
	            		UString.put(weight,  sb.toString());
	            	}
	            	else
	            	{
	            		sb.setLength(0);
	            		sb.append(Character.toString(s.charAt(i)));
	            		//System.out.println(sb);
	            		UString.put((s.charAt(i) - 'a' + 1), sb.toString());
	            	}
	        }
	    	System.out.println(UString);
	        
        for (int i = 0; i < queriesCount; i++) 
        {
            queries[i] = scanner.nextInt();
            if(UString.containsKey(queries[i]))
            {
            	System.out.println("Yes");
            }
            else
            {System.out.println("No");}
        }
        
        
        
        scanner.close();
    }
}
