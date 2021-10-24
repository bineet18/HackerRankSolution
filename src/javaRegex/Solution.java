package javaRegex;

import java.util.Scanner;

public class Solution{

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
            
            in.close();
        }

    }
}

class MyRegex
{
	String digitPattern = "(\\d{1,2}|(0|1)\\d{2}|2[0-4]\\d|25[0-5])";
	//"([0-9]|[0-9][0-9]|(0|1)[0-9][0-9]|2[0-4][0-9]|25[0-5])"
	String pattern = digitPattern + "\\."+ digitPattern + "\\."+ digitPattern + "\\."+ digitPattern;
}