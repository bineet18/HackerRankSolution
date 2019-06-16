package LuckBalance;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] L = new int[n];
        int[] T = new int[n];
        ArrayList<Integer> Luck = new ArrayList<Integer>();
        int luckFromlosing = 0;

        for (int i = 0; i < n; i++) 
        {
        	L[i] = scanner.nextInt();
        	T[i] = scanner.nextInt();
        	int a = L[i]*T[i];
        	if(a != 0)
        	{Luck.add(a);}
        	else
        	{luckFromlosing += L[i];}
        }
        
        System.out.println(luckFromlosing);
        Collections.sort(Luck);
        System.out.println(Luck);
        int luckFromWinning = 0;
        for(int i=0; i < Luck.size();i++)
        {
        	if(i>= (Luck.size()-k))
        	{luckFromlosing+= Luck.get(i);}
        	else
        	{luckFromWinning+=Luck.get(i);}
        }

        System.out.println(luckFromlosing-luckFromWinning);
        scanner.close();
    }
}
