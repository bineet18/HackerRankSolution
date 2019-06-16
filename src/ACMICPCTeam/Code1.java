package ACMICPCTeam;

import java.io.*;
import java.util.*;

public class Code1 
{
	public static void main(String[] args) throws IOException 
	{
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        List<Integer> temp;// = new ArrayList<Integer>();
        List<List<Integer>> Arr = new ArrayList<List<Integer>>();

        for(int i = 0; i < n; i++)
        {
        	temp = new ArrayList<Integer>();
        	String topicItem = scanner.nextLine();
        	for(int j=0; j<topicItem.length(); j++)
            {
            	temp.add(Integer.parseInt(Character.toString(topicItem.charAt(j))));
            }
            Arr.add(temp);
        }
        List<Integer> topicsKnowledge = new ArrayList<Integer>();
        
        for(int i = 0; i < n; i++)
        {
            for(int j=i+1; j<n; j++)
            {
            	int SUM = 0;
            	for(int k = 0; k < m; k++)
            	{
            		SUM += ((Arr.get(i).get(k) + Arr.get(j).get(k)));
            		if(Arr.get(i).get(k) + Arr.get(j).get(k) == 2)
            		{SUM --;}
            	}
            	topicsKnowledge.add(SUM);
            }
            
        }
        System.out.println(Collections.max(topicsKnowledge));
        System.out.println(Collections.frequency(topicsKnowledge, Collections.max(topicsKnowledge)));
        scanner.close();
    }
}
