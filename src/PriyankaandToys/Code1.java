package PriyankaandToys;

import java.io.*;
import java.util.*;

public class Code1 {
    public static void main(String[] args) throws IOException {
    	Scanner scanner = new Scanner(System.in);
    	int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList<Integer> temp = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> w = new ArrayList<ArrayList<Integer>>();

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt());
        }
        Collections.sort(arr);
        
        int min = arr.get(0);
        int minWeight = min+4;
        
        for(int i=0;i<n;i++)
        {
        	//temp = new ArrayList<Integer>();
        	if(arr.get(i) <= minWeight)
        	{temp.add(arr.get(i));}
        	else
        	{
        		w.add(temp);
        		temp = new ArrayList<Integer>();
        		minWeight = arr.get(i)+4;
        		temp.add(arr.get(i));
        	}
        }
        w.add(temp);
        
        System.out.println(arr);
        System.out.println(w.size());
        scanner.close();
    }
}
