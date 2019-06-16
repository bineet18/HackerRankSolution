package MarsExploration;

import java.io.*;
import java.util.*;

public class Code1 {


    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String SOS = "SOS";
        
        int counter = 0;
        
        for(int i=0;i<s.length(); i=i+3)
        {
        	for(int j=0;j<3;j++)
        	{
        		if(SOS.charAt(j) != s.charAt(i+j))
        		{counter++;}
        	}
        }
        System.out.println(counter);
        scanner.close();
    }
}
