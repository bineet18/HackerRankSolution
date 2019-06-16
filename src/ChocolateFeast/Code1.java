package ChocolateFeast;

import java.io.*;
import java.util.*;

public class Code1 {
	public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int testCase = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < testCase ; tItr++) 
        {
        	int moneyBobbyHas = scanner.nextInt();
            int costOfEachChocolate = scanner.nextInt();
            int minimumWrappersRequired = scanner.nextInt();
            
            int wrappersremaining = 0;
            int chocolatesbought = 0;
            int Totalchocolatesbought = 0;
            int wrappersUsed = 0;
            
            chocolatesbought = moneyBobbyHas / costOfEachChocolate;
            Totalchocolatesbought = chocolatesbought;
            wrappersremaining = chocolatesbought;
            
            // Now the chocolates can only be bought using wrappers
            while(wrappersremaining >= minimumWrappersRequired)
            {
            	wrappersUsed = wrappersremaining / minimumWrappersRequired;
            	wrappersremaining = wrappersremaining % minimumWrappersRequired;
            	chocolatesbought = wrappersUsed;// buys chocolate using wrappers
            	Totalchocolatesbought += chocolatesbought;
            	wrappersremaining += chocolatesbought; //Adds the current chocolate wrappers to existing one
            }
            System.out.println(Totalchocolatesbought);

        }

        scanner.close();
    }
}
