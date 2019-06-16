package TheTimeinWords;

import java.io.*;
import java.util.*;

public class Code1 {


    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        String  minutes[]={" ","one","two","three","four","five","six","seven","eight","Nine","ten",
        		"eleven","twelve","thirteen","fourteen","quarter","sixteen","seventeen","eighteen",
        		"nineteen","twenty", "twenty one", "twenty two","twenty three","twenty four","twenty five",
        		"twenty six", "twenty seven", "twenty eight","twenty nine", "half"};
        String  hours[]={" ","one","two","three","four","five","six","seven","eight","Nine","ten",
        		"eleven","twelve","one"};
        
        
        String hourString = null;
        String minuteString = null;
        String time = null;
        
        if(m <= 30)
        {
        	hourString = hours[h];
        	minuteString = minutes[m];
        	if(m == 0)
        	{time = hourString+ " o' clock";}
        	else if(m == 30 || m == 15)
        	{time = minuteString + " past "+hourString;}
        	else
        	{
        		if(m == 1)
        		{time = minuteString + " minute past " + hourString;}
        		else if(m == 15)
        		{time = minuteString + " past " + hourString;}
        		else
        		{time = minuteString + " minutes past " + hourString;}
        	}
        }
        else
        {
        	hourString = hours[h+1];
        	minuteString = minutes[60-m];
        	if(m == 59)
    		{time = minuteString + " minute to " + hourString;}
        	else if(m == 45)
    		{time = minuteString + " to " + hourString;}
    		else
    		{time = minuteString + " minutes to " + hourString;}
        }
        	
        System.out.println(time);
        

        scanner.close();
    }
}
