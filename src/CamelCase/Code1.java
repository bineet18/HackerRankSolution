package CamelCase;

import java.io.*;
import java.util.*;

public class Code1 {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        int counter = 0;
        for(int i=0; i<s.length(); i++)
        {
        	Character a = s.charAt(i);
        	if(Character.isUpperCase(a))
        	{counter++;}
        }
        
        System.out.println(counter+1);
        
        scanner.close();
    }
}
