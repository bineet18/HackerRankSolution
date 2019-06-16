package StrangeCounter;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	long t = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        long set = (long) (Math.log10((t+2)/3) / (Math.log10(2)));
        long startValue = (long) (3 * Math.pow(2, (long)set) - 2);
        long TimeAtStartValue = startValue + 2;
        long TimeAtT = TimeAtStartValue - (t-startValue);
        System.out.println(TimeAtT);
        scanner.close();
    }
}
