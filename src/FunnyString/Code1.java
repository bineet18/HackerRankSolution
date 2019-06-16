package FunnyString;

import java.util.Scanner;

public class Code1 
{
	public static void main(String[] Args)
	{
		Scanner in = new Scanner(System.in);
		
		int q = in.nextInt();
		in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		
		for(int i=0; i<q; i++)
		{
			String a = in.nextLine();
			
			int[] ascii = new int[a.length()];
			int[] revascii = new int[a.length()];
			for(int j=0; j< a.length(); j++)
			{
				ascii[j] = a.charAt(j);
				revascii[a.length() - j - 1] = a.charAt(j);
			}
			int counter = 0;
			for(int j=0; j< a.length()-1; j++)
			{
				int diff1 = Math.abs(ascii[j] - ascii[j+1]);
				int diff2 = Math.abs(revascii[j] - revascii[j+1]);
				if(diff1 == diff2)
				{counter++;}
				else
				{counter = 0; break;}
			}
			
			if(counter == 0)
			{System.out.println("Not Funny");}
			else
			{System.out.println("Funny");}
			
		}
		
		
		in.close();
	}

}
