

package AppendandDelete;

import java.io.*;
import java.util.*;

public class Code1 
{
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
		String s = scanner.nextLine();
        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        int size = (s.length() >= t.length())? t.length():s.length();
        int sameChar = 1;
        
        for(int i=1;i<size; i++)// Assuming 1st char is same
        {
        	if(s.charAt(0) != t.charAt(0))
        	{sameChar = 0; break;}
        	else if(s.charAt(i) != t.charAt(i))
        	{
        		sameChar = i;
        		break;
        	}
        	else
        	{sameChar++;}
        }
        
        //int NoOfChangestoCharRequired = s.length() - sameChar;
        int NoOfChangestoCharRequired = (t.length() >= s.length())? (t.length() - sameChar):(s.length() - sameChar);
        int AppendChar;
        int DeleteChar;
        
        System.out.println(NoOfChangestoCharRequired);
        System.out.println(sameChar);
        
        if((t.length() == s.length()) && (sameChar == t.length()))
        {
        	DeleteChar = k/2;
        	AppendChar = k/2;
        }
        else if(sameChar == t.length())
        {
        	DeleteChar = NoOfChangestoCharRequired;
        	AppendChar = 0;
        }
        else
        {
        	DeleteChar = NoOfChangestoCharRequired;
        	AppendChar = t.length() - sameChar;
        }
        
        if(k == (DeleteChar+AppendChar))
        {System.out.println("Yes");}
        else
        {System.out.println("No");}
        
        scanner.close();
    }
}
