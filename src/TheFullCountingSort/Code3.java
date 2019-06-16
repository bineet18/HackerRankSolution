package TheFullCountingSort;

import java.io.*;
import java.util.*;

public class Code3 {

    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        
        //Scanner inFile = new Scanner(new FileReader("C:\\Test.txt"));


        File f = new File("C:\\Test1.txt");
        BufferedReader b = new BufferedReader(new FileReader(f));

        int n = Integer.parseInt(b.readLine());
        int[] frequencies = new int[100];
        StringBuilder STDOUTT = new StringBuilder("");
        Map<Integer,Queue<StringBuilder>> order = new HashMap<>();
        
        long startTime = System.nanoTime();
        
        for(int i = 0; i < n; i++)
        {
            String[] tmp = b.readLine().split(" ");

            int num = Integer.parseInt(tmp[0]);
            
            StringBuilder s = new StringBuilder(tmp[1]);
            if(i < n/2) s = new StringBuilder("-");//use - as s for first half
            
            //add the string to the queue associated with num
            if(!order.containsKey(num))
            {
                Queue<StringBuilder> strs = new LinkedList();
                order.put(num, strs);
            }
                order.get(num).add(s);
                
            frequencies[num] = frequencies[num] + 1;
        }
        
        long endTime   = System.nanoTime();
        long totalTime = endTime - startTime;
        System.out.println(totalTime);
        //System.out.print(order);
        //inFile.close();
        
        //For all sorted numbers
        for(int i = 0; i < frequencies.length; i++)
        {
            for(int j = 0; j < frequencies[i]; j++)
            {
                //STDOUTT.append(order.get(i).poll().toString() + " ");//Print every element from the queue
            }
        }
        
        
        //System.out.print(STDOUTT);
        

        
        
        b.close();
        
    }
    
}