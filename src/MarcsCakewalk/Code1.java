package MarcsCakewalk;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<Integer> calorie = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            calorie.add(scanner.nextInt());
        }
        
        long Walk = 0;
        Collections.sort(calorie, Collections.reverseOrder());
        for(int i = 0; i< calorie.size(); i++)
        {
        	Walk += (Math.pow(2, i)*((long)calorie.get(i)));
        }
        System.out.println(Walk);
        
        scanner.close();
    }
}
