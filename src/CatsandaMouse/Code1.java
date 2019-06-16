package CatsandaMouse;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Code1 {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException 
    {
        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        int catA = 0;
        int catB = 0;
        
        ArrayList<String> resultofEachIteration = new ArrayList<String>();

        for (int qItr = 0; qItr < q; qItr++) 
        {
            String[] xyz = scanner.nextLine().split(" ");
            int x = Integer.parseInt(xyz[0]);
            int y = Integer.parseInt(xyz[1]);
            int z = Integer.parseInt(xyz[2]);

            catA = Math.abs(z-x);
            catB = Math.abs(z-y);
            
            if(catA < catB)
            {resultofEachIteration.add("Cat A");}
            else if(catA > catB)
            {resultofEachIteration.add("Cat B");}
            else
            {resultofEachIteration.add("Mouse C");}
            
        }
        
        for(int i=0; i< resultofEachIteration.size(); i++)
        {
        	System.out.println(resultofEachIteration.get(i));
        }

        scanner.close();
    }
}
