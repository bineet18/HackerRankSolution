package SavethePrisoner;

import java.util.*;

public class Code1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        for(int i = 0; i < t; i++)
        {
            int n = scanner.nextInt();//Number of prisoners
            int m = scanner.nextInt();//Number of sweets
            int s = scanner.nextInt();//First prisoner to be served
            
            int awefulSeat = (s + m - 1) % n;
            if(awefulSeat == 0){awefulSeat=n;}
            System.out.println(awefulSeat);
        }
        scanner.close();
    }
}