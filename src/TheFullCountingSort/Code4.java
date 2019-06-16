package TheFullCountingSort;

import java.io.*;
import java.util.*;

public class Code4
{
    public static void main(String[] args) throws IOException 
    {
        File f = new File("C:\\Test1.txt");
        BufferedReader b = new BufferedReader(new FileReader(f));
        
        //Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(b.readLine());
        //b.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String Stringarr = new String();
        String whiteSpace = " ";
        Map<Integer,Queue<StringBuilder>> ArrCounter = new HashMap<>();
        long startTime = System.nanoTime();///////////////////////////////////////////////////////////////////
        for (int i = 0; i < n; i++) {
            //String[] xs = scanner.nextLine().split(" ");
        	String[] xs = b.readLine().split(" ");
            int x = Integer.parseInt(xs[0]);
            StringBuilder s = new StringBuilder(xs[1]);
            if(i < n/2) s = new StringBuilder("-");//use - as s for first half
            
            if(!ArrCounter.containsKey(x))
            {
            	Queue<StringBuilder> strs = new LinkedList();
            	ArrCounter.put(x, strs);
            }
            else
            {

            	ArrCounter.get(x).add(s);
            }
        }
        
        //System.out.print(ArrCounter);

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
