package TheFullCountingSort;

import java.io.*;
import java.util.*;

public class Code2
{
    public static void main(String[] args) throws IOException 
    {
        File f = new File("C:\\Test1.txt");
        BufferedReader b = new BufferedReader(new FileReader(f));
        
        //Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(b.readLine());
        //b.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String Stringarr = new String();
        
        HashMap<Integer, String> ArrCounter = new HashMap<Integer, String>();
        long startTime = System.nanoTime();///////////////////////////////////////////////////////////////////
        for (int i = 0; i < n; i++) {
            //String[] xs = scanner.nextLine().split(" ");
        	String[] xs = b.readLine().split(" ");
            int x = Integer.parseInt(xs[0]);
            String s = xs[1];
            if(i < (n/2))
            {Stringarr = "-";}
            else
            {Stringarr = s;}
            
            if(!ArrCounter.containsKey(x))
            {
            	ArrCounter.put(x, Stringarr);
            }
            else
            {
            	ArrCounter.put(x, ArrCounter.get(x)+" "+Stringarr);
            }
        }
        

        Object[] O = ArrCounter.keySet().toArray();
       
        
        for (int i=0; i< O.length;i++) 
        {
            //System.out.print(ArrCounter.get(O[i]) + " ");
        }
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        //scanner.close();
        b.close();
    }
}
