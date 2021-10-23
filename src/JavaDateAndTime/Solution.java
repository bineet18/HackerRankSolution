package JavaDateAndTime;

import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year)
    {        
    	Calendar c = Calendar.getInstance();
    	c.set(year, month-1, day); // Month is 0 based index
    	int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
    	
    	String[] strDayOfWeek = 
    		{"SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
    	
    	return strDayOfWeek[dayOfWeek-1];
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
    	
    	Scanner s = new Scanner(System.in);

        int month = Integer.parseInt(s.next());

        int day = Integer.parseInt(s.next());

        int year = Integer.parseInt(s.next());

        String res = Result.findDay(month, day, year);

        System.out.println(res);


        s.close();
    }
}

