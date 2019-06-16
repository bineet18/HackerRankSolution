package BeautifulBinaryString;

import java.util.Scanner;

public class Code1 {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int n = in.nextInt();
		in.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
		StringBuilder s1 = new StringBuilder(in.nextLine());
		String s2 = "010"; 
		
		int changes = 0;
		while(s1.toString().contains(s2))
		{
			int index = s1.indexOf(s2);
			s1.setCharAt(index+2, '1');
			System.out.println(s1);
			changes++;
		}
		
		System.out.println(changes);
		
		in.close();
	}

}
