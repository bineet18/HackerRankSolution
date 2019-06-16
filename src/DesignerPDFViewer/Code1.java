package DesignerPDFViewer;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Code1 {
    public static void main(String[] args) throws IOException 
    {
    	Scanner in = new Scanner(System.in);        
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int i=0, j=97;i<26;i++, j++)
        {
            int num = in.nextInt();
            //in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");// Need to know the use
            map.put((char)j, num);
        }
        //String word = in.nextLine();
        String word = in.next();// Need to know diff b/w next and nextline
        int[] heights = new int[word.length()];        
        for(int i=0; i< word.length(); i++)
        {
            heights[i] = map.get(word.charAt(i));
        }
        
        Arrays.sort(heights);
        System.out.println(heights[word.length() - 1] * word.length());

        in.close();
    }
}
