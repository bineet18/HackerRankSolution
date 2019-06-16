/****
 * Its working
 * **/
package TheFullCountingSort;

import java.io.*;
import java.util.*;

public class Code6
{
    public static void main(String[] args) throws IOException 
    {
        List<StringBuilder> fixed = Arrays.asList(new StringBuilder[101]);
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
        //b.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String Stringarr = new String();
        String whiteSpace = " ";
        for (int i = 0; i < n; i++) {
            String[] xs = scanner.nextLine().split(" ");
        	int x = Integer.parseInt(xs[0]);
            String s = xs[1];
            if(i < (n/2))
            {Stringarr = "-";}
            else
            {Stringarr = s;}
           
            {
            	if(fixed.get(x) == null)
            	{
            		StringBuilder initString = new StringBuilder();
            		fixed.set(x, initString);
            		}
            	fixed.set(x, fixed.get(x).append(Stringarr).append(whiteSpace));
            }
        }
        
        for (int i=0; (i< fixed.size() && fixed.get(i) != null);i++) 
        {
            System.out.print(fixed.get(i));
        }
        scanner.close();
    }
}
