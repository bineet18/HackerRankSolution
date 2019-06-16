package CountingValleys;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Code1 
{

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String s = scanner.nextLine();
        
        int SUM = 0;
        int Altitude = 0;
        int counter = 0;
        
        List<Integer> path = new ArrayList<Integer>();
        
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i) == 'D')
            {Altitude = -1;}
            else if(s.charAt(i) == 'U')
            {Altitude = 1;}
            
            SUM += Altitude;
            path.add(SUM);
           }
        
                
        for(int i = 0; i< path.size();i++)
        {
            if((path.get(i) == 0) && (path.get(i-1) == -1))
            {counter++;}
        }
        
        System.out.println(counter);
        
        
        
        //int result = countingValleys(n, s);

        
        scanner.close();
    }
}

