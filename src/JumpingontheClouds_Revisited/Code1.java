package JumpingontheClouds_Revisited;

import java.io.*;
import java.util.*;

public class Code1
{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] c = new int[n];
        for (int i = 0; i < n; i++) 
        {
            c[i] = scanner.nextInt();
        }
        
        int ThunderCloud = 0;
        int CulmusCloud = 0;
        
        for(int i = 0; i< n; i+=k)
        {
        	if(c[i] == 0)
        	{CulmusCloud++;}
        	else
        	{ThunderCloud++;}
        }

        System.out.println(100 - ((3*ThunderCloud) + CulmusCloud));


        
        scanner.close();
    }
}
