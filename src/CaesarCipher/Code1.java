package CaesarCipher;

import java.util.*;

public class Code1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        String s = input.nextLine();
        int k = input.nextInt() % 26;
        StringBuilder output = new StringBuilder("");
        
        for(char eachChar : s.toCharArray())
        {
            if(eachChar > 64 && eachChar < 91)//UpperCase Character
            {
                char encry = (char) (eachChar+k);
                if(encry > 90)
                {
                    encry = (char) ((encry % 90) + 64);
                }
                output.append(encry);
            }
            else if(eachChar > 96 && eachChar < 123)//LowerCase Character
            {
                char encry = (char) (eachChar+k);
                if(encry > 122)
                {
                    encry = (char) ((encry % 122) + 96);
                }
                output.append(encry);
            }
            else//Symbol
            {
                output.append(eachChar);
            }
        }
        System.out.println(output);
        input.close();
        
    }
}