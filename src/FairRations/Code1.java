package FairRations;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        
        int sum = 0;
        int bread = 0;

        for(int i=0; i < N; i++){
            sum += scanner.nextInt();
                    
            if (sum % 2 == 1) {
            	bread += 2;
            }
        }

        if(sum%2 == 0)
        System.out.println(bread);
        else
        System.out.println("NO");
        	

        scanner.close();
    }
}
