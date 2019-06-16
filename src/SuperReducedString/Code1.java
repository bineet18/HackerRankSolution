package SuperReducedString;

import java.util.Scanner;
import java.util.Stack;

public class Code1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        scan.close();
        
        Stack<Character> superReducedStack = new Stack<>();
        for (int i = 0; i < str.length(); i++) 
        {
            Character ch = str.charAt(i);
            if (!superReducedStack.isEmpty() && ch == superReducedStack.peek()) 
            {
            	superReducedStack.pop();
            } 
            else 
            {
            	superReducedStack.push(ch);
            }
        }
        
        /* Print final result */
        if (superReducedStack.isEmpty()) 
        {
            System.out.println("Empty String");
        } 
        else 
        {
            for (char ch : superReducedStack) 
            {
                System.out.print(ch);
            }
        }
    }
}