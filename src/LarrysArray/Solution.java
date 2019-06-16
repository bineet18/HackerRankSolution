package LarrysArray;

import java.io.*;
import java.util.*;

public class Code2 
{
    public static void main(String[] args) throws IOException 
    {
    	Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        for (int tItr = 0; tItr < t; tItr++) 
        {
            int n = scanner.nextInt();
            int[] a = new int[n];


            for (int i = 0; i < n; i++) 
            {
                a[i] = scanner.nextInt();
            }
            
            for(int i=0;i<n-2;i++)
            {
                int k1=a[i],k2=a[i+1],k3=a[i+2];
                if(k2<k1 && k2<k3)
                {
                    a[i+1]=k3;
                    a[i+2]=k1;
                    a[i]=k2;
                    i=-1;
                }
                else if(k3<k1 && k3<k2)
                {
                    a[i+1]=k1;
                    a[i+2]=k2;
                    a[i]=k3;
                    i=-1;
                }
            }
            if(a[n-3]<a[n-2] && a[n-2]<a[n-1])
                System.out.println("YES");
            else
            	System.out.println("NO");
        }
        scanner.close();
    }

}
