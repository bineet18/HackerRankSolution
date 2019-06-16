package QueensAttackII;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int r_q = scanner.nextInt();
        int c_q = scanner.nextInt();

        int[][] obstacles = new int[k][2];

        int possibleUp = n-r_q;
        int possibleDown = r_q-1;
        int possibleRight = n-c_q;
        int possibleLeft = c_q-1;
        int possibled1Top = Math.min(n- r_q, c_q-1);
        int possibled1Bottom = Math.min(n-c_q, r_q-1);
        int possibled2Top = Math.min(n-r_q, n-c_q);
        int possibled2Bottom = Math.min(r_q-1, c_q-1);
        
        System.out.println(possibleUp);
        System.out.println(possibleDown);
        System.out.println(possibleRight);
        System.out.println(possibleLeft);
        System.out.println(possibled1Top);
        System.out.println(possibled1Bottom);
        System.out.println(possibled2Top);
        System.out.println(possibled2Bottom);
        
        for (int i = 0; i < k; i++) 
        {
        	obstacles[i][0] = scanner.nextInt();
        	obstacles[i][1] = scanner.nextInt();
        	
        	possibleUp = Math.min(((n - obstacles[i][0]) - (n - r_q)  - 1) , possibleUp);
        	possibleDown = Math.min(((r_q - 1) - (obstacles[i][0] - 1) - 1) , possibleDown);
        	possibleRight = Math.min(((n - obstacles[i][1]) - (n - c_q) - 1) , possibleRight);
        	possibleLeft =  Math.min(((c_q - 1) - (obstacles[i][1] - 1) - 1) , possibleLeft);
        	
        	possibled1Top = Math.min(Math.min(((n - obstacles[i][0]) - (n - r_q) - 1), 
        			((obstacles[i][1] - 1) - (c_q - 1) - 1)),possibled1Top);
        	
        	possibled1Bottom = Math.min(Math.min(((n - c_q) - (n - obstacles[i][1]) - 1), 
        			((r_q - 1) - (obstacles[i][0] - 1) - 1)),possibled1Bottom);
        	
        	possibled2Top = Math.min(Math.min(( (n - obstacles[i][0]) - (n - r_q) - 1) , 
        			((n - c_q) - (n - obstacles[i][1]) - 1)), possibled2Top);
        	
        	possibled2Bottom = Math.min(Math.min(((r_q - 1) - (obstacles[i][0] - 1) - 1), 
        			((c_q - 1) - (obstacles[i][1] - 1) - 1)),possibled2Bottom);
        	
        	System.out.print(possibleUp+" ");
            System.out.print(possibleDown+" ");
            System.out.print(possibleRight+" ");
            System.out.print(possibleLeft+" ");
            System.out.print(possibled1Top+" ");
            System.out.print(possibled1Bottom+" ");
            System.out.print(possibled2Top+" ");
            System.out.print(possibled2Bottom+" ");
            
            System.out.println("");
        }
        
        int Totalmoves = possibleUp + possibleDown + possibleRight + possibleLeft + possibled1Top + possibled1Bottom
        		+ possibled2Top + possibled2Bottom;
        
        System.out.println(Totalmoves);

        scanner.close();
    }
}
