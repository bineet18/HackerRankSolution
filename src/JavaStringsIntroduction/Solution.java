package JavaStringsIntroduction;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        
        System.out.println(A.length()+B.length());

        if(A.compareTo(B)>0)
        {System.out.println("Yes");}
        else
        {System.out.println("No");}
        
        A = new StringBuilder(A).replace(0, 1, String.valueOf(Character.toUpperCase(A.charAt(0)))).toString();
        B = new StringBuilder(B).replace(0, 1, String.valueOf(Character.toUpperCase(B.charAt(0)))).toString();
        
        System.out.println(A+" "+B);
        
    }
}
