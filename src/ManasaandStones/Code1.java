package ManasaandStones;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) 
        {
            int n = scanner.nextInt();
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            
            n=n-1;// Not accounting 0
            
            if(a == b)
            {
                System.out.println(a*n + " ");
                continue;
            }
            
            //make sure a is our min
            int tmp = a;
            a = Math.min(a,b);
            //If b was the min then set it to old value of a
            b = (a == b) ? tmp : b;
            
            int min = a*n;
            int max = b*n;
            
            for(int i = min; i <= max; i += (b-a))
            {
                System.out.print(i + " ");
            }
            System.out.println("");            
        }
        scanner.close();
    }
}
