package TwoCharacters;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException 
    {
    	Scanner in = new Scanner(System.in); 

        int l = in.nextInt();
        in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = in.nextLine();
        
        char[] a = s.toCharArray();
        HashSet<Character> set = new HashSet<Character>();
        
        for (int i=0; i<l; i++)
        {
            if (!set.contains(a[i]))
            {
                set.add(a[i]);
            }
        }
        
        //System.out.println(set);
        
        int maxLength = 0;
        
        Object[] o = set.toArray();
        
        for(int i=0;i < set.size(); i++)
        {
        	for(int j=i+1; j < set.size(); j++)
        	{
        		String strNew = new String(s);
        		//System.out.println(set.toArray()[i]+" "+set.toArray()[j]+" ");
        		//System.out.print(o[i]+" "+o[j]+" ");
        		for(int k=0;k<set.size();k++)
        		{
        			if(o[k] == o[i] || o[k] == o[j])
        			{continue;}
        			else
        			{
        				//System.out.print("  Removing--> "+ o[k]+ "--->");
        				strNew = new String(strNew.replace(o[k].toString(), ""));
        				//System.out.println(strNew);
        			}
        			
        		}
        		//System.out.println("");
        		
        		//System.out.println(strNew);
        		int counter = 0;
        		for(int k=0;k < (strNew.length()-3); k++)
        		{
        			if((strNew.charAt(k) == strNew.charAt(k+2)) && (strNew.charAt(k+1) == strNew.charAt(k+3)))
        			{counter++;}
        			else
        			{counter = 0; break;}
        		}
        		if(counter!=0)
        		{
        			if(maxLength <= strNew.length())
        			{maxLength = strNew.length();}
        		}
        	}
        }
        if(set.size() == 2)
        {System.out.println(set.size());}
        else
        	System.out.println(maxLength);
        in.close();
    }
}
