package StrongPassword;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class Code1 {
        public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String password = scanner.nextLine();
        
        int counter = 0;
        String numbers = "[0123456789]";
        String lower_case = "[abcdefghijklmnopqrstuvwxyz]";
        String upper_case = "[ABCDEFGHIJKLMNOPQRSTUVWXYZ]";
        //String special_characters = "[!@#$%^&*()-+]";
        String special_characters = "[^a-z0-9 ]";
        
        Pattern pnum = Pattern.compile(numbers);
        if(pnum.matcher(password).find())
        {counter++;}
        
        Pattern plcase = Pattern.compile(lower_case);
        if(plcase.matcher(password).find())
        {counter++;}
        
        Pattern pupCase = Pattern.compile(upper_case);
        if(pupCase.matcher(password).find())
        {counter++;}
        
        Pattern pSc = Pattern.compile(special_characters, Pattern.CASE_INSENSITIVE);
        if(pSc.matcher(password).find())
        {counter++;}
        
        
        int charNeeded = 0;
        if(password.length() < 6 && (counter < 4))
        {charNeeded = Math.max((4-counter) , (6 - password.length()));}
        else if(password.length() >= 6 && counter < 4)
        {charNeeded = 4- counter;}
        else if((password.length() + counter) < 6)
        {charNeeded = 6 - password.length() - (4 - counter);}
        else if(password.length() < 6 && (counter == 4))
        {charNeeded = 6-password.length();}
        System.out.println(charNeeded);
        scanner.close();
    }
}
