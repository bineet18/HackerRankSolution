package javaStringTokens;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        
        String regularExpression = "[ !,?._'@]+";
        
        ArrayList<String> splitString = new ArrayList(Arrays.asList(s.split(regularExpression)));

        
        for(int i = 0; i<splitString.size(); i++)
        {
        	if(splitString.get(i).length() == 0)
        	{splitString.remove(i);}
        }
        
        System.out.println(splitString.size());
        
        for(int i = 0; i<splitString.size(); i++)
        {
        	System.out.println(splitString.get(i));
        }
        scan.close();
    }
}