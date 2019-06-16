package HalloweenSale;

import java.io.*;
import java.util.*;

public class Code1 {
    
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        int p = scanner.nextInt();
        int d = scanner.nextInt();
        int m = scanner.nextInt();
        int s = scanner.nextInt();
        
        int counter = 0;
        int GamePrice = p;
        if(s >= GamePrice)
        {
            s -= GamePrice;// 1st game
            counter++;
            GamePrice = p-d;
        }
        
        while(s - GamePrice >= 0)
        {
            if(GamePrice > m)
            {
                s -= GamePrice;
                GamePrice -= d;
                counter++;
            }
            else if(GamePrice <= m)
            {
                GamePrice = m;
                if(m <= s)
                {
                    s -= GamePrice;
                    counter++;
                }
            }
        }
        
        System.out.println(counter);
        
        scanner.close();
    }
}