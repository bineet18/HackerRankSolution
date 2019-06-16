package SherlockandArray;

import java.io.*;
import java.util.*;

public class Code3
{
    public static void main(String[] args) throws IOException 
    {
        Scanner in = new Scanner(System.in);
        
        int T = in.nextInt();
        
        for(int i=0;i<T;i++)
        {
            int n = in.nextInt();
            int totalSum = 0;
            int sumFrom1st = 0;
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for(int j=0;j<n;j++)
            {
                int element = in.nextInt();
                arr.add(element);
                totalSum += element;
                if(j !=0)
                {sumFrom1st += element;}
            }
            int result = 0;
            if(n == 1)
            {System.out.println("YES"); continue;}
            if(sumFrom1st == 0)
            {System.out.println("YES"); continue;}
            int leftSum = 0;
            int rightSum =0;
            
            for(int j=1; j<n;j++)
            {
                leftSum += arr.get(j-1);  
                
                rightSum = totalSum - leftSum - arr.get(j);
                
                if(leftSum == rightSum)
                {result = 1; break;}
                
            }
            
            if(result == 1)
            {System.out.println("YES");}
            else if(result == 0)
            {System.out.println("NO");}
        }
    in.close();
    }
}
