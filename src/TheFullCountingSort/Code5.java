package TheFullCountingSort;

import java.io.*;
import java.util.*;

public class Code5
{
    public static void main(String[] args) throws IOException 
    {
        File f = new File("C:\\Test1.txt");
        BufferedReader b = new BufferedReader(new FileReader(f));
        
        //Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(b.readLine());
        StringBuilder STDOUTT = new StringBuilder("");
        //b.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String Stringarr = new String();
        String whiteSpace = " ";
        List<String> fixed = Arrays.asList(new String[101]);
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
            
            {
            	if(fixed.get(x) == null)
            	{fixed.set(x,"");}
            	fixed.set(x, fixed.get(x).concat(Stringarr).concat(whiteSpace));
            }
        }

        //System.out.print(STDOUTT);
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        
        //for (int i=0; (i< fixed.size() && fixed.get(i) != null);i++) 
        {
//        	STDOUTT.append(fixed.get(i));
            //System.out.print(fixed.get(i));
        }

        b.close();
    }
}
